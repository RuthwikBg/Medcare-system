/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Hospital.Ecosystem;
import Model.Beds;
import Model.BedsRequest;
import Model.Operations;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class BedsSysadmin extends javax.swing.JPanel {
Ecosystem ecoSystem;
int rowNum;
    /**
     * Creates new form BedsSysadmin
     */
    public BedsSysadmin(Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem=ecoSystem;
        populateReqTable();
        populateBedsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bedsTable = new javax.swing.JTable();
        addBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bednametxt = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateBtrn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        availability = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bedReqTable = new javax.swing.JTable();
        viewBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bedsTable.setBackground(new java.awt.Color(153, 153, 255));
        bedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bedname", "Availability", "Clean"
            }
        ));
        jScrollPane1.setViewportView(bedsTable);

        addBtn1.setText("Add");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Bedname");

        bednametxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane3.setViewportView(bednametxt);

        jLabel2.setText("Availability");

        jLabel3.setText("Clean");

        updateBtrn.setText("Update");
        updateBtrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtrnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        availability.setBackground(new java.awt.Color(153, 153, 255));
        availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", " " }));

        jComboBox1.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(addBtn1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(updateBtrn)
                                        .addGap(39, 39, 39)
                                        .addComponent(deleteBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(1, 1, 1))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(viewBtn)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(viewBtn)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtrn)
                    .addComponent(addBtn1)
                    .addComponent(deleteBtn))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Beds", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        bedReqTable.setBackground(new java.awt.Color(153, 153, 255));
        bedReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bed Name", "Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(bedReqTable);

        viewBtn1.setText("View");
        viewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Bed Name");

        jLabel5.setText("Date");

        jLabel6.setText("Status");

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected", "Pending" }));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn)
                            .addComponent(viewBtn1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(187, 187, 187)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(viewBtn1)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Bed Requests", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        // TODO add your handling code here:
        for(Beds en : ecoSystem.getBeddir().getBedsList()){
            if(en.getBedName().equals(bednametxt.getText())){
                JOptionPane.showMessageDialog(this,"Bed already exists");
                return;
            }

        }
        Beds ob = new Beds();
        ob.setBedName(bednametxt.getText());
        ob.setAvailable(availability.getSelectedItem().toString());
        ob.setClean(jComboBox1.getSelectedItem().toString());

        ecoSystem.getBeddir().getBedsList().add(ob);

        populateBedsTable();
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void updateBtrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtrnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bedsTable.getModel();
        Beds ob = (Beds)model.getValueAt(rowNum, 0);

        if(bedsTable.getSelectedRowCount() == 1){
            ob.setBedName(bednametxt.getText());
            ob.setAvailable(availability.getSelectedItem().toString());

            populateBedsTable();

        }

    }//GEN-LAST:event_updateBtrnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bedsTable.getModel();
        Beds ob = (Beds)model.getValueAt(rowNum, 0);

        ecoSystem.getBeddir().getBedsList().remove(ob);
        populateBedsTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = bedsTable.getSelectedRow();
        rowNum = selectRowIndex;

        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) bedsTable.getModel();
        Beds selOp = (Beds)model.getValueAt(selectRowIndex, 0);

        bednametxt.setText(selOp.getBedName());
        availability.setSelectedItem(selOp.getAvailable());
        jComboBox1.setSelectedItem(selOp.getClean());
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn1ActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = bedReqTable.getSelectedRow();
        rowNum = selectRowIndex;

        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) bedReqTable.getModel();
        Beds ob = (Beds)model.getValueAt(selectRowIndex, 0);

    }//GEN-LAST:event_viewBtn1ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bedReqTable.getModel();
        BedsRequest bedReq = (BedsRequest)model.getValueAt(rowNum, 0);

        if(bedReqTable.getSelectedRowCount() == 1){
            bedReq.setStatus(statusBox.getSelectedItem().toString());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

 private void populateBedsTable() {
        DefaultTableModel model = (DefaultTableModel) bedsTable.getModel();
        model.setRowCount(0);
        for(Beds en : ecoSystem.getBeddir().getBedsList()){
            Object[] row = new Object[2];
            row[0] = en;
            row[1] = en.getAvailable();
            row[2] = en.getClean();
            
            model.addRow(row);
        }
    }
 private void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) bedReqTable.getModel();
        model.setRowCount(0);
        
        for(BedsRequest en : ecoSystem.getBedsbookingdir().getBedReqList())             
            {
                            
            Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en;
               row[1] = en.getDateofOperation();
               row[2] = en.getStatus();
               
              
              
            model.addRow(row);
            }        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn1;
    private javax.swing.JComboBox<String> availability;
    private javax.swing.JTable bedReqTable;
    private javax.swing.JTextPane bednametxt;
    private javax.swing.JTable bedsTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtrn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewBtn1;
    // End of variables declaration//GEN-END:variables
}
