package com.yoprogramo.peluqueriacanina.igu;

import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.logica.Utility;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VerDuenio extends javax.swing.JFrame {

    Controladora control;
    Utility utility ;
    
    public VerDuenio(Utility utility, Controladora control) {
        initComponents();
        this.utility = utility;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomDuenioVerDuenio = new javax.swing.JTextField();
        txtDniVerDuenio = new javax.swing.JTextField();
        txtTelDuenVerDuenio = new javax.swing.JTextField();
        txtDireVerDuenio = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMascotasDuenio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngDni = new javax.swing.JTextField();
        btnLimpiarVerDuenio = new javax.swing.JButton();
        btnBuscarDuenio = new javax.swing.JButton();
        btnSalirVerDuenio = new javax.swing.JButton();
        btnAgregarMascotaVerDuenio = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Dueño del Cliente:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Mascotas:");

        tablaMascotasDuenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaMascotasDuenio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(txtNomDuenioVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelDuenVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomDuenioVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelDuenVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireVerDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dueño");

        jLabel2.setText("Ingrese DNI del dueño:");

        txtIngDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngDniActionPerformed(evt);
            }
        });

        btnLimpiarVerDuenio.setText("Limpiar");
        btnLimpiarVerDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVerDuenioActionPerformed(evt);
            }
        });

        btnBuscarDuenio.setText("Buscar Dueño");
        btnBuscarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDuenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiarVerDuenio)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIngDni, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDuenio))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIngDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDuenio)
                    .addComponent(btnLimpiarVerDuenio))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnSalirVerDuenio.setText("Salir");
        btnSalirVerDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVerDuenioActionPerformed(evt);
            }
        });

        btnAgregarMascotaVerDuenio.setText("Agregar Mascota");
        btnAgregarMascotaVerDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMascotaVerDuenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1)
                        .addGap(0, 283, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarMascotaVerDuenio)
                        .addGap(108, 108, 108)
                        .addComponent(btnSalirVerDuenio)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirVerDuenio)
                    .addComponent(btnAgregarMascotaVerDuenio))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLimpiarVerDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVerDuenioActionPerformed
        limpiarCamposVerDuenio();
        cargarTablaVacia();
    }//GEN-LAST:event_btnLimpiarVerDuenioActionPerformed

    public void buscarDuenio() {
        int dniCliente = Integer.parseInt(txtIngDni.getText());
        Duenio duenio = control.traeDuenioDni(dniCliente);
        if (duenio != null) {
            mostrarDatosDuenio(duenio);
            cargarTablaModelo();
        } else {
            utility.mostrarMensaje("No existe un dueño con ese Dni", "Error", "Error al buscar dueño");
        }
    }
    
    private void btnBuscarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDuenioActionPerformed
        buscarDuenio();
    }//GEN-LAST:event_btnBuscarDuenioActionPerformed

    private void btnSalirVerDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVerDuenioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirVerDuenioActionPerformed

    private void txtIngDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngDniActionPerformed
        buscarDuenio();
    }//GEN-LAST:event_txtIngDniActionPerformed

    private void btnAgregarMascotaVerDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMascotaVerDuenioActionPerformed
        AgregarClienteADuenio agregaCliente = new AgregarClienteADuenio(control, utility);
        agregaCliente.setVisible(true);
        agregaCliente.setLocationRelativeTo(null);

        Duenio duenio = control.traeDuenioDni(Integer.parseInt(txtDniVerDuenio.getText()));
        agregaCliente.mostrarDatosDuenio(duenio);
    }//GEN-LAST:event_btnAgregarMascotaVerDuenioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaVacia();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMascotaVerDuenio;
    private javax.swing.JButton btnBuscarDuenio;
    private javax.swing.JButton btnLimpiarVerDuenio;
    private javax.swing.JButton btnSalirVerDuenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaMascotasDuenio;
    private javax.swing.JTextField txtDireVerDuenio;
    private javax.swing.JTextField txtDniVerDuenio;
    private javax.swing.JTextField txtIngDni;
    private javax.swing.JTextField txtNomDuenioVerDuenio;
    private javax.swing.JTextField txtTelDuenVerDuenio;
    // End of variables declaration//GEN-END:variables

    private void limpiarCamposVerDuenio() {
        txtIngDni.setText("");
        txtNomDuenioVerDuenio.setText("");
        txtDniVerDuenio.setText("");
        txtTelDuenVerDuenio.setText("");
        txtDireVerDuenio.setText("");
    }

    public void mostrarDatosDuenio(Duenio duenio) {
        txtNomDuenioVerDuenio.setText(duenio.getNombreDuenio());
        txtDniVerDuenio.setText(String.valueOf(duenio.getDni()));
        txtTelDuenVerDuenio.setText(duenio.getNumeroTelefono());
        txtDireVerDuenio.setText(duenio.getDireccion());
    }

    public void cargarTablaVacia() {
        DefaultTableModel modeloTablaVacia = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int cell, int column) {
                return false;
            }
        };

        String titulos[] = {
            "Mascota", "Raza"
        };
        modeloTablaVacia.setColumnIdentifiers(titulos);
        tablaMascotasDuenio.setModel(modeloTablaVacia);
    }

    public void cargarTablaModelo() {
        DefaultTableModel tablaModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int cell, int column) {
                return false;
            }
        };

        String titulos[] = {"Mascota", "Raza"};
        tablaModelo.setColumnIdentifiers(titulos);

        List<Mascota> listaMascotas = control.traeDuenioDni(Integer.parseInt(txtDniVerDuenio.getText())).getListaMascotas();

        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {
                    masco.getNombrePerro(), masco.getRaza()
                };
                tablaModelo.addRow(objeto);
            }
        }
        tablaMascotasDuenio.setModel(tablaModelo);
    }

}
