package com.yoprogramo.peluqueriacanina.logica;
import com.yoprogramo.peluqueriacanina.persistencia.ControladoraPersistencia;

import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    //Metodos Mascotas
    public void crearMascota(Mascota mascota) {
        controlPersis.crearMascota(mascota);
    }

    public void borrarMascota(int id) {
        controlPersis.borrarMascota(id);
    }

    public void editarMascota(Mascota edMasco) {
        controlPersis.editarMascota(edMasco);
    }

    public Mascota traeMascota(int id) {
        return controlPersis.traeMascota(id);
    }

    public Mascota traeMascoNom(String nomCliente) {
        List<Mascota> listaMasco = controlPersis.traeListaMascotas();
        int numCliente = -1;
        Mascota cliente = null;

        for (Mascota masco : listaMasco) {
            if (masco.getNombrePerro().equalsIgnoreCase(nomCliente)) {
                numCliente = masco.getNumeroCliente();
                break;
            }
        }
        if (numCliente != -1) {
            cliente = controlPersis.traeMascota(numCliente);
        }
        return cliente;
        /*
        List<Mascota> listaMasco = controlPersis.traeListaMascotas();

        return listaMasco.stream()
                         .filter(masco -> masco.getNombrePerro().equalsIgnoreCase(nomCliente))
                         .findFirst()
                         .orElse(null);
        */
    }

    public List<Mascota> traeListaMascotas() {
        return controlPersis.traeListaMascotas();
    }
    
    

    //Metodos Duenio
    public void crearDuenio(Duenio duenio) {
        controlPersis.crearDuenio(duenio);
    }

    public void borrarDuenio(int id) {
        controlPersis.borrarDuenio(id);
    }

    public void editarDuenio(Duenio edDuen) {
        controlPersis.editarDuenio(edDuen);
    }

    public Duenio traeDuenio(int id) {
        return controlPersis.traeDuenio(id);
    }

    public List<Duenio> treaeListaDuenios() {
        return controlPersis.traeListaDuenios();
    }

    public void guardar(String nombMasco, String raza, String color, String observa, String alergico, String ateEspe, String nombreDuen, String numTelDuen, int dniDuen, String direDuen) {

        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nombreDuen);
        duenio.setNumeroTelefono(numTelDuen);
        duenio.setDni(dniDuen);
        duenio.setDireccion(direDuen);

        Mascota masco = new Mascota();
        masco.setNombrePerro(nombMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observa);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(ateEspe);
        masco.setDuenio(duenio);

        controlPersis.guardar(duenio, masco);       
    }

    public void editar(Mascota edMasco, Duenio edDuenio) {
        controlPersis.editarMascota(edMasco);
        controlPersis.editarDuenio(edDuenio);
    }

    public Duenio traeDuenioDni(int dniCliente) {
        List<Duenio> listaDuenios = controlPersis.traeListaDuenios();
        int idDuenio = -1;
        Duenio due = null;

        for (Duenio duenio : listaDuenios) {
            if (duenio.getDni() == dniCliente) {
                idDuenio = duenio.getIdDuenio();
            }
        }
        if (idDuenio != -1) {
            due = controlPersis.traeDuenio(idDuenio);
        }
        return due;
    }
    
    public void agregarCliente(String nombMasco, String raza, String color, String observa, String alergico, String ateEspe, Duenio duenio){
        Mascota mascotita = new Mascota();
        mascotita.setNombrePerro(nombMasco);
        mascotita.setRaza(raza);
        mascotita.setColor(color);
        mascotita.setObservaciones(observa);
        mascotita.setAlergico(alergico);
        mascotita.setAtencionEspecial(ateEspe);
        mascotita.setDuenio(duenio);
        controlPersis.crearMascota(mascotita);
    }

    

}
