/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Entities.Log;
import Entities.Visitor;
import Facade.Logs;
import Facade.Visitors;
import Settings.DBSetting;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.*;
import java.util.*;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anil.senel
 */
public class ifrmListVisitors extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmListVisitors
     */
    public ifrmListVisitors() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtScanForVisitors = new javax.swing.JTextField();
        lblTatalVisitor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblPersonalID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblVisitorID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSumVisit = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTRIDNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBirthYear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbisTRS = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        lblSavaDate = new javax.swing.JLabel();
        btnStartToEdit = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVisits = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstList = new javax.swing.JList<>();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setClosable(true);
        setResizable(true);
        setTitle("Ziyaretcileri Listele");
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
                formİnternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formİnternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtScanForVisitors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtScanForVisitorsKeyPressed(evt);
            }
        });
        getContentPane().add(txtScanForVisitors, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, -1));

        lblTatalVisitor.setText("Toplam 00 Ziyaretciden Arama Yapın");
        getContentPane().add(lblTatalVisitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 25, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Temel Bilgiler"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/icons/frmMainMenu_Logo.png"))); // NOI18N

        btnUpdate.setText("Güncelle");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Sıfırla");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setText("Sil");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Adı/Soadı:");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setEnabled(false);

        txtSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSurname.setEnabled(false);

        jLabel5.setText("Personel ID:");

        lblPersonalID.setText("00");

        jLabel7.setText("ZiyaretciID:");

        lblVisitorID.setText("00");

        jLabel9.setText("Tplam Ziyaret:");

        lblSumVisit.setText("00");

        jLabel11.setText("TCKNo/Cep Tel:");

        txtTRIDNo.setEnabled(false);

        jLabel12.setText("Doğum Yılı:");

        txtBirthYear.setEnabled(false);

        jLabel13.setText("Uyruk:");

        cbisTRS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yabancı", "TC" }));
        cbisTRS.setEnabled(false);

        jLabel14.setText("Kayıt Tarihi:");

        lblSavaDate.setText("0000-00-00 00.00.00");

        btnStartToEdit.setText("Bilgileri Düzenle");
        btnStartToEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartToEditActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblVisitorID)
                                            .addComponent(lblPersonalID)
                                            .addComponent(lblSumVisit)
                                            .addComponent(lblSavaDate)))))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSurname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTRIDNo)
                                    .addComponent(txtBirthYear)
                                    .addComponent(cbisTRS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStartToEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPersonalID)
                    .addComponent(jLabel11)
                    .addComponent(txtTRIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblVisitorID)
                    .addComponent(jLabel12)
                    .addComponent(txtBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblSumVisit)
                    .addComponent(jLabel13)
                    .addComponent(cbisTRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSavaDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset)
                    .addComponent(btnDelete)
                    .addComponent(btnStartToEdit))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 560, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulunduğu Ziyaretler"));

        tblVisits.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblVisits);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 560, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Araçlar"));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblCars);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 560, 140));

        jButton1.setText("ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 70, -1));

        lstList.setBackground(new java.awt.Color(51, 51, 0));
        lstList.setForeground(new java.awt.Color(0, 255, 255));
        lstList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListMouseClicked(evt);
            }
        });
        lstList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listAndSearch(String text)
    {
        try {
            if(text.equals(""))
            {
                try {
                   Connection con = DBSetting.openTocan();
                   PreparedStatement ps = con.prepareStatement("select Name+' '+Surname from Visitors");
                   ResultSet rs = ps.executeQuery();
                  // tblList.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                  DefaultListModel lst = new DefaultListModel();
            while (rs.next()) {                
                lst.addElement(rs.getString(1) +". "+rs.getString(2));
            }
            lstList.setModel(lst);
                } catch (SQLException e) {
            }
            }
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from LVsView WHERE Nama LIKE '%"+text+"%'");
            ResultSet rs = ps.executeQuery();
         //   tblList.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         DefaultListModel lst = new DefaultListModel();
            while (rs.next()) {                
                lst.addElement(rs.getString(1) +". "+rs.getString(2));
            }
            lstList.setModel(lst);
        } catch (SQLException e) {
        }
    }
    void listName()
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from LVsView");
            ResultSet rs = ps.executeQuery();
          
          
            DefaultListModel lst = new DefaultListModel();
            while (rs.next()) {                
                lst.addElement(rs.getString(1) +". "+rs.getString(2));
            }
            lstList.setModel(lst);
            PreparedStatement psTotalVConut = con.prepareStatement("select count(*) from Visitors");
            ResultSet rsVCount = psTotalVConut.executeQuery();
            if (rsVCount.next()) {
                lblTatalVisitor.setText("Toplam "+rsVCount.getString(1)+" Ziyaretci arasından arama yapın...");
            }
        } catch (SQLException e) {
        }
    }
    private void formİnternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formİnternalFrameOpened
        // TODO add your handling code here:
        listName();
       
    }//GEN-LAST:event_formİnternalFrameOpened

    private void txtScanForVisitorsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScanForVisitorsKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtScanForVisitorsKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listAndSearch(txtScanForVisitors.getText().toUpperCase());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lstListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lstListMouseClicked

    private void lstListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstListValueChanged
        // TODO add your handling code here:
        btnStartToEdit.setSelected(false);
        btnStartToEditActionPerformed(null);
         String selectedValue;
        selectedValue = lstList.getSelectedValue();
        
        
        String[] myTempArray = selectedValue.split(". ");
        lblVisitorID.setText(myTempArray[0]);
        curentVisitor = Visitors.getVisitorByVisitorID(Integer.parseInt(myTempArray[0]));
        lblPersonalID.setText(String.valueOf(curentVisitor.getPersonalID()));
        txtName.setText(curentVisitor.getName());
        txtSurname.setText(curentVisitor.getSurname());
        txtTRIDNo.setText(String.valueOf(curentVisitor.getTRIDNo()));
        cbisTRS.setSelectedIndex(DBSetting.getBoolAsInt(curentVisitor.getIsTRS()));
        lblSavaDate.setText(String.valueOf(curentVisitor.getSaveDate()));
        txtBirthYear.setText(String.valueOf(curentVisitor.getBirthYear()));
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement psvs = con.prepareStatement("exec dbo.GetVisitsByID ?");
            psvs.setInt(1, curentVisitor.getVisitorID());
            ResultSet rs = psvs.executeQuery();
            tblVisits.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
            PreparedStatement ps2 = con.prepareStatement("select * from VCars where VisitorID=?");
            ps2.setInt(1, curentVisitor.getVisitorID());
            ResultSet rs2 = ps2.executeQuery();
            tblCars.setModel(DbUtils.resultSetToTableModel(rs2));
            
            PreparedStatement psGetSum = con.prepareStatement("select count(VisitID) from Visits where VisitorID=?");
            psGetSum.setInt(1, curentVisitor.getVisitorID());
            ResultSet rsGetSum = psGetSum.executeQuery();
            if (rsGetSum.next()) {
                lblSumVisit.setText(rsGetSum.getString(1));
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_lstListValueChanged

    private void btnStartToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartToEditActionPerformed
        // TODO add your handling code here:
        if(btnStartToEdit.isSelected())
        {
            txtBirthYear.setEnabled(true);
            txtName.setEnabled(true);
            txtSurname.setEnabled(true);
            txtTRIDNo.setEnabled(true);
            
            btnDelete.setEnabled(true);
            btnReset.setEnabled(true);
            btnUpdate.setEnabled(true);
            cbisTRS.setEnabled(true);
        }
        else
        {
            txtBirthYear.setEnabled(false);
            txtName.setEnabled(false);
            txtSurname.setEnabled(false);
            txtTRIDNo.setEnabled(false);
            
            btnDelete.setEnabled(false);
            btnReset.setEnabled(false);
            btnUpdate.setEnabled(false);
            cbisTRS.setEnabled(false);
        }
    }//GEN-LAST:event_btnStartToEditActionPerformed
    private Boolean chechForEmtyTextboxs()
    {
        return !(txtBirthYear.getText().equals("")||txtName.getText().equals("")||txtTRIDNo.getText().equals("")||txtSurname.getText().equals(""));
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (!chechForEmtyTextboxs()) {
            JOptionPane.showMessageDialog(null, "Boş alanları doldurun!","SecurityX",JOptionPane.ERROR_MESSAGE);
        } else {
            Visitor v = curentVisitor;
            v.setName(txtName.getText());
            v.setSurname(txtSurname.getText());
            v.setTRIDNo(Long.parseLong(txtTRIDNo.getText()));
            v.setIsTRS(cbisTRS.getSelectedIndex()==1);
            v.setBirthYear(Integer.parseInt(txtBirthYear.getText()));
            
            Log l = new Log();
            l.setOperation("UPDV");
            l.setDetail("Updated info: "+curentVisitor.getName()+" "+curentVisitor.getSurname()+" ID"+String.valueOf(curentVisitor.getVisitorID()));
            l.setPersonalID(frmLogin.activeUser.getPersonalID());
            if (Visitors.updateToVisitor(v)&&Logs.addToLog(l)) {
                curentVisitor = v;
                btnStartToEdit.setSelected(false);
                btnStartToEditActionPerformed(null);
                listName();
                JOptionPane.showMessageDialog(null, "Kayıt güncelleme işlemi başarıyla tamamlandı!","SecurityX",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt günlleme sırasında bir hata oluştu!","SecurityX",JOptionPane.ERROR_MESSAGE);
            }
     
           
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        lstListValueChanged(null);
        JOptionPane.showMessageDialog(null, "Değerler varsayılana sıfırlandı!","SecurityX",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResetActionPerformed

    private void formİnternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formİnternalFrameIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formİnternalFrameIconified

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String deger = JOptionPane.showInputDialog(null,txtName.getText()+" için silme illemini onaylamanız gerekiyor...\nOnay için lütfen cep telefonunuzu girin!","SecurityX - İşlem onayı",JOptionPane.QUESTION_MESSAGE);
        if (deger.equals(String.valueOf(frmLogin.activeUser.getPhoneNumber()))) {
            if (tblCars.getRowCount()!=0 || tblVisits.getRowCount()!=0) {
                JOptionPane.showMessageDialog(null, "Adına kayıt bulunan ziyaretcileri silinemez!","SecurityX",JOptionPane.ERROR_MESSAGE);
                
            } else {
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girdiğiniz değer sistemimizdeki değer ile eşleşmiyor.\nLütfen tekrar deneyin","SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    Visitor curentVisitor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JToggleButton btnStartToEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbisTRS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblPersonalID;
    private javax.swing.JLabel lblSavaDate;
    private javax.swing.JLabel lblSumVisit;
    private javax.swing.JLabel lblTatalVisitor;
    private javax.swing.JLabel lblVisitorID;
    private javax.swing.JList<String> lstList;
    private javax.swing.JTable tblCars;
    private javax.swing.JTable tblVisits;
    private javax.swing.JTextField txtBirthYear;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScanForVisitors;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTRIDNo;
    // End of variables declaration//GEN-END:variables
}