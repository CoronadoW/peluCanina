package com.yoprogramo.peluqueriacanina.igu;

import com.yoprogramo.peluqueriacanina.logica.Controladora;
import com.yoprogramo.peluqueriacanina.logica.Mascota;
import com.yoprogramo.peluqueriacanina.logica.Utility;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VerTodos extends javax.swing.JFrame {

    Utility utility = new Utility();
    Controladora control = new Controladora();

    public VerTodos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        btnBorrarVerTodos = new javax.swing.JButton();
        btnSalirVerTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Cliente", "Raza", "Color", "Alergico", "At. Especial", "Dueño", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaMascotas);

        btnBorrarVerTodos.setText("Borrar");
        btnBorrarVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarVerTodosActionPerformed(evt);
            }
        });

        btnSalirVerTodos.setText("Salir");
        btnSalirVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVerTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorrarVerTodos)
                    .addComponent(btnSalirVerTodos))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnBorrarVerTodos)
                .addGap(42, 42, 42)
                .addComponent(btnSalirVerTodos)
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaModelo();
    }//GEN-LAST:event_formWindowOpened

    private void btnBorrarVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarVerTodosActionPerformed
        //Controlo que la tabla no este vacia
        if (tablaMascotas.getRowCount() > 0) {
            //Controlo que tenga una fila seleccionada
            if (tablaMascotas.getSelectedRow() != -1) {
                //Traigo el numero de cliente desde la tabla, que la tiene como string y la convierto a int
                int numCliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                //Llamo al metodo borrarMascota
                control.borrarMascota(numCliente);
                cargarTablaModelo();
                //Muestro el mensaje 
                utility.mostrarMensaje("Macota borrada correctamente", "Info", "Borrado de Mascota");
            } else {
                utility.mostrarMensaje("Debe elejir una mascota", "Error", "Error al Eliminar");
            }
        } else {
            utility.mostrarMensaje("No hay ninguna mascota en la tabla", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnBorrarVerTodosActionPerformed

    private void btnSalirVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVerTodosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirVerTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarVerTodos;
    private javax.swing.JButton btnSalirVerTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    

    private void cargarTablaModelo() {
        //Defino el modelo de tabla que quiero
        DefaultTableModel tablaModelo = new DefaultTableModel() {
            //Coloco el overrride annotation por que el metodo "isCellEditable" es propio del modelo
            @Override
            public boolean isCellEditable(int cell, int column) {
                return false;
            }
        };
        //Se establecen los nombres de las columnas
        String titulos[] = {"Numero", "Mascota", "Raza", "Color", "Alergico", "At. Esp.", "Dueño", "Telefono"};
        tablaModelo.setColumnIdentifiers(titulos);

        //Se carga los datos desde la base de datos
        List<Mascota> listaMascotas = control.traeListaMascotas();

        //Se recorre la lista para mostrar "cada" elemento
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {
                    masco.getNumeroCliente(), masco.getNombrePerro(), masco.getRaza(),
                    masco.getColor(), masco.atencionEspecial, masco.atencionEspecial,
                    masco.getDuenio().getNombreDuenio(), masco.getDuenio().getNumeroTelefono()
                };
                tablaModelo.addRow(objeto);
            }
        }
        //A la variable de la tabla le asigno el modelo creado anteriormente como tablaModelo
        tablaMascotas.setModel(tablaModelo);
    }
    
      

}
