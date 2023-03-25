package sanjeevaniapp.gui;

import java.awt.SplashScreen;
import javax.swing.JOptionPane;
import sanjeevaniapp.gui.LoginFrame;

public class SplashScreenFrame extends javax.swing.JFrame {

    public SplashScreenFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Loadingvalue = new javax.swing.JLabel();
        load = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        load1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 400));

        Loadingvalue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Loadingvalue.setText("0 %");
        jPanel1.add(Loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 60, 30));

        load.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        load.setText("Loading....");
        jPanel1.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 280, 20));
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 990, 30));

        load1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        load1.setText("Loading....");
        jPanel1.add(load1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreenFrame sc=new SplashScreenFrame();
sc.setVisible(true);
try{
   for(int i=0;i<100;i++){
       Thread.sleep(25);
       sc.Loadingvalue.setText(i +"%");
       if(i==10){
           sc.Loadingvalue.setText("Turning On Modules...");
       }
        if(i==20){
           sc.Loadingvalue.setText("Loading Modules...");
       }
        if(i==50){
           sc.Loadingvalue.setText("Connecting DataBase...");
       }
        if(i==70){
           sc.Loadingvalue.setText("Connecting Succesfully...");
       }
        if(i==90){
           sc.Loadingvalue.setText("Launching Application...");
           LoginFrame s=new LoginFrame();
           sc.dispose();
           s.setVisible(true);
       }
        sc.ProgressBar.setValue(i);
        
   } 
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loadingvalue;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel load;
    private javax.swing.JLabel load1;
    // End of variables declaration//GEN-END:variables
}
