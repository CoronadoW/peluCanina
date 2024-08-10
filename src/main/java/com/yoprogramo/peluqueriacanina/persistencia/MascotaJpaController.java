
package com.yoprogramo.peluqueriacanina.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MascotaJpaController implements Serializable {

    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public MascotaJpaController(){
        emf = Persistence.createEntityManagerFactory("peluCaninaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mascota mascota) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio = mascota.getDuenio();
            if (duenio != null) {
                duenio = em.getReference(duenio.getClass(), duenio.getIdDuenio());
                mascota.setDuenio(duenio);
            }
            em.persist(mascota);
            if (duenio != null) {
                duenio.getListaMascotas().add(mascota);
                duenio = em.merge(duenio);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mascota mascota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota persistentMascota = em.find(Mascota.class, mascota.getNumeroCliente());
            Duenio duenioOld = persistentMascota.getDuenio();
            Duenio duenioNew = mascota.getDuenio();
            if (duenioNew != null) {
                duenioNew = em.getReference(duenioNew.getClass(), duenioNew.getIdDuenio());
                mascota.setDuenio(duenioNew);
            }
            mascota = em.merge(mascota);
            if (duenioOld != null && !duenioOld.equals(duenioNew)) {
                duenioOld.getListaMascotas().remove(mascota);
                duenioOld = em.merge(duenioOld);
            }
            if (duenioNew != null && !duenioNew.equals(duenioOld)) {
                duenioNew.getListaMascotas().add(mascota);
                duenioNew = em.merge(duenioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mascota.getNumeroCliente();
                if (findMascota(id) == null) {
                    throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota;
            try {
                mascota = em.getReference(Mascota.class, id);
                mascota.getNumeroCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.", enfe);
            }
            Duenio duenio = mascota.getDuenio();
            if (duenio != null) {
                duenio.getListaMascotas().remove(mascota);
                duenio = em.merge(duenio);
            }
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mascota> findMascotaEntities() {
        return findMascotaEntities(true, -1, -1);
    }

    public List<Mascota> findMascotaEntities(int maxResults, int firstResult) {
        return findMascotaEntities(false, maxResults, firstResult);
    }

    private List<Mascota> findMascotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mascota.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascota.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mascota> rt = cq.from(Mascota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    
    
}
