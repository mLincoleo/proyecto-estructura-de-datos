/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.cine.peliculas.Pelicula;
import backend.gestion_datos.GestorPeliculas;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO ASUS
 */
public class Catalogo extends javax.swing.JFrame {


    private int tamaño;
    private int actual;
    private List<Pelicula> peliculas;

    public Catalogo() throws IOException {
        
        initComponents();
        jTextTitulo.setEditable(false);
        jTextDirector.setEditable(false);
        jTextCategoria.setEditable(false);
        jTextPg.setEditable(false);
        this.setLocationRelativeTo(null);
        
        GestorPeliculas gp = new GestorPeliculas();
        peliculas = gp.obtenerPeliculas();
        
        this.tamaño=peliculas.size();
        actual = 0;
        
        jTextTitulo.setText(peliculas.get(actual).getTitulo());
        jTextDirector.setText(peliculas.get(actual).getDirector());
        jTextCategoria.setText(peliculas.get(actual).getCategoria());
        jTextPg.setText(peliculas.get(actual).getPg());
        jLabelMarco.setIcon(new javax.swing.ImageIcon(getClass().getResource(peliculas.get(actual).getFoto())));
        
    }
    
    public Catalogo(int index) throws IOException {
        actual = index;
        initComponents();
        jTextTitulo.setEditable(false);
        jTextDirector.setEditable(false);
        jTextCategoria.setEditable(false);
        jTextPg.setEditable(false);
        this.setLocationRelativeTo(null);
        
        GestorPeliculas gp = new GestorPeliculas();
        peliculas = gp.obtenerPeliculas();
        
        this.tamaño=peliculas.size();
        
        jTextTitulo.setText(peliculas.get(actual).getTitulo());
        jTextDirector.setText(peliculas.get(actual).getDirector());
        jTextCategoria.setText(peliculas.get(actual).getCategoria());
        jTextPg.setText(peliculas.get(actual).getPg());
        jLabelMarco.setIcon(new javax.swing.ImageIcon(getClass().getResource(peliculas.get(actual).getFoto())));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPeliculas = new javax.swing.JLabel();
        jLabelMarco = new javax.swing.JLabel();
        jLabelDer = new javax.swing.JLabel();
        jLabeIzq = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jTextDirector = new javax.swing.JTextField();
        jTextCategoria = new javax.swing.JTextField();
        jTextPg = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jButtonIzq = new javax.swing.JButton();
        jButtonDer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 280, 190));

        jLabelMarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marcoImg.png"))); // NOI18N
        getContentPane().add(jLabelMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabelDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha der.png"))); // NOI18N
        getContentPane().add(jLabelDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabeIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha izq.png"))); // NOI18N
        getContentPane().add(jLabeIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTitulo.setText("Título");
        jTextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTituloActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 300, -1));

        jTextDirector.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextDirector.setText("Director");
        jTextDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDirectorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 90, 270, -1));

        jTextCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCategoria.setText("Categoría");
        jTextCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 140, 210, -1));

        jTextPg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextPg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPg.setText("PG");
        jTextPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPgActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 190, 210, -1));

        jButtonConfirmar.setBackground(new java.awt.Color(102, 0, 0));
        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar.setText("CONFIRMAR");
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 130, 40));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonVolver.setBackground(new java.awt.Color(102, 0, 0));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 91, 25));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoF.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 476));

        jButtonIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzqActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 70));

        jButtonDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 160, 50, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerActionPerformed
        actual++;
        if(actual==tamaño)
            actual=0;
        jTextTitulo.setText(peliculas.get(actual).getTitulo());
        jTextDirector.setText(peliculas.get(actual).getDirector());
        jTextCategoria.setText(peliculas.get(actual).getCategoria());
        jTextPg.setText(peliculas.get(actual).getPg());
        jLabelMarco.setIcon(new javax.swing.ImageIcon(getClass().getResource(peliculas.get(actual).getFoto())));
    }//GEN-LAST:event_jButtonDerActionPerformed

    private void jButtonIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzqActionPerformed
        actual--;
        if(actual==-1)
            actual=tamaño-1;
        jTextTitulo.setText(peliculas.get(actual).getTitulo());
        jTextDirector.setText(peliculas.get(actual).getDirector());
        jTextCategoria.setText(peliculas.get(actual).getCategoria());
        jTextPg.setText(peliculas.get(actual).getPg());
        jLabelMarco.setIcon(new javax.swing.ImageIcon(getClass().getResource(peliculas.get(actual).getFoto())));
    }//GEN-LAST:event_jButtonIzqActionPerformed

    private void jTextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTituloActionPerformed

    private void jTextCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCategoriaActionPerformed

    private void jTextDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDirectorActionPerformed

    private void jTextPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPgActionPerformed

    }//GEN-LAST:event_jTextPgActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt){
        Pelicula seleccion = peliculas.get(actual);
        try {
            this.setVisible(false);
            SalaCine sc = new SalaCine(seleccion, actual);
            sc.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        principal p = new principal();
        p.setVisible(true);
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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Catalogo().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonDer;
    private javax.swing.JButton jButtonIzq;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabeIzq;
    private javax.swing.JLabel jLabelDer;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMarco;
    private javax.swing.JLabel jLabelPeliculas;
    private javax.swing.JTextField jTextCategoria;
    private javax.swing.JTextField jTextDirector;
    private javax.swing.JTextField jTextPg;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
