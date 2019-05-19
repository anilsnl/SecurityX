
package GUIs;

import Entities.Personal;
import Settings.*;
import Settings.DBSetting;
import java.sql.*;
import Facade.*;
import Entities.*;
import Facade.Personals;
import javax.swing.JComboBox;


import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.UL;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        chkLogin = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblForget = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurityX Login");
        setMinimumSize(new java.awt.Dimension(650, 400));
        setName("frmlogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 400));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Informal Roman", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SecurityX");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 50));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giriş"));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Şifre");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 80, 88, 21);

        txtUser.setBackground(new java.awt.Color(0, 255, 255));
        txtUser.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtUser);
        txtUser.setBounds(150, 30, 220, 30);

        txtPass.setBackground(new java.awt.Color(0, 255, 255));
        txtPass.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtPass);
        txtPass.setBounds(150, 70, 220, 30);

        chkLogin.setText("Paralayı Kaydet");
        jPanel2.add(chkLogin);
        chkLogin.setBounds(150, 110, 120, 23);

        btnLogin.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/icons/frmLogin_btnLogin.png"))); // NOI18N
        btnLogin.setText("Oturum Aç");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(20, 150, 350, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Kullanıcı Adı:");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 40, 120, 21);

        lblForget.setBackground(new java.awt.Color(102, 255, 255));
        lblForget.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblForget.setForeground(new java.awt.Color(0, 0, 0));
        lblForget.setText("Beni Unut");
        lblForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgetMouseClicked(evt);
            }
        });
        jPanel2.add(lblForget);
        lblForget.setBounds(280, 110, 70, 16);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 380, 210));

        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        jMenu1.setText("Ana Sistem Ayarları");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Şifremi Sırlamak İstiyorum");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Uygulama Hakkında");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("SecurityX - Oturum Açın");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
        chechForUserInfo();
    }//GEN-LAST:event_formWindowOpened
    public static Personal activeUser;
    
    public void chechForUserInfo()
    {
        try {
            UserInfo user = UserInfo.readToFile();
            if (user != null) {
                txtUser.setText(user.User);
                txtPass.setText(user.Pass);
                chkLogin.setSelected(true);
                txtUser.setEnabled(false);
                chkLogin.setEnabled(false);
                lblForget.setVisible(true);
            } else {
                txtUser.setText("1");
                txtPass.setText("");
                chkLogin.setSelected(true);
                txtUser.setEnabled(true);
                chkLogin.setEnabled(true);
                lblForget.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        btnLogin.setText("Giriş yapiliyor...");
        if(txtPass.getText().toLowerCase().equals("") || txtUser.getText().equals(""))
        {
         //  JOptionPane.showMessageDialog(null, DBSetting.getHostDaste());
            JOptionPane.showMessageDialog(null, "Boş alanları doldurun!","SecurityX",JOptionPane.ERROR_MESSAGE);
            btnLogin.setText("Giriş Yap");
            return;
        }
        Personal p = new Personal();
        p.setEMail(txtUser.getText().toLowerCase());
        p.setPortalPass(txtPass.getText());
        Boolean a =  Facade.Personals.login(p);
        if(a)
        {
            p = Personals.getPersonalByID(p.getPersonalID());
            Entities.Log lg  = new Entities.Log();
            lg.setPersonalID(p.getPersonalID());
            lg.setOperation("LGN");
            lg.setDetail("Login");
            if(Facade.Logs.addToLog(lg))
            {
                if (chkLogin.isSelected()) {
                    UserInfo us = new UserInfo(txtUser.getText().toLowerCase(), txtPass.getText());
                    UserInfo.saveToFile(us);
                }
                frmMainMenu menu = new frmMainMenu();
                
                menu.setVisible(true);
                menu.setHostStatus(true, true);
                activeUser = p;
                this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null, "erorr");
                    
        }
        else
        {
            btnLogin.setText("Tekrar Dene");
            JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre yanlış!");
        }
        
                
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        String con = JOptionPane.showInputDialog(null,"Sistem ayarlarına erişmek için \"AYAR ERİŞİK KODUNU\" giriniz.","KecurityX - Ayar Yönetim",JOptionPane.INFORMATION_MESSAGE);
        if(con.equals("SET123"))
        {
            frmConfig m = new frmConfig();
            m.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Entered key is wrong!");
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void lblForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetMouseClicked
        // TODO add your handling code here:
        int deger;
        deger = JOptionPane.showConfirmDialog(null, "Bilgilerinizi silmek istediğinizden emin misiniz?","SecurityX",JOptionPane.YES_NO_OPTION);
        if (deger==JOptionPane.YES_OPTION) {
            UserInfo.forgetMe();
            chechForUserInfo();
        }
        
    }//GEN-LAST:event_lblForgetMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Personal p;
        String eMailValue = JOptionPane.showInputDialog(null,"Lütfen SecurityX sisteminde kayıtlı olan E Posta adresini girin!","SecurityX - Parola Sıfırlama",JOptionPane.QUESTION_MESSAGE);
        
        if (eMailValue.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Boş alan bırakmayın!","SecurityX - Parola Sıfırlama",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        p=Personals.getPersonalByEMail(eMailValue);
        if (p!=null) {
            String newPass = OtherSettings.ganeratePass();
            Mail m = new Mail();
            m.setSing("SecurityX Güvenlik Birimi");
            m.setSubject("SecurityX - Parola Sıfırlama");          
            m.setBody("Sn. "+p.getSurname()+":\nTalebiniz üzerine SecurityX portal şifreniz sıfırlanmış olup yeni şifreniz aşağıda yer almaktadır...\n\n-Yeni Şifreniz:"+newPass);
            
            Log l = new Log();
            l.setOperation("PASSR");
            l.setPersonalID(p.getPersonalID());
            l.setDetail("Parola sıfırlama talebi!");
            String[] ary = {p.getEMail()};
            int sononay = JOptionPane.showConfirmDialog(null, "Sn. "+p.getSurname()+"\nŞifreniz sıfırlanacak ve yeni şifreniz E Posta olarak tarafınıza gönderilecektir!\nOnayliyor musunuz?","SecurityX - Parola Sıfırlama",JOptionPane.YES_NO_OPTION);
            
            if (sononay==JOptionPane.YES_OPTION && Personals.changePass(p.getPortalPass(), newPass, p.getEMail())&&Mails.sendAMail(m, ary, ary.length)) {
                Logs.addToLog(l);
                JOptionPane.showMessageDialog(null, "Şifreniz sıfırlanmış olup yeni şifreniz E Potsa olarak tarafınıza gönedilmiştir","SecurityX - Parola Sıfırlama",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sunucu kaynaklı bir hata oluştu Lütfen tekrar deneyin!","SecurityX - Parola Sıfırlama",JOptionPane.ERROR_MESSAGE);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bilgilerinizi kontrol edin ve tekrar deneyin!","SecurityX - Parola Sıfırlama",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        frmAbout ab = new frmAbout();
        ab.show();
    }//GEN-LAST:event_jMenu3MouseClicked


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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblForget;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private boolean login(Personal p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
