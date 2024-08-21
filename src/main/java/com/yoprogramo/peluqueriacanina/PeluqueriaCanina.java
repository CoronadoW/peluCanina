package com.yoprogramo.peluqueriacanina;

import com.yoprogramo.peluqueriacanina.igu.AgregarClienteADuenio;
import com.yoprogramo.peluqueriacanina.igu.PantallaPrincipal;
import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Utility;
import com.yoprogramo.peluqueriacanina.persistencia.ControladoraPersistencia;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Utility utility = new Utility();
        Controladora control = new Controladora(controlPersis, utility);
        AgregarClienteADuenio agregarCliente = new AgregarClienteADuenio(control , utility);
        
        control.setAgregarCliente(agregarCliente);
        
        int dniDuen = 0;
        Duenio duenio = null ;
        
        PantallaPrincipal pantalla = new PantallaPrincipal(control, utility, dniDuen, duenio);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
