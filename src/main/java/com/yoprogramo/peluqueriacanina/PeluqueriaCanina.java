
package com.yoprogramo.peluqueriacanina;

import com.yoprogramo.peluqueriacanina.igu.PantallaPrincipal;
import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Utility;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        Utility utility = new Utility()
;        
        PantallaPrincipal pantalla = new PantallaPrincipal(control, utility);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
        
        
        
    }
}
