package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.AppointmentDao;
import sanjeevaniapp.pojo.AppointmentPojo;
import sanjeevaniapp.utility.Sender;
import sanjeevaniapp.utility.SmsSender;

public class ConformAppointmentFrame extends javax.swing.JFrame {

    private AppointmentPojo app;
    public ConformAppointmentFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
    }
    public ConformAppointmentFrame(AppointmentPojo app){
        this();
        this.app=app;
        txtPadId.setText(app.getPatientId());
        txtPadName.setText(app.getPatientName());
        this.txtOPD.setText(app.getOpd());
        txtAppoint.setText(app.getAppointmentDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPadId = new javax.swing.JTextField();
        txtPadName = new javax.swing.JTextField();
        txtOPD = new javax.swing.JTextField();
        txtAppoint = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnConform = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -220, 990, 510));

        jPanel2.setBackground(new java.awt.Color(200, 240, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Appointment Confirmation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient ID");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("OPD");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Appointment Date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        txtPadId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtPadId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 250, -1));

        txtPadName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPadName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtPadName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 210, -1));

        txtOPD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtOPD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, -1));

        txtAppoint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(txtAppoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 210, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 900, 130));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Appointmnet Scheduled");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 40));

        btnConform.setBackground(new java.awt.Color(204, 204, 204));
        btnConform.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConform.setForeground(new java.awt.Color(0, 204, 0));
        btnConform.setText("Confirm");
        btnConform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConformActionPerformed(evt);
            }
        });
        jPanel2.add(btnConform, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 200, 40));

        btnCancle.setBackground(new java.awt.Color(204, 204, 204));
        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(0, 204, 0));
        btnCancle.setText("Cancle");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 110, 40));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 440, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 290, 10, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 990, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPadNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPadNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AppointmentRequestFrame mv=new AppointmentRequestFrame();
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnConformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConformActionPerformed
        String dateStr=jSpinner1.getValue().toString();
      DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
      LocalDateTime appDateTime=LocalDateTime.parse(dateStr,dtf);
      LocalDateTime currDateTime=LocalDateTime.now();

        int ans=appDateTime.compareTo(currDateTime);
       
      if(ans>0){
           DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a");
           String appDateTimeStr=appDateTime.format(dtf2);
           app.setAppointmentDate(appDateTimeStr);
           app.setStatus("CONFIRM");
           try{
               boolean result=AppointmentDao.updateStatus(app);
               if(result){
                   Sender obj=new SmsSender();
                  String msg="Hello "+app.getPatientName()+"\nYour appointment is fixed at "+appDateTimeStr+" with Dr. " +app.getDoctorName();
                  boolean smsResult=obj.send(app.getMobileNo(), msg);
                 
                 if(smsResult){
                      
                      JOptionPane.showMessageDialog(this, "Message Sent");
                   }else{
                      JOptionPane.showMessageDialog(this, "Message Sending Failed");
                  } 
              }      
            }
           catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "DB Error");
                ex.printStackTrace();
           }    
           catch(Exception ex2){
                    JOptionPane.showMessageDialog(this, "Error In Sending SMS");
                    ex2.printStackTrace();
                   }
      }else{
          JOptionPane.showMessageDialog(this, "Appointment should be after current time");
      }
    }//GEN-LAST:event_btnConformActionPerformed

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
            java.util.logging.Logger.getLogger(ConformAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConformAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConformAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConformAppointmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConformAppointmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnConform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtAppoint;
    private javax.swing.JTextField txtOPD;
    private javax.swing.JTextField txtPadId;
    private javax.swing.JTextField txtPadName;
    // End of variables declaration//GEN-END:variables
}
