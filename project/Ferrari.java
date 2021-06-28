package project;

import java.awt.Dimension;
public class Ferrari extends javax.swing.JFrame {
    public Ferrari() {
        initComponents();
        this.setMinimumSize(new Dimension(1140, 690));
        this.setLocationRelativeTo(null);
        LabelPanel.setBackground(new java.awt.Color(255, 255, 255,150));
        pront.setBackground(new java.awt.Color(255, 255, 255,150));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        pront = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LabelPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel2.setText("Avaiable Ferrari Cars");
        LabelPanel.add(jLabel2);
        jLabel2.setBounds(10, 10, 320, 70);

        getContentPane().add(LabelPanel);
        LabelPanel.setBounds(410, 20, 340, 90);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Ferrari GTC4Lusso.jpg"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 220, 350, 250);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Ferrari 488GTB.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 220, 350, 250);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Portofino Ferrarijpg.jpg"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(760, 220, 350, 250);

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 550, 120, 60);

        quit.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        getContentPane().add(quit);
        quit.setBounds(970, 550, 120, 60);

        pront.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel3.setText("Protofino Ferrarri");
        pront.add(jLabel3);
        jLabel3.setBounds(0, 0, 270, 50);

        getContentPane().add(pront);
        pront.setBounds(30, 160, 350, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Ferrari Back.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.dispose();
      Brands b = new Brands();
      b.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferrari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabelPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pront;
    private javax.swing.JButton quit;
    // End of variables declaration//GEN-END:variables
}
