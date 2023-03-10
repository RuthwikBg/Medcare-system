/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Hospital.Ecosystem;
import Model.OperationRequest;
import Model.Operations;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class OperSysadmin extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    int rowNum;
    int rowNum1;
    /**
     * Creates new form OperSysadmin
     */
    public OperSysadmin(Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem=ecoSystem;
                populateOpRoomTable();
        populateReqTable();
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
        roomsTable = new javax.swing.JTable();
        viewRowBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Room = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        availability = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        clean = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reqTable = new javax.swing.JTable();
        view2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        docTxt = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        dateTxt = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        roomNoTxt = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        inferenceTxt = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        ReqUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        roomsTable.setBackground(new java.awt.Color(153, 153, 255));
        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No.", "Availability", "Clean"
            }
        ));
        jScrollPane1.setViewportView(roomsTable);

        viewRowBtn.setBackground(new java.awt.Color(153, 153, 255));
        viewRowBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewRowBtn.setText("View");
        viewRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRowBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Room No.");

        jLabel2.setText("Availability");

        availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Pending" }));

        jLabel3.setText("Clean");

        clean.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", "Pending" }));

        updateBtn.setBackground(new java.awt.Color(153, 153, 255));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBtn)
                            .addComponent(viewRowBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(availability, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clean, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewRowBtn)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(updateBtn)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operation Rooms", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        reqTable.setBackground(new java.awt.Color(153, 153, 255));
        reqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room No.", "Date", "Doctor", "Status"
            }
        ));
        jScrollPane2.setViewportView(reqTable);

        view2.setBackground(new java.awt.Color(153, 153, 255));
        view2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        view2.setText("View");
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Doctor");

        docTxt.setEditable(false);
        docTxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane6.setViewportView(docTxt);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Date");

        dateTxt.setEditable(false);
        dateTxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane7.setViewportView(dateTxt);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Room No.");

        roomNoTxt.setEditable(false);
        roomNoTxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane5.setViewportView(roomNoTxt);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Status");

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected", "Pending" }));
        statusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBoxActionPerformed(evt);
            }
        });

        inferenceTxt.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane8.setViewportView(inferenceTxt);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Inference");

        ReqUpdate.setBackground(new java.awt.Color(153, 153, 255));
        ReqUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ReqUpdate.setText("Update");
        ReqUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReqUpdateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(statusBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(view2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(ReqUpdate)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(view2)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReqUpdate)
                    .addComponent(jButton1))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaton Requests", jPanel2);

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

    private void view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2ActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = reqTable.getSelectedRow();
        rowNum1 = selectRowIndex;

        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) reqTable.getModel();
        OperationRequest selReq = (OperationRequest)model.getValueAt(selectRowIndex, 0);

        docTxt.setText(selReq.getDoctor().getLastName());
        roomNoTxt.setText(Integer.toString(selReq.getOperationRoom().getOperationTheaterNumber()));
        dateTxt.setText(selReq.getDateofOperation().toString());
        inferenceTxt.setText(selReq.getInference());

    }//GEN-LAST:event_view2ActionPerformed

    private void statusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBoxActionPerformed

    private void ReqUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReqUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) reqTable.getModel();
        OperationRequest opReq = (OperationRequest)model.getValueAt(rowNum1, 0);

        if(reqTable.getSelectedRowCount() == 1){
            opReq.setStatus(statusBox.getSelectedItem().toString());

        }
        populateOpRoomTable();
    }//GEN-LAST:event_ReqUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) reqTable.getModel();
        OperationRequest opReq = (OperationRequest)model.getValueAt(rowNum1, 0);
        ecoSystem.getOperationsbookingdir().getOpRequestList().remove(opReq);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRowBtnActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = roomsTable.getSelectedRow();
        rowNum = selectRowIndex;

        if (selectRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) roomsTable.getModel();
        Operations selectOperation = (Operations)model.getValueAt(selectRowIndex, 0);

        Room.setText(Integer.toString(selectOperation.getOperationTheaterNumber()));
        availability.setSelectedItem(selectOperation.getAvailable());
        clean.setSelectedItem(selectOperation.getClean());

    }//GEN-LAST:event_viewRowBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) roomsTable.getModel();
        Operations op = (Operations)model.getValueAt(rowNum, 0);

        if(roomsTable.getSelectedRowCount() == 1){
            op.setAvailable(availability.getSelectedItem().toString());
            op.setClean(clean.getSelectedItem().toString());

        }
        populateOpRoomTable();
    }//GEN-LAST:event_updateBtnActionPerformed
private void populateOpRoomTable() {
        DefaultTableModel model = (DefaultTableModel) roomsTable.getModel();
        model.setRowCount(0);
        for(Operations en : ecoSystem.getOperationroomdir().getOperationsList())             
            {
                            
            Object[] row = new Object[2];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en;
               row[1] = en.getAvailable();
               row[2] = en.getClean();
              
              
            model.addRow(row);
            }        

    }
    private void populateReqTable() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          DefaultTableModel model = (DefaultTableModel) reqTable.getModel();
          model.setRowCount(0);  
          for(OperationRequest en : ecoSystem.getOperationsbookingdir().getOpRequestList())             
            {
                            
            Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en;
               row[1] = en.getDateofOperation();
               row[2] = en.getDoctor().getLastName();
               row[3] = en.getStatus();
              
              
            model.addRow(row);
            }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReqUpdate;
    private javax.swing.JTextField Room;
    private javax.swing.JComboBox<String> availability;
    private javax.swing.JComboBox<String> clean;
    private javax.swing.JTextPane dateTxt;
    private javax.swing.JTextPane docTxt;
    private javax.swing.JTextPane inferenceTxt;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable reqTable;
    private javax.swing.JTextPane roomNoTxt;
    private javax.swing.JTable roomsTable;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton view2;
    private javax.swing.JButton viewRowBtn;
    // End of variables declaration//GEN-END:variables
}
