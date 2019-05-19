/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Settings.DBSetting;
import java.sql.*;
import Entities.*;
import Facade.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;
import net.proteanit.sql.*;
import java.awt.print.*;
import java.text.*;
import java.time.LocalDate;
import javax.swing.JTable;
/**
 *
 * @author anild
 */
public class ifrmHomePage extends javax.swing.JInternalFrame {

    /**
     * Creates new form HomePage
     */
    public ifrmHomePage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblToplamZiyaretci = new javax.swing.JLabel();
        lblToplamSakin = new javax.swing.JLabel();
        lblToplamIslem = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTotalVisits = new javax.swing.JLabel();
        lbllVisitInDay = new javax.swing.JLabel();
        lblTotalCars = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblGun = new javax.swing.JLabel();
        lblAyYil = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtSonZiyaretler = new javax.swing.JTable();
        btnInDayOp = new javax.swing.JButton();
        btnLast25OP = new javax.swing.JButton();
        btnMyLast25OP = new javax.swing.JButton();
        btnNewVisit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("HomePage");
        setAutoscrolls(true);
        setFocusTraversalPolicyProvider(true);
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
        addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                formVetoableChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Son İsnatislikler"));
        jPanel1.setForeground(new java.awt.Color(51, 255, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Toplam İşlem");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Toplam Ziyaretci");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel4.setText("Toplam Sakin");

        lblToplamZiyaretci.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblToplamZiyaretci.setText("000");

        lblToplamSakin.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblToplamSakin.setText("000");

        lblToplamIslem.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblToplamIslem.setText("000");

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel8.setText("000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel5.setText("Toplam Ziyaretler:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel6.setText("Gün içi Ziyaretler:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel7.setText("Toplam Araçlar:");

        lblTotalVisits.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblTotalVisits.setText("000");

        lbllVisitInDay.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lbllVisitInDay.setText("000");

        lblTotalCars.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        lblTotalCars.setText("000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamZiyaretci)
                    .addComponent(lblToplamIslem))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbllVisitInDay))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalVisits)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamSakin)
                    .addComponent(lblTotalCars))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(453, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalVisits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(lblToplamIslem)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(lblTotalCars)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamZiyaretci, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(lbllVisitInDay)
                        .addComponent(jLabel4)
                        .addComponent(lblToplamSakin)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Takvim"));

        lblGun.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblGun.setText("00");

        lblAyYil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAyYil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAyYil.setText("jLabel5");
        lblAyYil.setToolTipText("");
        lblAyYil.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblYear.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGun, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAyYil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAyYil)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGun, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblYear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbtSonZiyaretler.setBackground(new java.awt.Color(51, 0, 51));
        tbtSonZiyaretler.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbtSonZiyaretler.setForeground(new java.awt.Color(204, 255, 255));
        tbtSonZiyaretler.setModel(new javax.swing.table.DefaultTableModel(
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
        tbtSonZiyaretler.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbtSonZiyaretler.setRowHeight(20);
        tbtSonZiyaretler.setRowMargin(2);
        tbtSonZiyaretler.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tbtSonZiyaretler);

        btnInDayOp.setText("Gün İçi Ziyaretler");
        btnInDayOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDayOpActionPerformed(evt);
            }
        });

        btnLast25OP.setText("Son 25 Ziyaret");
        btnLast25OP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast25OPActionPerformed(evt);
            }
        });

        btnMyLast25OP.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnMyLast25OP.setText("30 Gümlük Z. Raporu");
        btnMyLast25OP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyLast25OPActionPerformed(evt);
            }
        });

        btnNewVisit.setText("Son 25 İşlemim");
        btnNewVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewVisitActionPerformed(evt);
            }
        });

        jButton1.setText("Tabloyu Yazdır veya PDF al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ziyaret/Daire Dağlımı");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInDayOp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast25OP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMyLast25OP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewVisit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInDayOp)
                    .addComponent(btnLast25OP)
                    .addComponent(btnMyLast25OP)
                    .addComponent(btnNewVisit)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_formVetoableChange
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_formVetoableChange

    private void formİnternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formİnternalFrameOpened
        // TODO add your handling code here:
        LocalDate dy = LocalDate.now();
        
        lblGun.setText(String.valueOf(dy.getDayOfMonth()));
        lblAyYil.setText(String.valueOf(dy.getMonth()));
        lblYear.setText(String.valueOf(dy.getYear()));
        
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps1 = con.prepareCall("select count(Name) from Habitants");
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next())
            {
                lblToplamSakin.setText(rs1.getString(1));
            }
            PreparedStatement ps2 = con.prepareStatement("select count(LogID) from Log");
            ResultSet rs2 = ps2.executeQuery();
            if(rs2.next())
            {
                lblToplamIslem.setText(rs2.getString(1));
            }
            PreparedStatement ps3 = con.prepareStatement("select count(Name) from Visitors");
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {                
                lblToplamZiyaretci.setText(rs3.getString(1));
            }
            PreparedStatement pr5 = con.prepareStatement("select count(VisitID) from Visits");
            ResultSet rs00 = pr5.executeQuery();
            if (rs00.next()) {
                lblTotalVisits.setText(rs00.getString(1));
            }
            PreparedStatement ps6= con.prepareStatement("select count(CarID) from HCars");
            ResultSet rs6 = ps6.executeQuery();
            if (rs6.next()) {
                lblTotalCars.setText(rs6.getString(1));
            }
            PreparedStatement PS5= con.prepareStatement("select count(VisitID) from HomePage where VisitDate=CAST(dbo.GetLocalDate(3) as date)");
            ResultSet rs01 = PS5.executeQuery();
            if (rs01.next()) {
                lbllVisitInDay.setText(rs01.getString(1));
            }
            PreparedStatement pr = con.prepareStatement("select VisitID AS ZiyaretID,VisitDate as ZiyaretTarihi, VisitTime as ZiyaretSaati " +
",VisitorName as ZiyaretciAdi,Company as Firma,ApartmentID as Daire, VisitedName as ZiyaretEdilenKişi,PersonalName as Görevli " +
"from HomePage order by VisitID desc");
            ResultSet rs = pr.executeQuery();
            tbtSonZiyaretler.setModel(DbUtils.resultSetToTableModel(rs));
            DBSetting.closeToCan();
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bit hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formİnternalFrameOpened

    private void btnInDayOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDayOpActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select VisitID AS ZiyaretID,VisitDate as ZiyaretTarihi, VisitTime as ZiyaretSaati " +
