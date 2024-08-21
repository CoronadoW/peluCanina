package com.yoprogramo.peluqueriacanina.logica;

import com.yoprogramo.peluqueriacanina.igu.AgregarClienteADuenio;
import com.yoprogramo.peluqueriacanina.igu.VerDuenio;
import com.yoprogramo.peluqueriacanina.persistencia.ControladoraPersistencia;

import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis;
    Utility utility;
    AgregarClienteADuenio agregarCliente;
    int dniDuen;
    Duenio duenio = null;

    public Controladora(ControladoraPersistencia controlPersis, Utility utility) {
        this.controlPersis = controlPersis;
        this.utility = utility;

    }

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
            }else{
                System.out.println("El nomCliente es : " + nomCliente);
            }
        }
        if (numCliente != -1) {
            cliente = controlPersis.traeMascota(numCliente);
        }
        
        return cliente;
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

    //Metodos en comun
    public void guardar(String nombMasco, String raza, String color, String observa, String alergico, String ateEspe,
            String nombreDuen, String numTelDuen, int dniDuen, String direDuen) {

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

        List<Duenio> listaDuenios = controlPersis.traeListaDuenios();
        boolean isDniDuenio = false;
        Duenio duenioExist = null;

        for (Duenio duen : listaDuenios) {
            if (duen.getDni() == dniDuen) {
                isDniDuenio = true;
                duenioExist = duen;
                break;
            }
        }
        if (isDniDuenio == true) {
            utility.mostrarMensaje("Duenio ya existente con ese dni", "Error", "Cargado incorrecto");
            mandarDuenioAVerDuenio(dniDuen, duenioExist);
        }
        if (isDniDuenio == false) {
            controlPersis.guardar(duenio, masco);
            utility.mostrarMensaje("Cliente cargado correctamente", "Info", "Carga de Cliente");
            int idDuen = duenio.getIdDuenio();
            Duenio duen = controlPersis.traeDuenio(idDuen);
            mandarDuenioAVerDuenio(dniDuen, duen);
        }
    }

    public void editar(Mascota edMasco, Duenio edDuenio) {
        controlPersis.editarMascota(edMasco);
        controlPersis.editarDuenio(edDuenio);
    }

    //Traigo un Duenio con el dni
    public Duenio traeDuenioDni(int dniCliente) {
        //public Duenio traeDuenioDni(Integer dniCliente) {        
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

    //Metodo agregarCliente recibiendo todos las variables (campos de verDuenio) y realizando la logica 
    public void addCliente(String nombMasco, String raza, String color, String observa, String alergico, String ateEspe,
            String nombreDuen, String numTelDuen, int dniDuen, String direDuen) {
        //Traigo la lista de duenio de la base de datos con el jpa, y se la asigno a la listaDuenios
        List<Duenio> listaDuenios = controlPersis.traeListaDuenios();
        boolean isDniDuenio = false;
        Duenio duenio = null;

        //Comparo el dniDuen con los dni de los duen, si es igual le asigno ese duen a duenio, para luego asignarselo a la mascota y crear la nueva mascota con un duenio ya existente
        for (Duenio duen : listaDuenios) {
            if (duen.getDni() == dniDuen) {
                isDniDuenio = true;
                duenio = duen;
                break;
            }
        }
        if (isDniDuenio == false) {
            utility.mostrarMensaje("No se encontró duenio con ese dni", "Error", "Error al cargar DNI");
        } else {
            if (nombMasco == null || nombMasco.trim().isEmpty()
                    || raza == null || raza.trim().isEmpty()
                    || color == null || color.trim().isEmpty()
                    || alergico == null || alergico.trim().isEmpty()
                    || ateEspe == null || ateEspe.trim().isEmpty()) {
                utility.mostrarMensaje("Todos los campos son obligatorios", "Error", "Error al cargar datos");
            } else {
                Mascota mascotita = new Mascota();
                mascotita.setNombrePerro(nombMasco);
                mascotita.setRaza(raza);
                mascotita.setColor(color);
                mascotita.setObservaciones(observa);
                mascotita.setAlergico(alergico);
                mascotita.setAtencionEspecial(ateEspe);
                mascotita.setDuenio(duenio);
                controlPersis.crearMascota(mascotita);
                utility.mostrarMensaje("Mascota agregada correctamente", "Info", "Agregado de mascota");
                //Traigo al duenio de la mascota creada recientemente
                Duenio duenioExist = mascotita.getDuenio();
                mandarDuenioAVerDuenio(dniDuen, duenioExist);
            }
        }
    }

    
    public void mandarDuenioAVerDuenio(int dniDuen, Duenio duen) {
        VerDuenio verDuenio = new VerDuenio(this, utility, dniDuen, duen);
        verDuenio.setVisible(true);
        verDuenio.setLocationRelativeTo(null);
        verDuenio.cargarDuenioyTabla(duen);

    }

    //Agrego la intancia agregarCliente manualmente
    public void setAgregarCliente(AgregarClienteADuenio agregarCliente) {
        this.agregarCliente = agregarCliente;
    }
}
