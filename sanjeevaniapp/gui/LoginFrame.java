package sanjeevaniapp.gui;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.User;
import sanjeevaniapp.pojo.UserProfile;
import sanjeevaniapp.utility.PasswordEncryption;

public class LoginFrame extends javax.swing.JFrame {

    private String loginId,password;
    public LoginFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        super.setTitle("Login Panel");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jrbAdmin3 = new javax.swing.JRadioButton();
        jrbDoctors = new javax.swing.JRadioButton();
        jrbReceptionist3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel1.setText("Sanjeevani  Application ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 580, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 620, 70));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 580, 10));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -230, 1090, 680));

        jPanel2.setBackground(new java.awt.Color(234, 243, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 900, 10));

        txtPassword.setBackground(new java.awt.Color(204, 224, 251));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 385, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Login ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 25));

        txtUserId.setBackground(new java.awt.Color(204, 224, 251));
        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUserId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 380, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 23));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("User Type");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 25));

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, -1));

        btnQuit.setBackground(new java.awt.Color(204, 204, 255));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 260, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 900, 10));

        jrbAdmin3.setBackground(new java.awt.Color(234, 243, 250));
        buttonGroup1.add(jrbAdmin3);
        jrbAdmin3.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        jrbAdmin3.setText("Admin");
        jrbAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdmin3ActionPerformed(evt);
            }
        });
        jPanel2.add(jrbAdmin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jrbDoctors.setBackground(new java.awt.Color(234, 243, 250));
        buttonGroup1.add(jrbDoctors);
        jrbDoctors.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        jrbDoctors.setText("Doctor");
        jPanel2.add(jrbDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jrbReceptionist3.setBackground(new java.awt.Color(234, 243, 250));
        buttonGroup1.add(jrbReceptionist3);
        jrbReceptionist3.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        jrbReceptionist3.setText("Receptionist");
        jrbReceptionist3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbReceptionist3ActionPerformed(evt);
            }
        });
        jPanel2.add(jrbReceptionist3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 980, 215));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean isInputValid=validateInputs();
        if(isInputValid==false){
            JOptionPane.showMessageDialog(null,"Please input id and password");
            return;
        }
        String userType=getUserType();
        if(userType==null){
            JOptionPane.showMessageDialog(null,"Please select a user type");
            return;
        }
        try{
            User user=new User();
            user.setLoginId(loginId);
            String pwd=new String(PasswordEncryption.getEncryptedPassword(password));
            user.setPassword(pwd);
            user.setUserType(userType.toUpperCase());
            String userName=UserDao.validateUser(user);
            if(userName!=null){
                JOptionPane.showMessageDialog(null,"Welcome "+userName,"Login success!",JOptionPane.INFORMATION_MESSAGE);
                UserProfile.setUserName(userName);
                UserProfile.setUserType(userType);
                UserProfile.setUserId(loginId);
                JFrame optionsFrame=null;
                if(userType.equalsIgnoreCase("admin")){
                   optionsFrame=new AdminOptionsFrame();
                }
                else if(userType.equalsIgnoreCase("receptionist")){
                   optionsFrame=new ReceptionistOptionsFrame();
                }
                else if(userType.equalsIgnoreCase("doctor")){
                    optionsFrame=new DoctorsOptionsFrame();
                }
                optionsFrame.setVisible(true);
                this.dispose();
                return; 
            }
            else
            JOptionPane.showMessageDialog(null,"Invalid UserId/Password","Login Denied",JOptionPane.ERROR_MESSAGE);
   clear();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are You Sure?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (ans==JOptionPane.YES_OPTION){
            DBConnection.closeConnection();
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void jrbReceptionist3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbReceptionist3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbReceptionist3ActionPerformed

    private void jrbAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAdmin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAdmin3ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton jrbAdmin3;
    private javax.swing.JRadioButton jrbDoctors;
    private javax.swing.JRadioButton jrbReceptionist3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        loginId=txtUserId.getText().trim();
        char []pwd=txtPassword.getPassword();
        if(loginId.isEmpty()|| pwd.length==0)
            return false;
        password=new String(pwd);
        return true;   
    }
    private String getUserType() {
        if(jrbAdmin3.isSelected())
            return jrbAdmin3.getText();
        else if(jrbDoctors.isSelected())
            return jrbDoctors.getText();
        else if(jrbReceptionist3.isSelected())
            return jrbReceptionist3.getText();
        return null;
    }
    private void clear() {
       txtUserId.setText("");
       txtPassword.setText("");
       txtUserId.requestFocus();
      buttonGroup1.clearSelection();
    }
}
