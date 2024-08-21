package com.yoprogramo.peluqueriacanina.igu;

import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.logica.Utility;

public class ConfirmaBorrar extends javax.swing.JFrame {

    Controladora control;
    Utility utility ;
    VerMascota verMascota;
    

    //Habiendo cambiado el tipo de constructor de ConfirmaBorrar al cambiar el metodo "btnBorrarMascota" en VerMascota ,
    // puedo pasarle las variables necesarias para setear los txtfield de esta ventana y poder usarlos para el borrado
    public ConfirmaBorrar(Controladora control, Utility utility, VerMascota verMascota, String nombreMascota) {
        initComponents();
        this.control = control;
        this.utility = utility;
        this.verMascota = verMascota;        
        txtNombreMascotaABorrar.setText(nombreMascota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBorrarMascota = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreMascotaABorrar = new javax.swing.JTextField();
        btnSalirConfirmaBorrado = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Esta usted seguro/a de borrar la mascota seleccionada?");

        btnBorrarMascota.setText("Borrar Mascota");
        btnBorrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMascotaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Borrado de Mascota");

        btnSalirConfirmaBorrado.setText("Salir");
        btnSalirConfirmaBorrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirConfirmaBorradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(txtNombreMascotaABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnBorrarMascota)
                        .addGap(102, 102, 102)
                        .addComponent(btnSalirConfirmaBorrado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMascotaABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarMascota)
                    .addComponent(btnSalirConfirmaBorrado))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMascotaActionPerformed
        String nombreMasco = txtNombreMascotaABorrar.getText();
        Mascota cliente = control.traeMascoNom(nombreMasco);
        if (cliente != null) {
            control.borrarMascota(cliente.getNumeroCliente());
            verMascota.limpiarCamposVerMascota();
            utility.mostrarMensaje("Mascota borrada con exito", "Info", "Borrado de Mascota");
            this.dispose();
        } else {
            utility.mostrarMensaje("No se pudo borrar mascota", "Error", "Borrado Fallido");
        }

        /*Este codigo me daba error al querer ejecutar el borrado mientras el txtField con la info estaba en otra ventana
        Mascota cliente = verMascota.traeClienteVerMascota();
        if (cliente != null) {
            control.borrarMascota(cliente.getNumeroCliente());
            verMascota.limpiarCamposVerMascota();
            utility.mostrarMensaje("Cliente borrado con exito", "Info", "Borrado de Cliente");
        } else {
            utility.mostrarMensaje("No se pudo borrar la mascota", "Error", "Borrado de Cliente");
        }*/
    }//GEN-LAST:event_btnBorrarMascotaActionPerformed

    private void btnSalirConfirmaBorradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirConfirmaBorradoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirConfirmaBorradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarMascota;
    private javax.swing.JButton btnSalirConfirmaBorrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreMascotaABorrar;
    // End of variables declaration//GEN-END:variables
}