",VisitorName as ZiyaretciAdi,Company as Firma,ApartmentID as Daire, VisitedName as ZiyaretEdilenKişi,PersonalName as Görevli" +
" from HomePage where VisitDate=CAST(dbo.GetLocalDate(3) as date) order by VisitID desc");
            ResultSet rs = ps.executeQuery();
            tbtSonZiyaretler.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hata oluştu!");
        }
    }//GEN-LAST:event_btnInDayOpActionPerformed

    private void btnLast25OPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast25OPActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select top(25) VisitID AS ZiyaretID,VisitDate as ZiyaretTarihi, VisitTime as ZiyaretSaati " +
",VisitorName as ZiyaretciAdi,Company as Firma,ApartmentID as Daire, VisitedName as ZiyaretEdilenKişi,PersonalName as Görevli " +
"from HomePage order by VisitID desc");
            ResultSet rs = ps.executeQuery();
            tbtSonZiyaretler.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLast25OPActionPerformed

    private void btnMyLast25OPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyLast25OPActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select top(30) VisitDate as Tarih, count(*) as ToplamZiyaret from HomePage\n" +
"group by VisitDate order by VisitDate desc");
            ResultSet rs = ps.executeQuery();
            tbtSonZiyaretler.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            DBSetting.closeToCan();
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hata oluştu!");
        }
    }//GEN-LAST:event_btnMyLast25OPActionPerformed

    private void btnNewVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewVisitActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select top(25) VisitID AS ZiyaretID,VisitDate as ZiyaretTarihi, VisitTime as ZiyaretSaati " +
",VisitorName as ZiyaretciAdi,Company as Firma,ApartmentID as Daire, VisitedName as ZiyaretEdilenKişi,PersonalName as Görevli " +
"from HomePage where PersonalName=? order by VisitID desc");
            ps.setString(1, frmLogin.activeUser.getName()+" "+frmLogin.activeUser.getSurname());
            ResultSet rs = ps.executeQuery();
            tbtSonZiyaretler.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hata oluştu!");
        }
        
    }//GEN-LAST:event_btnNewVisitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat hdr = new MessageFormat("SucurityX Ziyaret Dökümü");
            MessageFormat ftr = new MessageFormat(frmLogin.activeUser.getName()+" "+frmLogin.activeUser.getSurname()+" tarafından Çıkartıldı!");
            tbtSonZiyaretler.print(JTable.PrintMode.NORMAL,hdr,ftr);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Yazdırma sırasında bir hata oluştu!\n-"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select ApartmentID AS Daire,count(*) as ToplamZiyaret\n" +
"from HomePage group by ApartmentID ");
            ResultSet rs = ps.executeQuery();
            tbtSonZiyaretler.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInDayOp;
    private javax.swing.JButton btnLast25OP;
    private javax.swing.JButton btnMyLast25OP;
    private javax.swing.JButton btnNewVisit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAyYil;
    private javax.swing.JLabel lblGun;
    private javax.swing.JLabel lblToplamIslem;
    private javax.swing.JLabel lblToplamSakin;
    private javax.swing.JLabel lblToplamZiyaretci;
    private javax.swing.JLabel lblTotalCars;
    private javax.swing.JLabel lblTotalVisits;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lbllVisitInDay;
    private javax.swing.JTable tbtSonZiyaretler;
    // End of variables declaration//GEN-END:variables
}