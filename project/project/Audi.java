/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Dimension;

/**
 *
 * @author M Daniyal Maroof
 */
public class Audi extends javax.swing.JFrame {
    public Audi() {
        initComponents();
        this.setMinimumSize(new Dimension(1140, 690));
        this.setLocationRelativeTo(null);
        LabelPanel.setBackground(new java.awt.Color(255, 255, 255,200));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        swift = new javax.swing.JButton();
        mehran = new javax.swing.JButton();
        vitra = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ciaz = new javax.swing.JButton();
        alto = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Avaiable Audi Cars");
        LabelPanel.add(jLabel2);
        jLabel2.setBounds(20, 0, 270, 60);

        getContentPane().add(LabelPanel);
        LabelPanel.setBounds(390, 10, 290, 70);

        swift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Swift_2010.jpg"))); // NOI18N
        swift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swiftActionPerformed(evt);
            }
        });
        getContentPane().add(swift);
        swift.setBounds(50, 135, 250, 200);

        mehran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Suzuki_Mehran_2012.jpg"))); // NOI18N
        mehran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mehranActionPerformed(evt);
            }
        });
        getContentPane().add(mehran);
        mehran.setBounds(400, 135, 250, 200);

        vitra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Suzuki_Vitara_2016_Pakistan.jpg"))); // NOI18N
        vitra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitraActionPerformed(evt);
            }
        });
        getContentPane().add(vitra);
        vitra.setBounds(770, 135, 250, 200);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Suzuki-wagaoR_PKDM.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 380, 250, 200);

        ciaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Suzuki_d08033d7-d285-4ba3-b0ce-d9c0961bfdbe.png"))); // NOI18N
        ciaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciazActionPerformed(evt);
            }
        });
        getContentPane().add(ciaz);
        ciaz.setBounds(400, 380, 250, 200);

        alto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Suzuki_Alto_2015.jpg"))); // NOI18N
        getContentPane().add(alto);
        alto.setBounds(50, 380, 250, 200);

        quit.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        getContentPane().add(quit);
        quit.setBounds(940, 595, 100, 50);

        back.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(50, 595, 100, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Background Audi.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void swiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swiftActionPerformed
        this.dispose();
        new Swift().setVisible(true);
    }//GEN-LAST:event_swiftActionPerformed

    private void mehranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mehranActionPerformed
        this.dispose();
        Mehran m = new Mehran();
        m.setVisible(true);
    }//GEN-LAST:event_mehranActionPerformed

    private void vitraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitraActionPerformed
        this.dispose();
        new Vitra().setVisible(true);
    }//GEN-LAST:event_vitraActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        new Wagnor().setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void ciazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciazActionPerformed
        this.dispose();
        new Ciaz().setVisible(true);
    }//GEN-LAST:event_ciazActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        Brands b = new Brands();
        b.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Audi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Audi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelPanel;
    private javax.swing.JButton alto;
    private javax.swing.JButton back;
    private javax.swing.JButton ciaz;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mehran;
    private javax.swing.JButton quit;
    private javax.swing.JButton swift;
    private javax.swing.JButton vitra;
    // End of variables declaration//GEN-END:variables
}
