package sanjeevaniapp.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dbutil.DBConnection;
import sanjeevaniapp.pojo.EmpPojo;

public class AddEmployeesFrame extends javax.swing.JFrame {

    private String empName,empSal;
    public AddEmployeesFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        generateNewId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtEmpSal = new javax.swing.JTextField();
        jcEmpJob = new javax.swing.JComboBox<>();
        txtEmpName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnAddEmp = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Employee Frame");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Luminari", 1, 48)); // NOI18N
        jLabel1.setText("Sanjeevani  Application ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 580, 12));

        jSeparator1.setBackground(new java.awt.Color(250, 248, 196));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 610, 70));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1010, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(234, 243, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmpSal.setBackground(new java.awt.Color(204, 224, 251));
        txtEmpSal.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 1, 18)); // NOI18N
        jPanel4.add(txtEmpSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 110, 284, 35));

        jcEmpJob.setBackground(new java.awt.Color(204, 224, 251));
        jcEmpJob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcEmpJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "DOCTOR", "RECEPTIONIST" }));
        jPanel4.add(jcEmpJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 105, 271, 35));

        txtEmpName.setBackground(new java.awt.Color(204, 224, 251));
        txtEmpName.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 1, 18)); // NOI18N
        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 45, 284, -1));

        txtEmpId.setEditable(false);
        txtEmpId.setBackground(new java.awt.Color(204, 224, 251));
        txtEmpId.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 1, 18)); // NOI18N
        jPanel4.add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 44, 271, 35));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee Id");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 44, 124, 24));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 44, -1, 25));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Job");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 110, 118, 25));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Salary");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 105, 145, 35));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 163, 870, 12));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 153));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 181, 111, -1));

        btnAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(0, 153, 153));
        btnAddEmp.setText("ADD EMP");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 181, 335, -1));

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 153, 153));
        btnBack1.setText("LOGOUT");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 181, 139, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 990, 215));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
     boolean isInputValid=validateInputs();
     if(!isInputValid){
         JOptionPane.showMessageDialog(null, "Please input all the data!");
         return;
     }
     try{
         double eSal=Double.parseDouble(empSal);
         EmpPojo emp=new EmpPojo();
         emp.setEmpId(txtEmpId.getText().trim());
         emp.setEmpName(empName);
         emp.setEmpSal(eSal);
         emp.setEmpDept(jcEmpJob.getSelectedItem().toString());
         boolean result=EmpDao.addEmp(emp);
         if(result){
          JOptionPane.showMessageDialog(null, "Record addedd successfully");
          generateNewId();
          return;
         }
         JOptionPane.showMessageDialog(null, "Could not add the record! Try Again");    
     }
     catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
     catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please input numeric salary!"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       ManageEmployeeFrame mef=new ManageEmployeeFrame();
       mef.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are you soure","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Thank you");
            LoginFrame sd=new LoginFrame();
            sd.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JComboBox<String> jcEmpJob;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpSal;
    // End of variables declaration//GEN-END:variables

    private void generateNewId() {
        try{
            String empId=EmpDao.getNextEmpId();
            txtEmpId.setText(empId);
            txtEmpName.setText("");
            txtEmpSal.setText("");
            jcEmpJob.setSelectedIndex(0);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        empName=txtEmpName.getText().trim();
        empSal=txtEmpSal.getText().trim();
        if(empName.isEmpty()||empSal.isEmpty())
            return false;
        return true;
    }
}