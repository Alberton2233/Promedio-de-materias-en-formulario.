
import javax.swing.plaf.metal.MetalBorders;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Seccion Nocturna
 */
public class Promedio extends javax.swing.JFrame {

    /**
     * Creates new form Promedio
     */
    public Promedio() {
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

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CienciasT1 = new javax.swing.JTextField();
        MatematicasT1 = new javax.swing.JTextField();
        CivicaT1 = new javax.swing.JTextField();
        EstudiosT1 = new javax.swing.JTextField();
        InglesT1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CienciasT2 = new javax.swing.JTextField();
        MatematicasT2 = new javax.swing.JTextField();
        CivicaT2 = new javax.swing.JTextField();
        EstudiosT2 = new javax.swing.JTextField();
        InglesT2 = new javax.swing.JTextField();
        CienciasT3 = new javax.swing.JTextField();
        MatematicasT3 = new javax.swing.JTextField();
        CivicaT3 = new javax.swing.JTextField();
        EstudiosT3 = new javax.swing.JTextField();
        InglesT3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Invici2 = new javax.swing.JLabel();
        Invici3 = new javax.swing.JLabel();
        Invici4 = new javax.swing.JLabel();
        Invici5 = new javax.swing.JLabel();
        Invici1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Calculador de pinches promedios.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 190, -1));

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 30));

        jLabel5.setText("Materias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, -1));

        CienciasT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CienciasT1ActionPerformed(evt);
            }
        });
        getContentPane().add(CienciasT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, -1));

        MatematicasT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatematicasT1ActionPerformed(evt);
            }
        });
        getContentPane().add(MatematicasT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, -1));
        getContentPane().add(CivicaT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, -1));
        getContentPane().add(EstudiosT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 80, -1));

        InglesT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InglesT1ActionPerformed(evt);
            }
        });
        getContentPane().add(InglesT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 80, -1));

        jLabel1.setText("Trimestre 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 70, -1));

        jLabel2.setText("Trimestre 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 80, -1));

        CienciasT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CienciasT2ActionPerformed(evt);
            }
        });
        getContentPane().add(CienciasT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, -1));
        getContentPane().add(MatematicasT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, -1));

        CivicaT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CivicaT2ActionPerformed(evt);
            }
        });
        getContentPane().add(CivicaT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 80, -1));

        EstudiosT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiosT2ActionPerformed(evt);
            }
        });
        getContentPane().add(EstudiosT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, -1));
        getContentPane().add(InglesT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 80, -1));
        getContentPane().add(CienciasT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, -1));
        getContentPane().add(MatematicasT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, -1));

        CivicaT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CivicaT3ActionPerformed(evt);
            }
        });
        getContentPane().add(CivicaT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 80, -1));
        getContentPane().add(EstudiosT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 80, -1));
        getContentPane().add(InglesT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 80, -1));

        jLabel6.setText("Trimestre3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, -1));

        jLabel8.setText("Ciencias");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setText("Matematicas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel10.setText("Civica");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel11.setText("Ingles");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 80, -1));

        jLabel13.setText("Estudios");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(Invici2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 100, 20));
        getContentPane().add(Invici3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 100, 20));
        getContentPane().add(Invici4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, 20));
        getContentPane().add(Invici5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 20));
        getContentPane().add(Invici1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CienciasT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CienciasT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CienciasT1ActionPerformed

    private void MatematicasT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatematicasT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatematicasT1ActionPerformed

    private void InglesT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InglesT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InglesT1ActionPerformed

    private void CienciasT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CienciasT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CienciasT2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double sumaCien, sumaMate, sumaEstu, sumaCivi, sumaIng, promedioCien, promedioMate, promedioEstu, promedioCivi,promedioIng ;
        String ciencias1 = CienciasT1.getText();
        String ciencias2 = CienciasT2.getText();
        String ciencias3 = CienciasT3.getText();
        double cienciast1 = Double.parseDouble(ciencias1);
        double cienciast2 = Double.parseDouble(ciencias2);
        double cienciast3 = Double.parseDouble(ciencias3);
        
        sumaCien=(cienciast1+cienciast2)+cienciast3;
        promedioCien=sumaCien/3;
        
        //double promedioC=Math.round(suma/3); asi funciona redondear de un double
        //con decimales a uno sin ellos o en ceros
        
        int promediCien = (int) promedioCien;
        Invici1.setText(""+promediCien);
        
        //____________________________________________________________
        
        String matematicas1 = MatematicasT1.getText();
        String matematicas2 = MatematicasT2.getText();
        String matematicas3 = MatematicasT3.getText();
        double matematicast1 = Double.parseDouble(matematicas1);
        double matematicast2 = Double.parseDouble(matematicas2);
        double matematicast3 = Double.parseDouble(matematicas3);
        
        sumaMate=(matematicast1+matematicast2)+matematicast3;
        promedioMate=sumaMate/3;
        
        
        int promediMate = (int) promedioMate;
        Invici2.setText(""+promediMate);
        
        //________________________________________________________________
        
        String civica1 = CivicaT1.getText();
        String civica2 = CivicaT2.getText();
        String civica3 = CivicaT3.getText();
        double civicat1 = Double.parseDouble(civica1);
        double civicat2 = Double.parseDouble(civica2);
        double civicat3 = Double.parseDouble(civica3);
        
        sumaCivi=(civicat1+civicat2)+civicat3;
        promedioCivi=sumaCivi/3;
        
        int promediCivi = (int) promedioCivi;
        Invici3.setText(""+promediCivi);
        
        
        //________________________________________________________________
        
        
        String estudios1 = EstudiosT1.getText();
        String estudios2 = EstudiosT2.getText();
        String estudios3 = EstudiosT3.getText();
        double estudiost1 = Double.parseDouble(estudios1);
        double estudiost2 = Double.parseDouble(estudios2);
        double estudiost3 = Double.parseDouble(estudios3);
        
        sumaEstu=(estudiost1+estudiost2)+estudiost3;
        promedioEstu=sumaEstu/3;
        
        //double promedioC=Math.round(suma/3); asi funciona redondear de un double
        //con decimales a uno sin ellos o en ceros
        
        int promediEstu = (int) promedioEstu;
        Invici4.setText(""+promediEstu);
        
        //______________________________________________________________
        
        String ingles1 = InglesT1.getText();
        String ingles2 = InglesT2.getText();
        String ingles3 = InglesT3.getText();
        double inglest1 = Double.parseDouble(ingles1);
        double inglest2 = Double.parseDouble(ingles2);
        double inglest3 = Double.parseDouble(ingles3);
        
        sumaIng=(inglest1+inglest2)+inglest3;
        promedioIng=sumaIng/3;
        
        int promediIng = (int) promedioIng;
        Invici5.setText(""+promediIng);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CivicaT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CivicaT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CivicaT2ActionPerformed

    private void EstudiosT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiosT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiosT2ActionPerformed

    private void CivicaT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CivicaT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CivicaT3ActionPerformed

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
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CienciasT1;
    private javax.swing.JTextField CienciasT2;
    private javax.swing.JTextField CienciasT3;
    private javax.swing.JTextField CivicaT1;
    private javax.swing.JTextField CivicaT2;
    private javax.swing.JTextField CivicaT3;
    private javax.swing.JTextField EstudiosT1;
    private javax.swing.JTextField EstudiosT2;
    private javax.swing.JTextField EstudiosT3;
    private javax.swing.JTextField InglesT1;
    private javax.swing.JTextField InglesT2;
    private javax.swing.JTextField InglesT3;
    private javax.swing.JLabel Invici1;
    private javax.swing.JLabel Invici2;
    private javax.swing.JLabel Invici3;
    private javax.swing.JLabel Invici4;
    private javax.swing.JLabel Invici5;
    private javax.swing.JTextField MatematicasT1;
    private javax.swing.JTextField MatematicasT2;
    private javax.swing.JTextField MatematicasT3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
