package com.yoprogramo.peluqueriacanina.igu;

import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Duenio;
import com.yoprogramo.peluqueriacanina.logica.Utility;

public class PantallaPrincipal extends javax.swing.JFrame {

    Controladora control;
    Utility utility;
    int dniDuen;
    Duenio duenio ;

    public PantallaPrincipal(Controladora control, Utility utility, int dniDuen ,Duenio duenio) {
        initComponents();
        this.control = control;
        this.utility = utility;
        this.dniDuen = dniDuen;
        this.duenio = duenio;
    }

//    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCrearMascotaPrincipal = new javax.swing.JButton();
        btnVerDatosMascotaPrincipal = new javax.swing.JButton();
        btnVerTodosPrincipal = new javax.swing.JButton();
        btnSalirPrincipal = new javax.swing.JButton();
        btnVerDatosDuenioPrincipal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veterinaria");

        btnCrearMascotaPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrearMascotaPrincipal.setText("Crear Mascota");
        btnCrearMascotaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMascotaPrincipalActionPerformed(evt);
            }
        });

        btnVerDatosMascotaPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerDatosMascotaPrincipal.setText("Ver Mascota");
        btnVerDatosMascotaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosMascotaPrincipalActionPerformed(evt);
            }
        });

        btnVerTodosPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerTodosPrincipal.setText("Ver Todos");
        btnVerTodosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosPrincipalActionPerformed(evt);
            }
        });

        btnSalirPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalirPrincipal.setText("Salir");
        btnSalirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPrincipalActionPerformed(evt);
            }
        });

        btnVerDatosDuenioPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerDatosDuenioPrincipal.setText("Ver Dueño");
        btnVerDatosDuenioPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDatosDuenioPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerDatosMascotaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnVerTodosPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnCrearMascotaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnSalirPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnVerDatosDuenioPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCrearMascotaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnVerDatosMascotaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnVerDatosDuenioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnVerTodosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1154277135-2048x2048.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDatosMascotaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosMascotaPrincipalActionPerformed
        VerMascota ver = new VerMascota(control, utility);
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerDatosMascotaPrincipalActionPerformed

    private void btnVerTodosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosPrincipalActionPerformed
        VerTodos verTodos = new VerTodos(control, utility);
        verTodos.setVisible(true);
        verTodos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerTodosPrincipalActionPerformed

    private void btnCrearMascotaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMascotaPrincipalActionPerformed
        CrearCliente pantallaCrear = new CrearCliente(control, utility);
        pantallaCrear.setVisible(true);
        pantallaCrear.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearMascotaPrincipalActionPerformed

    private void btnSalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirPrincipalActionPerformed

    private void btnVerDatosDuenioPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDatosDuenioPrincipalActionPerformed
        VerDuenio verDuenio = new VerDuenio(control, utility, dniDuen, duenio);
        verDuenio.setVisible(true);
        verDuenio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerDatosDuenioPrincipalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMascotaPrincipal;
    private javax.swing.JButton btnSalirPrincipal;
    private javax.swing.JButton btnVerDatosDuenioPrincipal;
    private javax.swing.JButton btnVerDatosMascotaPrincipal;
    private javax.swing.JButton btnVerTodosPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
