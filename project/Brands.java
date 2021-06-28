package project;
import java.awt.Dimension;
public class Brands extends javax.swing.JFrame {
    public Brands() {
        initComponents();
        this.setMinimumSize(new Dimension(1140, 690));
        this.setLocationRelativeTo(null);
        BrandPanel.setBackground(new java.awt.Color(255, 255, 255,200));
      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BrandPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Suzuk = new javax.swing.JButton();
        Hond = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Toyot = new javax.swing.JButton();
        hyndai = new javax.swing.JButton();
        audi = new javax.swing.JButton();
        Toyo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BrandPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Select Brand ");
        BrandPanel.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 40);

        getContentPane().add(BrandPanel);
        BrandPanel.setBounds(450, 40, 210, 60);

        Suzuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/suzuki.JPG"))); // NOI18N
        Suzuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuzukActionPerformed(evt);
            }
        });
        getContentPane().add(Suzuk);
        Suzuk.setBounds(140, 190, 160, 120);

        Hond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Honda.jpg"))); // NOI18N
        Hond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HondActionPerformed(evt);
            }
        });
        getContentPane().add(Hond);
        Hond.setBounds(760, 190, 160, 120);

        Quit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        getContentPane().add(Quit);
        Quit.setBounds(910, 590, 110, 60);

        Back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(60, 580, 110, 60);

        Toyot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/toyota.jpg"))); // NOI18N
        Toyot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToyotActionPerformed(evt);
            }
        });
        getContentPane().add(Toyot);
        Toyot.setBounds(450, 190, 160, 120);

        hyndai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/hyundai-logo.jpg"))); // NOI18N
        hyndai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hyndaiActionPerformed(evt);
            }
        });
        getContentPane().add(hyndai);
        hyndai.setBounds(290, 400, 160, 120);

        audi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/audi-logo.jpg"))); // NOI18N
        audi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiActionPerformed(evt);
            }
        });
        getContentPane().add(audi);
        audi.setBounds(580, 400, 160, 120);

        Toyo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Select.jpeg"))); // NOI18N
        getContentPane().add(Toyo);
        Toyo.setBounds(0, 0, 1140, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuzukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuzukActionPerformed
           this.dispose();
           Suzuki s = new Suzuki();
           s.setVisible(true);
    }//GEN-LAST:event_SuzukActionPerformed

    private void HondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HondActionPerformed
        this.dispose();
        Honda h = new Honda();
        h.setVisible(true);
    }//GEN-LAST:event_HondActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
        new UserLogin().setVisible(true);
        
    }//GEN-LAST:event_BackActionPerformed

    private void ToyotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToyotActionPerformed
        this.dispose();
        Toyota t = new Toyota();
        t.setVisible(true);
    }//GEN-LAST:event_ToyotActionPerformed

    private void hyndaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hyndaiActionPerformed
        this.dispose();
        HYundai h = new HYundai();
        h.setVisible(true);
    }//GEN-LAST:event_hyndaiActionPerformed

    private void audiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiActionPerformed
      this.dispose();
      Audi a = new Audi();
      a.setVisible(true);   
    }//GEN-LAST:event_audiActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Brands().setVisible(true);
            }
       });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel BrandPanel;
    private javax.swing.JButton Hond;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Suzuk;
    private javax.swing.JLabel Toyo;
    private javax.swing.JButton Toyot;
    private javax.swing.JButton audi;
    private javax.swing.JButton hyndai;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
