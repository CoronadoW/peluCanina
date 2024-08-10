package com.yoprogramo.peluqueriacanina.igu;

import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.logica.Utility;

public class VerMascota extends javax.swing.JFrame {

    //Creo instancias de la logica(Controladora) y la clase Utility
    Controladora controlVer ;
    Utility utility ;

    public VerMascota(Controladora controlVer, Utility utility) {
        initComponents();
        this.controlVer = controlVer;
        this.utility = utility;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIngNomMascota = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarVerMascota = new javax.swing.JButton();
        btnLimpiarVerMascota = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomMascoVerMascota = new javax.swing.JTextField();
        txtRazaVerMascota = new javax.swing.JTextField();
        txtColorVerMascota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNomDuenioVerMascota = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelDuenVerMascota = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAlergicoVerMascota = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObserVerMascota = new javax.swing.JTextArea();
        txtAtEspVerMascota = new javax.swing.JTextField();
        btnBorrarMascota = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdDuenioVerMascota = new javax.swing.JTextField();
        btnEditarMascotaVerMascota = new javax.swing.JButton();
        btnSalirVerMascota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver Mascota");

        jLabel3.setText("Introduce Nombre de la mascota:");

        txtIngNomMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngNomMascotaActionPerformed(evt);
            }
        });

        btnBuscarVerMascota.setText("Buscar");
        btnBuscarVerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVerMascotaActionPerformed(evt);
            }
        });

        btnLimpiarVerMascota.setText("Limpiar");
        btnLimpiarVerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVerMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarVerMascota)
                .addGap(50, 50, 50)
                .addComponent(btnBuscarVerMascota)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVerMascota)
                    .addComponent(btnLimpiarVerMascota))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIngNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIngNomMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("Mascota:");

        jLabel5.setText("Raza:");

        jLabel6.setText("Color:");

        jLabel7.setText("Dueño:");

        jLabel18.setText("Telefono:");

        jLabel19.setText("Alergico:");

        jLabel20.setText("Atencion especial:");

        jLabel21.setText("Observaciones:");

        txtObserVerMascota.setColumns(20);
        txtObserVerMascota.setRows(5);
        jScrollPane1.setViewportView(txtObserVerMascota);

        btnBorrarMascota.setText("Borrar Mascota");
        btnBorrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMascotaActionPerformed(evt);
            }
        });

        jLabel4.setText("Id dueño:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtIdDuenioVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomDuenioVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomMascoVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtColorVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRazaVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAlergicoVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAtEspVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelDuenVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBorrarMascota))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomMascoVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColorVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergicoVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtEspVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDuenioVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomDuenioVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelDuenVerMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(27, 27, 27)
                        .addComponent(btnBorrarMascota))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnEditarMascotaVerMascota.setText("Editar");
        btnEditarMascotaVerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMascotaVerMascotaActionPerformed(evt);
            }
        });

        btnSalirVerMascota.setText("Salir");
        btnSalirVerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVerMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnEditarMascotaVerMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirVerMascota)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarMascotaVerMascota)
                    .addComponent(btnSalirVerMascota))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //LLamo al metodo limpiarCampos
    private void btnLimpiarVerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVerMascotaActionPerformed
        limpiarCamposVerMascota();
    }//GEN-LAST:event_btnLimpiarVerMascotaActionPerformed

    //LLamo al metodo para buscar mascota por el nombre al hacer click en el boton buscar
    private void btnBuscarVerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVerMascotaActionPerformed
        buscarMascota();
    }//GEN-LAST:event_btnBuscarVerMascotaActionPerformed
    //Edito la mascota traida por el nombre
    private void btnEditarMascotaVerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMascotaVerMascotaActionPerformed
        Mascota cliente = traeClienteVerMascota();
        if (cliente != null) {
            actualizarDatos(cliente);
            this.dispose();
            utility.mostrarMensaje("Edición exitosa", "Info", "Edicion de Cliente");
        } else {
            utility.mostrarMensaje("No se encontró una mascota con ese nombre", "Error", "Edición de Cliente");
        }
    }//GEN-LAST:event_btnEditarMascotaVerMascotaActionPerformed

    //Abro ventana de confirmacion de borrado de mascota
    private void btnBorrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMascotaActionPerformed
       String nombreMasco = txtIngNomMascota.getText();
       ConfirmaBorrar confiBorrar = new ConfirmaBorrar(controlVer, utility ,this, nombreMasco);
       confiBorrar.setVisible(true);
       confiBorrar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarMascotaActionPerformed

    //Salgo de esta pantalla
    private void btnSalirVerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVerMascotaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirVerMascotaActionPerformed

    //Busco mascota por el nombre ingresado y muestro sus datos en  llamando al metodo mostrarDatosVerMascota
    private void buscarMascota() {
        Mascota cliente = traeClienteVerMascota();
        if (cliente != null) {
            mostrarDatosVerMascota(cliente);
        } else {
            utility.mostrarMensaje("No se encontró al cliente con ese nombre", "Error", "Error al buscar cliente");
        }
    }

    //Llamo al metodo para buscar mascota por el nombre ingresado al dar "enter" en el textField
    private void txtIngNomMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngNomMascotaActionPerformed
        buscarMascota();
    }//GEN-LAST:event_txtIngNomMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarMascota;
    private javax.swing.JButton btnBuscarVerMascota;
    private javax.swing.JButton btnEditarMascotaVerMascota;
    private javax.swing.JButton btnLimpiarVerMascota;
    private javax.swing.JButton btnSalirVerMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlergicoVerMascota;
    private javax.swing.JTextField txtAtEspVerMascota;
    private javax.swing.JTextField txtColorVerMascota;
    private javax.swing.JTextField txtIdDuenioVerMascota;
    private javax.swing.JTextField txtIngNomMascota;
    private javax.swing.JTextField txtNomDuenioVerMascota;
    private javax.swing.JTextField txtNomMascoVerMascota;
    private javax.swing.JTextArea txtObserVerMascota;
    private javax.swing.JTextField txtRazaVerMascota;
    private javax.swing.JTextField txtTelDuenVerMascota;
    // End of variables declaration//GEN-END:variables

    //Le asigno los datos que ya se encuentran en los textField traidos anteriormente al buscar un cliente/mascota por nombre
    //y se los asigno a las nuevas instancias de Mascota (cliente) y Duenio(duenio),
    // para luego pasarselas a la controladora.
    private void actualizarDatos(Mascota cliente) {
        cliente.setNombrePerro(txtNomMascoVerMascota.getText());
        cliente.setColor(txtColorVerMascota.getText());
        cliente.setRaza(txtRazaVerMascota.getText());
        cliente.setAlergico(txtAlergicoVerMascota.getText());
        cliente.setAtencionEspecial(txtAtEspVerMascota.getText());
        cliente.setObservaciones(txtObserVerMascota.getText());

        Duenio duenio = cliente.getDuenio();        
        duenio.setNombreDuenio(txtNomDuenioVerMascota.getText());
        duenio.setNumeroTelefono(txtTelDuenVerMascota.getText());

        controlVer.editar(cliente, duenio);
    }

    //Limpio los campos de VerMascota
    public void limpiarCamposVerMascota() {
        txtIngNomMascota.setText("");
        txtNomMascoVerMascota.setText("");
        txtIdDuenioVerMascota.setText("");
        txtRazaVerMascota.setText("");
        txtColorVerMascota.setText("");
        txtNomDuenioVerMascota.setText("");
        txtTelDuenVerMascota.setText("");
        txtAlergicoVerMascota.setText("");
        txtAtEspVerMascota.setText("");
        txtObserVerMascota.setText("");
    }

    //LLeno los textField de VerMascota con los datos traidos traidos del cliente/mascota
    private void mostrarDatosVerMascota(Mascota cliente) {
        txtNomMascoVerMascota.setText(cliente.getNombrePerro());
        txtIdDuenioVerMascota.setText(String.valueOf(cliente.getDuenio().getIdDuenio()));
        txtRazaVerMascota.setText(cliente.getRaza());
        txtColorVerMascota.setText(cliente.getColor());
        txtNomDuenioVerMascota.setText(cliente.getDuenio().getNombreDuenio());
        txtTelDuenVerMascota.setText(cliente.getDuenio().getNumeroTelefono());
        txtAlergicoVerMascota.setText(cliente.alergico);
        txtAtEspVerMascota.setText(cliente.atencionEspecial);
        txtObserVerMascota.setText(cliente.getObservaciones());
    } 
   
    //Tomo el nombre de mascota ingresado en el textFiel, obtengo el cliente/mascota y entrego el cliente
    public Mascota traeClienteVerMascota() {
        String nombreMasco = txtIngNomMascota.getText();
        Mascota cliente = controlVer.traeMascoNom(nombreMasco);
        return cliente;
    } 

}
