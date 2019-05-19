
package GUIs;

import java.io.*;
import Settings.*;
import java.sql.Connection;
import java.util.Properties;
import javax.mail.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmConfig extends javax.swing.JFrame {

    public frmConfig() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDriver = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDBHost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDBUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JFormattedTextField();
        btnDBConTest = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSMTPHost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSMTPPort = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSMTPUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSMTPPass = new javax.swing.JPasswordField();
        btnTestCon = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SecerityX - sETTİNGS");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("frmConfig"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Uygulamanın sorunsuz şekilke çalışması için aşağıdaki ayarları kontrol edin...");

        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setNextFocusableComponent(this);

        jLabel2.setText("JDBC Adresi:");

        jLabel3.setText("Sunucu Adresi:");

        jLabel4.setText("Veri Tabanı Kullanıcı Adı:");

        jLabel5.setText("Şifre:");

        btnDBConTest.setText("Veri Tabanı Bağantısını Test Et");
        btnDBConTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBConTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDBHost)
                            .addComponent(txtDBUser)
                            .addComponent(txtPass)
                            .addComponent(btnDBConTest, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(txtDriver)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDBHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDBUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDBConTest)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Veri Tabanı Bağantı Ayarları", jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(480, 267));

        jLabel6.setText("SMTP Sunucusu::");

        jLabel7.setText("SMTP Portu:");

        jLabel8.setText("SMTP kullanıcı Adı(E Posta Adresi):");

        jLabel9.setText("SMTP Parolası:");

        btnTestCon.setText("SMTP Bağantısını Test Et");
        btnTestCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTestCon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addComponent(txtSMTPHost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSMTPPort, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSMTPUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSMTPPass, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSMTPHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSMTPPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSMTPUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSMTPPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTestCon)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("SMTP Sunucu Ayarları", jPanel1);

        btnSave.setText("Doğrula & Kaydet");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Vazgeç");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
         try
        {
            File myFile = new File("set.ads");
            if(myFile.exists())
            {
                FileInputStream fis = new FileInputStream("set.ads");
                ObjectInputStream ois = new ObjectInputStream(fis);
                MySET = (MainSettings)ois.readObject();
                txtDBHost.setText(MySET.DBHost);
                txtDBUser.setText(MySET.DBUser);
                txtPass.setText(MySET.DBPas);
                txtDriver.setText(MySET.DBDriver);
                
                //smtp
                txtSMTPHost.setText(MySET.SMTPURL);
                txtSMTPPort.setText(MySET.EMailPass);
                txtSMTPPort.setText(String.valueOf(MySET.HostPort));
                txtSMTPUser.setText(MySET.EMail);
            }
            else
            {
                int myBox = JOptionPane.showConfirmDialog(null, "The settings has not benn set yat!\nDo you want to set now","SET",JOptionPane.YES_NO_OPTION);
                if(myBox == JOptionPane.YES_OPTION)
                {
                    txtDriver.setText("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                }
                else
                {
                    System.exit(0);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDBConTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBConTestActionPerformed
        // TODO add your handling code here:
        if(textDBCon())
            JOptionPane.showMessageDialog(null, "Bağantı sağandı!");
        else
            JOptionPane.showMessageDialog(null, "Bağantı hatası");
    }//GEN-LAST:event_btnDBConTestActionPerformed

    private void btnTestConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConActionPerformed
        // TODO add your handling code here:
        
        if(testSMTP())
        {
            JOptionPane.showMessageDialog(null, "SMTP Bağantısı başarılı!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "SMTP Sunucusunu bağlanırken bir hata oluştu!");
        }
    }//GEN-LAST:event_btnTestConActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(saveSettings())
            JOptionPane.showMessageDialog(null,"Kayıt işlemi başarılı!");
        else
            JOptionPane.showMessageDialog(null, "Girdiğiniz bilgilerde hata var!");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public MainSettings MySET = new MainSettings();
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
            java.util.logging.Logger.getLogger(frmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfig().setVisible(true);
            }
        });
       
    }
    private Boolean textDBCon()
    {
       try
       {
           Class.forName(txtDriver.getText());
           Connection con = DriverManager.getConnection(txtDBHost.getText(),txtDBUser.getText(),txtPass.getText());
           
           return true;
       }
       catch(ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage());
           return false;
       }
    }
    private Boolean testSMTP()
    {
        try
        {
           Properties prop = System.getProperties();
           prop.put("mail.smtp.starttls.enable", "true");
           prop.put("mail.smtp.host", txtSMTPHost.getText());
           prop.put("mail.smtp.user", txtSMTPUser.getText());
           prop.put("mail.smtp.password", txtSMTPPass.getText());
           prop.put("mail.smtp.port", txtSMTPPort.getText());
           prop.put("mail.smtp.auth", "true");
           
           Session myss = Session.getDefaultInstance(prop,null);
           Transport tran = myss.getTransport("smtp");
           tran.connect(txtSMTPHost.getText(),txtSMTPUser.getText(),txtSMTPPass.getText());
            
            return true;
        }
        catch(MessagingException e)
        {
            return false;
        }
    }
    private Boolean saveSettings()
    {
        try {
            if(testSMTP() && textDBCon())
            {
                MainSettings ss = new MainSettings();
                //for db
                ss.DBDriver = txtDriver.getText();
                ss.DBHost = txtDBHost.getText();
                ss.DBUser = txtDBUser.getText();
                ss.DBPas= txtPass.getText();
                
                //for smtp
                ss.EMail = txtSMTPUser.getText();
                ss.EMailPass = txtSMTPPass.getText();
                ss.HostPort = Integer.parseInt(txtSMTPPort.getText());
                ss.SMTPURL = txtSMTPHost.getText();
                //to write the file
                FileOutputStream fs = new FileOutputStream("set.ads");
                ObjectOutputStream ois = new ObjectOutputStream(fs);
                ois.writeObject(ss);
                
                return true;
            }
            else
            {
                return false;
            }
            
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ayarlar kaydedilirken bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDBConTest;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTestCon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDBHost;
    private javax.swing.JTextField txtDBUser;
    private javax.swing.JTextField txtDriver;
    private javax.swing.JFormattedTextField txtPass;
    private javax.swing.JTextField txtSMTPHost;
    private javax.swing.JPasswordField txtSMTPPass;
    private javax.swing.JTextField txtSMTPPort;
    private javax.swing.JTextField txtSMTPUser;
    // End of variables declaration//GEN-END:variables
}
