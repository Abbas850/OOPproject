package project;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Calculator extends javax.swing.JFrame {
    public Calculator() {
        initComponents();
        this.setMinimumSize(new Dimension(1140, 690));
         this.setLocationRelativeTo(null);
        NewVehicle.setBackground(new java.awt.Color(255, 255, 255,180));
        Model.setBackground(new java.awt.Color(255, 255, 255,180));
        Milage.setBackground(new java.awt.Color(255, 255, 255,180));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LPanel = new javax.swing.JPanel();
        Lprice = new javax.swing.JLabel();
        NewVehicle = new javax.swing.JPanel();
        LVehicle = new javax.swing.JLabel();
        Model = new javax.swing.JPanel();
        LModel = new javax.swing.JLabel();
        Milage = new javax.swing.JPanel();
        LMilage = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        modelField = new javax.swing.JTextField();
        milageField = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LPanel.setLayout(null);

        Lprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lprice.setText("Price Calculator");
        LPanel.add(Lprice);
        Lprice.setBounds(30, 10, 200, 60);

        getContentPane().add(LPanel);
        LPanel.setBounds(400, 50, 250, 80);

        NewVehicle.setLayout(null);

        LVehicle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LVehicle.setText("Enter Price of New Vehicle");
        NewVehicle.add(LVehicle);
        LVehicle.setBounds(10, 0, 320, 40);

        getContentPane().add(NewVehicle);
        NewVehicle.setBounds(120, 210, 330, 40);

        Model.setLayout(null);

        LModel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LModel.setText("Enter Model");
        Model.add(LModel);
        LModel.setBounds(10, 0, 160, 40);

        getContentPane().add(Model);
        Model.setBounds(120, 280, 170, 40);

        Milage.setLayout(null);

        LMilage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LMilage.setText("Enter Milage");
        Milage.add(LMilage);
        LMilage.setBounds(10, 0, 160, 40);

        getContentPane().add(Milage);
        Milage.setBounds(120, 350, 180, 40);

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(priceField);
        priceField.setBounds(510, 220, 130, 40);

        modelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelFieldActionPerformed(evt);
            }
        });
        getContentPane().add(modelField);
        modelField.setBounds(510, 290, 130, 40);
        getContentPane().add(milageField);
        milageField.setBounds(510, 350, 130, 40);

        Calculate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        getContentPane().add(Calculate);
        Calculate.setBounds(410, 430, 170, 60);

        Quit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        getContentPane().add(Quit);
        Quit.setBounds(890, 570, 110, 60);

        Back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(110, 550, 130, 60);

        LBackground.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Cal.jpeg"))); // NOI18N
        getContentPane().add(LBackground);
        LBackground.setBounds(0, 0, 1140, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelFieldActionPerformed
      
    }//GEN-LAST:event_modelFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
   this.dispose();
   UserLogin u  = new UserLogin();
   u.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
       String price = priceField.getText();
       String milage = milageField.getText();
       double priceD = Double.parseDouble(price);
       double milageD = Double.parseDouble(milage);
       double usedPrice = PriceCal.usedprice(milageD, priceD);
       JFrame window = new JFrame();
       window.setSize(500,300);
       window.setLocationRelativeTo(null);
       window.setVisible(true);
       JLabel j3 = new JLabel("Model :" + modelField.getText());
       JLabel j4 = new JLabel("Price Of New Car :" + priceField.getText());
       JLabel j5 = new JLabel("Milage  :" + milageField.getText());
       JLabel j6 = new JLabel("");
        JLabel jl = new JLabel("Ideal Price Range: ");
        JLabel j2 = new JLabel((usedPrice-30000 ) + "  to  " + (usedPrice + 30000));
        j3.setFont(new Font("Tahoma", Font.BOLD, 30));
        j4.setFont(new Font("Tahoma", Font.BOLD, 30));
        j5.setFont(new Font("Tahoma", Font.BOLD, 30));
        jl.setFont(new Font("Tahoma", Font.BOLD, 30));
        j2.setFont(new Font("Tahoma", Font.BOLD, 30));
        JPanel jp = new JPanel();
        window.add(jp);
        jp.add(j3);
        jp.add(j4);
        jp.add(j5);
        jp.add(j6);
        jp.add(jl);
        jp.add(j2);
        
    }//GEN-LAST:event_CalculateActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel LBackground;
    private javax.swing.JLabel LMilage;
    private javax.swing.JLabel LModel;
    private javax.swing.JPanel LPanel;
    private javax.swing.JLabel LVehicle;
    private javax.swing.JLabel Lprice;
    private javax.swing.JPanel Milage;
    private javax.swing.JPanel Model;
    private javax.swing.JPanel NewVehicle;
    private javax.swing.JButton Quit;
    private javax.swing.JTextField milageField;
    private javax.swing.JTextField modelField;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
