
package GUIs;

import Entities.Log;
import Facade.Logs;
import Settings.DBSetting;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import javax.swing.JTree.*;
import javax.swing.tree.DefaultTreeCellRenderer;


public class frmMainMenu extends javax.swing.JFrame {

    
    public frmMainMenu() {
        initComponents();
    }

  
    public void setHostStatus(Boolean sqlStatu, Boolean smtpStatus)
    {
        java.util.Date trj = new java.util.Date();
        if(sqlStatu)
            lbldbdurum.setText("Bağlı");
        else
            lbldbdurum.setText("Bağlanamadı");
        if(smtpStatus)
            lblSMTPDurum.setText("Bağlı");
        else
            lblSMTPDurum.setText("Bağalamadı");
        
        LBLTRH.setText(DBSetting.getHostDaste());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblEPosta = new javax.swing.JPanel();
        lblProfilResim = new javax.swing.JLabel();
        lblNameSurname = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label11 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbldbdurum = new javax.swing.JLabel();
        lblSMTPDurum = new javax.swing.JLabel();
        LBLTRH = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecurityX ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDesktopPane1.setDoubleBuffered(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Informal Roman", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("SecurityX");

        lblEPosta.setBackground(new java.awt.Color(51, 255, 255));
        lblEPosta.setBorder(javax.swing.BorderFactory.createTitledBorder("Hoş Geldiniz:"));
        lblEPosta.setForeground(new java.awt.Color(0, 255, 255));

        lblProfilResim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/icons/frmMainMenu_Logo.png"))); // NOI18N

        lblNameSurname.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNameSurname.setText("jLabel1");

        lblTarih.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblTarih.setText("jLabel1");

        javax.swing.GroupLayout lblEPostaLayout = new javax.swing.GroupLayout(lblEPosta);
        lblEPosta.setLayout(lblEPostaLayout);
        lblEPostaLayout.setHorizontalGroup(
            lblEPostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEPostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfilResim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblEPostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameSurname)
                    .addComponent(lblTarih))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        lblEPostaLayout.setVerticalGroup(
            lblEPostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblEPostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTarih)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(lblProfilResim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sunucu Bilgileri"));

        label11.setText("DB Sunucu Durumu:");

        label1.setText("SMTP Sunucu Durumu:");

        jLabel2.setText("Bağlantı Zamanı:");

        lbldbdurum.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lbldbdurum.setText("jLabel1");

        lblSMTPDurum.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblSMTPDurum.setText("jLabel1");

        LBLTRH.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LBLTRH.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11)
                    .addComponent(label1)
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbldbdurum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLTRH)
                            .addComponent(lblSMTPDurum))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label11)
                    .addComponent(lbldbdurum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(lblSMTPDurum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LBLTRH))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblEPosta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEPosta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTree1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("SecurityX");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ana Sayfa");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ziyaretler");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Yeni Ziyaretci");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ziyaretcileri Listele");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Firmaları Listele");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("E Posta Gönder");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sakin İşlemleri");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sakinleri Görüntüle");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Yeni Sakin Girişi");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Yönetim");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("İşlem Kayıtları");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Personaller");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Personelleri Yönet");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Yeni Personel Girişi");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sistem Ayarları");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Hesabım");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setAutoscrolls(true);
        jTree1.setDoubleBuffered(true);
        jTree1.setLargeModel(true);
        jTree1.setName(""); // NOI18N
        jTree1.setPreferredSize(new java.awt.Dimension(229, 130));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 255));

        jMenu1.setText("SecurityX ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Ana Sayfa");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("E Posta İşlemleri");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);
        jMenu1.add(jSeparator6);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem14.setText("Çıkış");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Ziyaret");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Ziyaretleri Görüntüle");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Yeni Ziyaret Girişi");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);
        jMenu4.add(jSeparator1);
        jMenu4.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Ziyaretcileri Görüntüle");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Görünüm");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Menüyü Göster");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Üst Bilgi Barını Göster");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Sakinler");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sakinleri Görüntüle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Yeni Sakin Girişi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuBar1.add(jMenu8);

        jMenu12.setText("Yönetim");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("İşlem Kayıtları");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem9);
        jMenu12.add(jSeparator5);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Personelleri Yönet");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Yeni Personel Girişi");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem11);

        jMenuBar1.add(jMenu12);

        jMenu5.setText("Hesap");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem6.setText("Hesabım");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem7.setText("Güvenli Çıkiş");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);
        jMenu5.add(jSeparator3);
        jMenu5.add(jSeparator4);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem8.setText("Program Hakkında");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon simge = new ImageIcon("icon.png");
        DefaultTreeCellRenderer re = new DefaultTreeCellRenderer();
        re.setLeafIcon(simge);
        jTree1.setCellRenderer(re);
        lblNameSurname.setText(frmLogin.activeUser.getName()+" "+frmLogin.activeUser.getSurname());
        lblTarih.setText(frmLogin.activeUser.getEMail());
                
    }//GEN-LAST:event_formWindowOpened

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==2)
        {
            if(jTree1.getLeadSelectionPath().toString().contains("Yönet") && frmLogin.activeUser.getStatus()==0)
            {
                    JOptionPane.showMessageDialog(null, "sn. "+frmLogin.activeUser.getSurname()+"\nBu menüye sadece yönetim yetkisi olanlar erişebilir!","SecurityX",JOptionPane.ERROR_MESSAGE);                         
           }
            else if (jTree1.getLeadSelectionPath().toString().contains("Ana Sayfa")) {
                ifrmHomePage home = new ifrmHomePage();
                jDesktopPane1.add(home);
                home.show();
            }
            else if(jTree1.getLeadSelectionPath().toString().contains("İşlem Kayıt"))
            {
                ifrmLog log = new ifrmLog();
                jDesktopPane1.add(log);
                log.show();
            }
             else if(jTree1.getLeadSelectionPath().toString().contains("E Posta"))
            {
                ifrmMailToAll mail = new ifrmMailToAll();
                jDesktopPane1.add(mail);
                mail.show();
            }
            else if(jTree1.getLeadSelectionPath().toString().contains("Hesabım"))
            {
                ifrmMyProfile pp = new ifrmMyProfile();
                jDesktopPane1.add(pp);
                pp.show();
            }
            else if(jTree1.getLeadSelectionPath().toString().contains("Yeni Ziyaretci"))
            {
                ifrmNewVisit pp = new ifrmNewVisit();
                jDesktopPane1.add(pp);
                pp.show();
            }
            else if(jTree1.getSelectionPath().toString().contains("Ziyaretcileri "))
            {
                ifrmListVisitors ss = new ifrmListVisitors();
                jDesktopPane1.add(ss);
                ss.show();
            }
            else if(jTree1.getSelectionPath().toString().contains("Ziyaretler"))
            {
                ifrmVisits ss = new ifrmVisits();
                jDesktopPane1.add(ss);
                ss.show();
            }
            else if(jTree1.getSelectionPath().toString().contains("Firmaları Listele"))
            {
                ifrmListCompanies ss = new ifrmListCompanies();
                jDesktopPane1.add(ss);
                ss.show();
            }
             else if(jTree1.getSelectionPath().toString().contains("Yeni Sakin G"))
            {
                ifrmNewHabitant ss = new ifrmNewHabitant();
                jDesktopPane1.add(ss);
                ss.show();
            }
             else if(jTree1.getSelectionPath().toString().contains("Ziyaretler"))
            {
                ifrmVisits ss = new ifrmVisits();
                jDesktopPane1.add(ss);
                ss.show();
            }
            else if(jTree1.getSelectionPath().toString().contains("Sakinleri Görüntüle"))
            {
                ifrmLisitHabitants ss = new ifrmLisitHabitants();
                jDesktopPane1.add(ss);
                ss.show();
            }
            else if(jTree1.getSelectionPath().toString().contains("Yönetim"))
            {
                
                if(frmLogin.activeUser.getStatus()!=1)
                {
                    JOptionPane.showMessageDialog(null, "Sn. "+frmLogin.activeUser.getSurname()+"\n\t-Yönetim işlemi için yetkilendirlmediniz!","SecurityX",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (jTree1.getSelectionPath().toString().contains("Yeni Personel")) {
                    ifrmNewPersonal p = new ifrmNewPersonal();
                    jDesktopPane1.add(p);
                    p.show();
                }
                else if (jTree1.getSelectionPath().toString().contains("Personelleri")) {
                    ifrmLisitPersonals p = new ifrmLisitPersonals();
                    jDesktopPane1.add(p);
                    p.show();
                }
                else if(jTree1.getSelectionPath().toString().contains("Sistem "))
                {
                    frmConfig c = new frmConfig();
                    c.show();
                }
            }
            
           
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Log l = new Log();
        l.setPersonalID(frmLogin.activeUser.getPersonalID());
        l.setOperation("LGNOUT");
        l.setDetail("Oturum kapatıldı");
        Logs.addToLog(l);
    }//GEN-LAST:event_formWindowClosing

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxMenuItem1.isSelected()) {
            jPanel3.setVisible(true);
            jScrollPane1.setVisible(true);
        } else {
            jPanel3.setVisible(false);
            jScrollPane1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxMenuItem2.isSelected()) {
            jPanel1.setVisible(true);
        } else {
            jPanel1.setVisible(false);          
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
        ifrmVisits ss = new ifrmVisits();
        jDesktopPane1.add(ss);
        ss.show();
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
      
        ifrmNewVisit nvs = new ifrmNewVisit();
        jDesktopPane1.add(nvs);
        nvs.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ifrmVisits vs = new ifrmVisits();
        jDesktopPane1.add(vs);
        vs.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ifrmListVisitors vs = new ifrmListVisitors();
        jDesktopPane1.add(vs);
        vs.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ifrmNewHabitant nh = new ifrmNewHabitant();
        jDesktopPane1.add(nh);
        nh.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ifrmLisitHabitants h = new ifrmLisitHabitants();
        jDesktopPane1.add(h);
        h.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ifrmAbout ab = new ifrmAbout();
        jDesktopPane1.add(ab);
        ab.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        ifrmLog l = new ifrmLog();
        jDesktopPane1.add(l);
        l.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ifrmMyProfile hak = new ifrmMyProfile();
        jDesktopPane1.add(hak);
        hak.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Oturumununuz kapatılacaktır. Onayliyor musunuz?","SecurityX - Güvenli Çıkış",JOptionPane.YES_OPTION);
        if (a==JOptionPane.YES_OPTION) {
            formWindowClosing(null);
            this.setVisible(false);
            frmLogin l = new frmLogin();
            l.show();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        ifrmLisitPersonals p = new ifrmLisitPersonals();
        jDesktopPane1.add(p);
        p.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        ifrmNewPersonal p = new ifrmNewPersonal();
        jDesktopPane1.add(p);
        p.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        
        ifrmHomePage hp = new ifrmHomePage();
        jDesktopPane1.add(hp);
        hp.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        ifrmMailToAll m = new ifrmMailToAll();
        jDesktopPane1.add(m);
        m.show();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Uygulamadan çıkılsın mı?","SecurityX",JOptionPane.YES_NO_OPTION);
        
        if (value==JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLTRH;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label11;
    private javax.swing.JPanel lblEPosta;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JLabel lblProfilResim;
    private javax.swing.JLabel lblSMTPDurum;
    private javax.swing.JLabel lblTarih;
    private javax.swing.JLabel lbldbdurum;
    // End of variables declaration//GEN-END:variables
}
