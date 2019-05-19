/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;
import net.proteanit.sql.*;
import Settings.DBSetting;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author anild
 */
public class ifrmLog extends javax.swing.JInternalFrame {

    /**
     * Creates new form Log
     */
    public ifrmLog() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbPersonals = new javax.swing.JComboBox<>();
        cbSelectDate = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtLogType = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Geçmiş İşelm Kayıtları");
        setInheritsPopupMenu(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formİnternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setText("Tarihe Göre Sırala");

        jLabel3.setText("Personele Göre Fitrele");

        cbPersonals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tüm Personaller-" }));
        cbPersonals.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPersonalsItemStateChanged(evt);
            }
        });

        cbSelectDate.setMaximumRowCount(20);
        cbSelectDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yeniden Esiye(son 200)", "Eskiden Yeniye" }));
        cbSelectDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSelectDateItemStateChanged(evt);
            }
        });

        jLabel4.setText("İşleme Göre Fitrele");

        txtLogType.setMaximumRowCount(12);
        txtLogType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Tümü-" }));
        txtLogType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtLogTypeItemStateChanged(evt);
            }
        });

        jButton2.setText("Sıfırla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Bugün");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Dün");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bu Hafta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Girişler");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setText("Tabloyu Yazdır");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Gün-İşlemDağılımı");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbPersonals, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogType, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPersonals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(11, 11, 11))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 674, 120));

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLog.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(tblLog);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 115, 850, 520));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int value = JOptionPane.showConfirmDialog(null, "Tüm fitreler sıfırlansın mı?","Onay",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(value==JOptionPane.NO_OPTION)
        {
            return;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formİnternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formİnternalFrameOpened
        // TODO add your handling code here:
        try {
            Connection conn = DBSetting.openTocan();
            PreparedStatement ps = conn.prepareStatement("select top(80) LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat,\n" +
"Operation as İşlem, Detail as Açıklama from LogView order by LogID desc");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
            PreparedStatement psPersonals = conn.prepareStatement("SELECT PersonalID,Name+' '+Surname FROM Personals");
            ResultSet rs2 = psPersonals.executeQuery();
            while (rs2.next()) {
                String Value = String.valueOf(rs2.getInt(1))+"-"+rs2.getString(2);
                cbPersonals.addItem(Value);
            }
            PreparedStatement ps3 = conn.prepareStatement("select Date,count(LogID) from LogView group by Date order by Date desc");
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {                
                cbSelectDate.addItem(rs3.getString(1));
            }
            
            
            PreparedStatement psLogType = conn.prepareStatement("select Operation,count(*) from Log group by Operation order by Operation");
            ResultSet rsLogType = psLogType.executeQuery();
            while (rsLogType.next()) {                
                txtLogType.addItem(rsLogType.getString(1));
            }
          //  conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veriler yüklenirken bir hata oluştu!\n-"+e.getMessage());
        }
    }//GEN-LAST:event_formİnternalFrameOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Date = cast(dbo.GetLocalDate(3) as Date) order by LogID desc");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veriler çekilirken bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Date = dateadd(day,-1,cast(dbo.GetLocalDate(3) as Date)) order by LogID desc");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veriler çekilirken bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Date = dateadd(day,-7,cast(dbo.GetLocalDate(3) as Date)) order by LogID desc");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veriler çekilirken bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Operation='LGN' order by LogID desc");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veriler çekilirken bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cbSelectDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSelectDateItemStateChanged
        // TODO add your handling code here:
        try {
            String SQL;
            switch(cbSelectDate.getSelectedIndex())
            {
                case 0:
                    SQL = "select TOP(200) LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView order by LogID desc";
                    break;
                case 1:
                    SQL="select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView order by LogID";
                    break;
                default :
                    SQL = "select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Date = '"+cbSelectDate.getSelectedItem().toString()+"' order by LogID desc";
                    break;
            }
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veri çekme hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbSelectDateItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select Date as Tarih,count(*) as İşlemSayısı from LogView group by Date order by Date DESC");
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veri listeleme hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLogTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtLogTypeItemStateChanged
        // TODO add your handling code here:
        
        try {
            String SQL;
            switch(txtLogType.getSelectedIndex())
            {
                case 0:
                    SQL = "select TOP(200) LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView order by LogID desc";
                    break;
                default :
                    SQL = "select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Operation = '"+txtLogType.getSelectedItem().toString()+"' order by LogID desc";
                    break;
            }
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veri çekme hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_txtLogTypeItemStateChanged

    private void cbPersonalsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPersonalsItemStateChanged
        // TODO add your handling code here:
         try {
            String SQL;
            switch(cbPersonals.getSelectedIndex())
            {
                case 0:
                    SQL = "select TOP(200) LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView order by LogID desc";
                    break;
                default :
                    String[] ary = cbPersonals.getSelectedItem().toString().split(". ");
                    SQL = "select LogID AS İşlemID,PersonalID as PersonelID, PersonalName as Personel, Date as Tarih,Time as Saat," +
"Operation as İşlem, Detail as Açıklama from LogView where Operation = '"+ary[1]+"' order by LogID desc";
                    break;
            }
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            tblLog.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Veri çekme hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbPersonalsItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat hdr = new MessageFormat("SucurityX Ziyaret Dökümü");
            MessageFormat ftr = new MessageFormat(frmLogin.activeUser.getName()+" "+frmLogin.activeUser.getSurname()+" tarafından Çıkartıldı!");
            tblLog.print(JTable.PrintMode.NORMAL,hdr,ftr);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Yazdırma sırasında bir hata oluştu!\n-"+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPersonals;
    private javax.swing.JComboBox<String> cbSelectDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLog;
    private javax.swing.JComboBox<String> txtLogType;
    // End of variables declaration//GEN-END:variables
}