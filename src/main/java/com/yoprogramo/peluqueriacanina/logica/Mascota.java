package com.yoprogramo.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int numeroCliente;

    @Basic
    public String nombrePerro;
    public String raza;
    public String color;
    public String alergico;
    public String atencionEspecial;
    public String observaciones;
    @ManyToOne
    public Duenio duenio;

    public Mascota() {
    }

    public Mascota(int numeroCliente, String nombrePerro, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio duenio) {
        this.numeroCliente = numeroCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.duenio = duenio;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String isAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "numeroCliente=" + numeroCliente + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEspecial=" + atencionEspecial + ", observaciones=" + observaciones + ", duenio=" + duenio + '}';
    }

    
}
