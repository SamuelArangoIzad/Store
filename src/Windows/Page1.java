/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Windows;

import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




/**
 *
 * @author samue
 */
public class Page1 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Page1() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuBottonPage1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(730, 270));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 270));

        MenuBottonPage1.setBackground(new java.awt.Color(204, 204, 255));
        MenuBottonPage1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        MenuBottonPage1.setForeground(new java.awt.Color(102, 102, 102));
        MenuBottonPage1.setText("Menu");
        MenuBottonPage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBottonPage1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Write Name Of The Article: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Write The Price Of The Article: ");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Write The Amount Of The Article: ");

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Write The Index Of The Article: ");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Save ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MenuBottonPage1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel6)))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuBottonPage1)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       String nombre = jTextField1.getText().trim();
       String precio1 = jTextField2.getText().trim();
       String cantidad1 = jTextField3.getText().trim();
       String indice1 = jTextField4.getText().trim();

    if (nombre.isEmpty() || precio1.isEmpty() || cantidad1.isEmpty() || indice1.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All Spaces Are Required");
    } else {
        try {
            int precio = Integer.parseInt(precio1);
            int cantidad = Integer.parseInt(cantidad1);
            int indice = Integer.parseInt(indice1);

            // Verificar si el índice ya está en uso
            if (indiceEnUso(indice, nombre, precio, cantidad)) {
                JOptionPane.showMessageDialog(this, "An Article With The Same Index Already Exists With Different Data.");
            } else {
                Articulo articulo = new Articulo(nombre, precio, cantidad, indice, indice);
                Inventario inventario = new Inventario();
                inventario.agregar(articulo);

                JOptionPane.showMessageDialog(this, "Article Saved Correct Form");
                guardarArticuloEnArchivo(articulo);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price, Quantity, And Index Must Be Integers.");
        }
    }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MenuBottonPage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBottonPage1ActionPerformed

        //CIERA LA VENTANA ACTUAL PARA LUEGO PROCEDER A LA VENTANA DEL INICIO
        SwingUtilities.getWindowAncestor(this).dispose();

        Inicio in = new Inicio();
        in.setVisible(true);

    }//GEN-LAST:event_MenuBottonPage1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuBottonPage1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void guardarArticuloEnArchivo(Articulo articulo) {
            try {
        File file = new File("articulos.txt");
        FileWriter fileWriter = new FileWriter(file, true); // El segundo argumento "true" permite agregar al archivo existente
        BufferedWriter writer = new BufferedWriter(fileWriter);

        // Escribe la información del artículo en el archivo
        writer.write("Nombre: " + articulo.getArticulo() + ", Precio: " + articulo.getPrecio()
                + ", Cantidad: " + articulo.getCantidad() + ", Índice: " + articulo.getIndice());
        writer.newLine(); // Agrega un salto de línea para el próximo artículo
        writer.close();

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar el artículo en el archivo.");
    }
    }
    
    
    
private boolean indiceEnUso(int nuevoIndice, String nuevoNombre, int nuevoPrecio, int nuevaCantidad) {
    try {
        FileReader fileReader = new FileReader("articulos.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(", ");
            if (parts.length == 4) {
                int indiceExistente = Integer.parseInt(parts[3].substring(8));
                if (indiceExistente == nuevoIndice) {
                    // Mismo índice encontrado, verifiquemos si los datos coinciden
                    String nombreExistente = parts[0].substring(8);
                    int precioExistente = Integer.parseInt(parts[1].substring(8));
                    int cantidadExistente = Integer.parseInt(parts[2].substring(10));

                    if (nombreExistente.equals(nuevoNombre) &&
                            precioExistente == nuevoPrecio &&
                            cantidadExistente == nuevaCantidad) {
                        // Los datos coinciden, es el mismo artículo, puedes actualizar la cantidad si es necesario.
                        return false;
                    } else {
                        // Los datos no coinciden, es un artículo diferente con el mismo índice.
                        return true;
                    }
                }
            }
        }
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An Error Occurred While Checking The Index.");
    }
    return false;
}

}
