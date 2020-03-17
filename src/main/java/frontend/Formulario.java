/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.arbol.Tree;
import backend.cine.peliculas.Pelicula;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import backend.gestion_datos.GestorPeliculas;


/**
 *
 * @author USUARIO ASUS
 */
public class Formulario extends javax.swing.JFrame {

    private int butaca, index, anterior;
    private String nombre, telefono;
    private Pelicula peli;
    private List<Pelicula> peliculas;
    private GestorPeliculas gp;
    
    public Formulario(int but, Pelicula pelicula) throws IOException {
            this.peli = pelicula;
            this.butaca=but;
            initComponents();
            jTextField1.setText("HAS SELECCIONADO LA BUTACA "+ butaca+"\n");
            jTextField1.setEditable(false);
            this.setLocationRelativeTo(null);
            gp = new GestorPeliculas();
            peliculas = gp.obtenerPeliculas();
            index=peliculas.indexOf(pelicula);
    }
    
    public Formulario(int but, Pelicula pelicula, int previous) throws IOException {
            anterior = previous;
            this.peli = pelicula;
            this.butaca=but;
            initComponents();
            jTextField1.setText("HAS SELECCIONADO LA BUTACA "+ butaca+"\n");
            jTextField1.setEditable(false);
            this.setLocationRelativeTo(null);
            gp = new GestorPeliculas();
            peliculas = gp.obtenerPeliculas();
            index=peliculas.indexOf(pelicula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextTel = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jButtonComprar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 476));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 330, 40));

        jTextTel.setText("Ingrese su teléfono...");
        jTextTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 330, -1));

        jTextNombre.setText("Ingrese su nombre...");
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 160, 330, -1));

        jButtonComprar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonComprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprar.setText("CONFIRMAR");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, 40));

        jButtonVolver.setBackground(new java.awt.Color(102, 0, 0));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoF.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 476));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        nombre = jTextNombre.getText();
        telefono = jTextTel.getText();
        JOptionPane.showMessageDialog(null,"COMPRADO: BUTACA "+butaca+"\nNOMBRE: "+nombre+"\nTELÉFONO: "+telefono);
        try {   
                peli.getSala().getAsientos().ocupar(butaca);
                this.setVisible(false);
                peliculas.set(index, peli);
                gp.setPeliculas(peliculas);
                gp.guardarPeliculas();
                SalaCine sc = new SalaCine(peli, anterior);
                sc.setVisible(true);
                
            } catch (IOException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        try {
            this.setVisible(false);
            SalaCine sc = new SalaCine(peli, anterior);
            sc.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTel;
    // End of variables declaration//GEN-END:variables
}
