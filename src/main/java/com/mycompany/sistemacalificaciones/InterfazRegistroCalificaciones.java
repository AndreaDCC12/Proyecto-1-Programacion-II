/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemacalificaciones;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class InterfazRegistroCalificaciones extends javax.swing.JFrame {

    public InterfazRegistroCalificaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTextmatematicas1 = new javax.swing.JTextField();
        jButtonsalir1 = new javax.swing.JButton();
        jTextcomputacion1 = new javax.swing.JTextField();
        jTextcomunicacion1 = new javax.swing.JTextField();
        jTextsociales1 = new javax.swing.JTextField();
        jTextnaturales1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextcomputacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCombobimestre = new javax.swing.JComboBox<>();
        jButtonguardar = new javax.swing.JButton();
        jButtonlimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextapellido = new javax.swing.JTextField();
        jTextcomunicacion = new javax.swing.JTextField();
        jTextsociales = new javax.swing.JTextField();
        jTextnaturales = new javax.swing.JTextField();
        jButtonregresar = new javax.swing.JButton();
        jnombre = new javax.swing.JLabel();
        jcodigo = new javax.swing.JLabel();
        japellido = new javax.swing.JLabel();
        jTextmatematicas = new javax.swing.JTextField();
        jTextcodigo = new javax.swing.JTextField();
        jTextnombre = new javax.swing.JTextField();
        jButtonsalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButtonsalir1.setText("salir");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setText("Bimestre");

        jCombobimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo", "Tercero", "Cuarto" }));
        jCombobimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombobimestreActionPerformed(evt);
            }
        });

        jButtonguardar.setText("Guardar");
        jButtonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguardarActionPerformed(evt);
            }
        });

        jButtonlimpiar.setText("Limpiar");
        jButtonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Matematica");

        jLabel2.setText("Ciencias Naturales");

        jLabel3.setText("Comunicacion y Lenguaje");

        jLabel4.setText("Ciencias Sociales");

        jLabel5.setText("Computación");

        jTextcomunicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcomunicacionActionPerformed(evt);
            }
        });

        jTextsociales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextsocialesActionPerformed(evt);
            }
        });

        jButtonregresar.setText("Regresar");
        jButtonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregresarActionPerformed(evt);
            }
        });

        jnombre.setText("Nombre");

        jcodigo.setText("Código");

        japellido.setText("Apellido");

        jTextmatematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmatematicasActionPerformed(evt);
            }
        });

        jButtonsalir.setText("salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(japellido, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonregresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextcomunicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextsociales, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextnaturales, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombobimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextmatematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextcomputacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonregresar)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jnombre)
                        .addGap(18, 18, 18)
                        .addComponent(japellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcodigo)
                    .addComponent(jTextcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCombobimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextmatematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextcomunicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextsociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextnaturales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextcomputacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonlimpiar)
                        .addComponent(jButtonguardar)
                        .addComponent(jButtonsalir)))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextcomunicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcomunicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcomunicacionActionPerformed

    private void jTextsocialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextsocialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextsocialesActionPerformed

    public void limpiarespacios() {
        jTextnombre.setText("");
        jTextcodigo.setText("");
        jTextapellido.setText("");
        jTextcomunicacion.setText("");
        jTextmatematicas.setText("");
        jTextsociales.setText("");
        jTextnaturales.setText("");
        jTextcomputacion.setText("");

    }
    private void jButtonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimpiarActionPerformed
        limpiarespacios();


    }//GEN-LAST:event_jButtonlimpiarActionPerformed

    private void jButtonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguardarActionPerformed
        try {
            // Obtener los valores del formulario
            String bimestre=(String) jCombobimestre.getSelectedItem();

            String nombre = jTextnombre.getText().trim();
            String apellido = jTextapellido.getText().trim();

            try {
                // Intentar convertir los textos a double
                int codigo = Integer.parseInt(jTextcodigo.getText());
                double matematicas = Double.parseDouble(jTextmatematicas.getText().trim());
                double comunicacion = Double.parseDouble(jTextcomunicacion.getText().trim());
                double sociales = Double.parseDouble(jTextsociales.getText().trim());
                double naturales = Double.parseDouble(jTextnaturales.getText().trim());
                double computacion = Double.parseDouble(jTextcomputacion.getText().trim());

                // Validar que las notas estén en el rango de 0 a 100
                if (matematicas < 0 || matematicas > 100
                        || comunicacion < 0 || comunicacion > 100
                        || sociales < 0 || sociales > 100
                        || naturales < 0 || naturales > 100
                        || computacion < 0 || computacion > 100) {
                    JOptionPane.showMessageDialog(this, "Error: Las notas deben estar en el rango de 0 a 100.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    jTextcomunicacion.setText("");
                    jTextmatematicas.setText("");
                    jTextsociales.setText("");
                    jTextnaturales.setText("");
                    jTextcomputacion.setText("");
                    return; // Salir del método para no guardar los datos
                }

                Alumno alumno = new Alumno();
                alumno.setNombre(nombre);
                alumno.setApellido(apellido);
                alumno.setCodigoalumno(codigo);
                
               alumno.setBimestre(bimestre);
                alumno.setMatematicas(matematicas);
                alumno.setComunicacion(comunicacion);
                alumno.setSociales(sociales);
                alumno.setNaturales(naturales);
                alumno.setComputacion(computacion);
                alumno.getPromedio();

                // Abrir el archivo y guardar el registro
                Archivo archivo = new Archivo();
                archivo.abrirArchivo("alumnos.txt"); 

                int posicion = archivo.buscarPosicionPorCodigo(codigo);

                if (posicion >= 0) {
                    // Si el registro existe, se actualiza
                    archivo.nuevoRegistro(posicion, alumno);
                    JOptionPane.showMessageDialog(this, "Registro actualizado exitosamente.");
                } else {
                    // Si el registro no existe, se agrega
                    List<Alumno> todosLosAlumnos = archivo.obtenerTodosLosRegistros();
                    archivo.nuevoRegistro(todosLosAlumnos.size(), alumno);
                    JOptionPane.showMessageDialog(this, "Registro guardado exitosamente.");
                }

                archivo.cerrarArchivo();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error: Por favor ingrese valores numéricos válidos.",
                        "Error de entrada", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(InterfazRegistroCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
            }

            limpiarespacios();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores numéricos válidos para todas las materias.",
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonguardarActionPerformed

    private void jButtonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregresarActionPerformed
        // TODO add your handling code here:
        InterfazaccionAlumno accionalumno = new InterfazaccionAlumno();
        accionalumno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonregresarActionPerformed

    private void jTextmatematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmatematicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextmatematicasActionPerformed

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jCombobimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombobimestreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCombobimestreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistroCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonguardar;
    private javax.swing.JButton jButtonlimpiar;
    private javax.swing.JButton jButtonregresar;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JButton jButtonsalir1;
    private javax.swing.JComboBox<String> jCombobimestre;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextapellido;
    private javax.swing.JTextField jTextcodigo;
    private javax.swing.JTextField jTextcomputacion;
    private javax.swing.JTextField jTextcomputacion1;
    private javax.swing.JTextField jTextcomunicacion;
    private javax.swing.JTextField jTextcomunicacion1;
    private javax.swing.JTextField jTextmatematicas;
    private javax.swing.JTextField jTextmatematicas1;
    private javax.swing.JTextField jTextnaturales;
    private javax.swing.JTextField jTextnaturales1;
    private javax.swing.JTextField jTextnombre;
    private javax.swing.JTextField jTextsociales;
    private javax.swing.JTextField jTextsociales1;
    private javax.swing.JLabel japellido;
    private javax.swing.JLabel jcodigo;
    private javax.swing.JLabel jnombre;
    // End of variables declaration//GEN-END:variables
}
