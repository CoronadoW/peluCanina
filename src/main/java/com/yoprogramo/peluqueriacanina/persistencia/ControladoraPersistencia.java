package com.yoprogramo.peluqueriacanina.persistencia;

import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    MascotaJpaController mascotaControl = new MascotaJpaController();
    DuenioJpaController duenioControl = new DuenioJpaController();

    //Metodos Mascota
    public void crearMascota(Mascota mascota) {
        mascotaControl.create(mascota);
    }

    public void borrarMascota(int id) {
        try {
            mascotaControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMascota(Mascota edMasco) {
        try {
            mascotaControl.edit(edMasco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traeMascota(int id) {
        return mascotaControl.findMascota(id);
    }

    public List<Mascota> traeListaMascotas() {
        return mascotaControl.findMascotaEntities();
    }

    //Metodos Duenio
    public void crearDuenio(Duenio duenio) {
        duenioControl.create(duenio);
    }

    public void borrarDuenio(int id) {
        try {
            duenioControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarDuenio(Duenio edDuen) {
        try {
            duenioControl.edit(edDuen);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traeDuenio(int id) {
        return duenioControl.findDuenio(id);
    }

    public List<Duenio> traeListaDuenios() {
        return duenioControl.findDuenioEntities();
    }

    public void guardar(Duenio duenio, Mascota masco) {
        duenioControl.create(duenio);
        mascotaControl.create(masco);
    }

    

}
