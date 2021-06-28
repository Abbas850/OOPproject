package project;
import java.awt.Dimension;
public class AdminLogin extends javax.swing.JFrame {
    public AdminLogin() {
        initComponents();
        this.setMinimumSize(new Dimension(1140, 690));
        this.setLocationRelativeTo(null);
        APanel.setBackground(new java.awt.Color(255, 255, 255,250));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        APanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextLogin = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        passError = new javax.swing.JLabel();
        loginerror = new javax.swing.JLabel();
        TextPassward = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        APanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admin Login");
        APanel.add(jLabel1);
        jLabel1.setBounds(160, 30, 180, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Login");
        APanel.add(jLabel3);
        jLabel3.setBounds(50, 160, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Passward");
        APanel.add(jLabel4);
        jLabel4.setBounds(50, 240, 100, 30);
        APanel.add(TextLogin);
        TextLogin.setBounds(220, 170, 90, 30);

        Done.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        APanel.add(Done);
        Done.setBounds(190, 310, 140, 50);

        Back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        APanel.add(Back);
        Back.setBounds(10, 460, 100, 50);

        Quit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        APanel.add(Quit);
        Quit.setBounds(370, 460, 110, 50);

        passError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        APanel.add(passError);
        passError.setBounds(340, 240, 140, 30);

        loginerror.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        APanel.add(loginerror);
        loginerror.setBounds(340, 170, 140, 30);
        APanel.add(TextPassward);
        TextPassward.setBounds(220, 240, 90, 30);

        getContentPane().add(APanel);
        APanel.setBounds(340, 70, 500, 520);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Login.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
        FirstWindow w = new FirstWindow();
        w.setVisible(true);    
    }//GEN-LAST:event_BackActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        boolean check1  = false;
        boolean check2  = false;
        boolean check = false;
       String s = "admin";
       String p  = "12345";
       String s1 = TextLogin.getText().toLowerCase();
       String p1 = TextPassward.getText();
       if(s.equals(s1)){
           check1 = true;
          
       }
        if(p.equals(p1)){
           check2 = true;
         
       }
           if(check1 == false){
           loginerror.setOpaque(true);
           loginerror.setText("Invalid Admin name");
       }   
          if(check2 == false){
           passError.setOpaque(true);
           passError.setText("Invalid Passward");
       }  
    
       if ( check1 && check2 ){
              check = true;
          }
        System.out.println(check1);
         if(check){
             System.out.println("yes");
             this.dispose();
             new Admin().setVisible(true);
         }
             
    }//GEN-LAST:event_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel APanel;
    private javax.swing.JButton Back;
    private javax.swing.JButton Done;
    private javax.swing.JButton Quit;
    private javax.swing.JTextField TextLogin;
    private javax.swing.JPasswordField TextPassward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loginerror;
    private javax.swing.JLabel passError;
    // End of variables declaration//GEN-END:variables
}
