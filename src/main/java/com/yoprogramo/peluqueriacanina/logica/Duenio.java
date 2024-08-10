
package com.yoprogramo.peluqueriacanina.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idDuenio;
    @Basic
    public int dni;
    public String nombreDuenio;
    public String numeroTelefono;
    public String direccion;    
    @OneToMany (mappedBy = "duenio")
    public List<Mascota> listaMascotas;

    public Duenio() {
    }

    public Duenio(int idDuenio, int dni, String nombreDuenio, String numeroTelefono, String direccion, List<Mascota> listaMascotas) {
        this.idDuenio = idDuenio;
        this.dni = dni;
        this.nombreDuenio = nombreDuenio;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.listaMascotas = listaMascotas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }    

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @Override
    public String toString() {
        return "Duenio{" + "idDuenio=" + idDuenio + ", nombreDuenio=" + nombreDuenio + ", numeroTelefono=" + numeroTelefono + ", direccion=" + direccion + ", listaMascotas=" + listaMascotas + '}';
    }
    
    
}
