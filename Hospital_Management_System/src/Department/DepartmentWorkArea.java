/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Department;

import Hospital.Ecosystem;
import Model.GlobalMessage;
import Model.LocalMessage;
import Model.Messages;
import Payment.BillsRequest;
import Roles.DepartmentManager;
import UserInterface.Login;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class DepartmentWorkArea extends javax.swing.JPanel {
    Ecosystem ecoSystem;
    DepartmentManager d;

    /**
     * Creates new form DepartmentWorkArea
     */
    public DepartmentWorkArea(Ecosystem ecoSystem, DepartmentManager deptmanager) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.d = deptmanager;
        populateGlobalTable();
        populateLocalTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        add_dept = new javax.swing.JButton();
        doctors = new javax.swing.JButton();
        operation = new javax.swing.JButton();
        lab = new javax.swing.JButton();
        bed = new javax.swing.JButton();
        pharmacy = new javax.swing.JButton();
        insurance = new javax.swing.JButton();
        voluteer = new javax.swing.JButton();
        delivery = new javax.swing.JButton();
        Finance = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        globalMsgTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personalMsgTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        add_dept.setBackground(new java.awt.Color(204, 204, 255));
        add_dept.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        add_dept.setText("Add Departments");
        add_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_deptActionPerformed(evt);
            }
        });

        doctors.setBackground(new java.awt.Color(204, 204, 255));
        doctors.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        doctors.setText("Doctors");
        doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsActionPerformed(evt);
            }
        });

        operation.setBackground(new java.awt.Color(204, 204, 255));
        operation.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        operation.setText("Operation");
        operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationActionPerformed(evt);
            }
        });

        lab.setBackground(new java.awt.Color(204, 204, 255));
        lab.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        lab.setText("Lab");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });

        bed.setBackground(new java.awt.Color(204, 204, 255));
        bed.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        bed.setText("Bed");
        bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedActionPerformed(evt);
            }
        });

        pharmacy.setBackground(new java.awt.Color(204, 204, 255));
        pharmacy.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        pharmacy.setText("Pharmacy");
        pharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyActionPerformed(evt);
            }
        });

        insurance.setBackground(new java.awt.Color(204, 204, 255));
        insurance.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        insurance.setText("Insurance");
        insurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceActionPerformed(evt);
            }
        });

        voluteer.setBackground(new java.awt.Color(204, 204, 255));
        voluteer.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        voluteer.setText("Volunteer");

        delivery.setBackground(new java.awt.Color(204, 204, 255));
        delivery.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        delivery.setText("Delivery");

        Finance.setBackground(new java.awt.Color(204, 204, 255));
        Finance.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        Finance.setText("Finance");
        Finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/back-button.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Messages");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dashboard");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delivery)
                                    .addComponent(Finance)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(add_dept))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(doctors))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(voluteer))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(insurance))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(pharmacy))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bed))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lab))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(operation))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Finance, add_dept, bed, delivery, doctors, insurance, jButton1, lab, operation, pharmacy, voluteer});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_dept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctors, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pharmacy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insurance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voluteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delivery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Finance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Finance, add_dept, bed, delivery, doctors, insurance, jButton1, lab, operation, pharmacy, voluteer});

        jSplitPane1.setLeftComponent(jPanel1);

        dash.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel1.setText("GLOBAL FORUM");

        globalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
        globalMsgTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        globalMsgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From", "Occupation", "Message"
            }
        ));
        jScrollPane2.setViewportView(globalMsgTable);

        jLabel2.setFont(new java.awt.Font("Interstate Light", 1, 12)); // NOI18N
        jLabel2.setText("PERSONAL FORUM");

        personalMsgTable.setBackground(new java.awt.Color(153, 153, 255));
        personalMsgTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        personalMsgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From", "Occupation", "Message"
            }
        ));
        jScrollPane1.setViewportView(personalMsgTable);

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                        .addGroup(dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))))
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(dash);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_deptActionPerformed
        // TODO add your handling code here:
        DepartmentPanel at = new DepartmentPanel(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_add_deptActionPerformed

    private void doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsActionPerformed
        // TODO add your handling code here:
         DoctorsDept at = new DoctorsDept(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_doctorsActionPerformed

    private void operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationActionPerformed
        // TODO add your handling code here:
        OperationDepartment at = new OperationDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_operationActionPerformed

    private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed
        // TODO add your handling code here:
        LabDepartment at = new LabDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_labActionPerformed

    private void FinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceActionPerformed
        // TODO add your handling code here:
        FinanceDepartment at = new FinanceDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_FinanceActionPerformed

    private void bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedActionPerformed
        // TODO add your handling code here:
        BedDepartment at = new BedDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_bedActionPerformed

    private void pharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyActionPerformed
        // TODO add your handling code here:
         PharmacyDepartment at = new PharmacyDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_pharmacyActionPerformed

    private void insuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceActionPerformed
        // TODO add your handling code here:
       InsuranceDepartment at = new InsuranceDepartment(ecoSystem); 
        jSplitPane1.setRightComponent(at);
    }//GEN-LAST:event_insuranceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login.dB4OUtil.storeSystem(ecoSystem);
        Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DeptMessagePanel ob = new DeptMessagePanel(ecoSystem, d);
        jSplitPane1.setRightComponent(ob);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DepartmentWorkArea ob = new DepartmentWorkArea(ecoSystem, d);
        jSplitPane1.setRightComponent(ob.dash);
    }//GEN-LAST:event_jButton2ActionPerformed
private void populateGlobalTable() {
    DefaultTableModel model = (DefaultTableModel) globalMsgTable.getModel();
          model.setRowCount(0);  
          for(Messages en : ecoSystem.getMessagesdir().getMessagesList())             
            {
                
               if(en.getType().equals("Global")){             
               Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en.getFrom().getFirstName()+" "+en.getFrom().getLastName();
               row[1] = en.getFrom().getRole();
               row[2] = en.getMessage();        
              
           
               model.addRow(row);
               }
            }
    
}
  
    private void populateLocalTable(){
    
      DefaultTableModel model = (DefaultTableModel) personalMsgTable.getModel();
          model.setRowCount(0);  
          for(Messages en : ecoSystem.getMessagesdir().getMessagesList())             
            {
                
               if(en.getType().equals("Personal") && en.getTo().getEmailId().equalsIgnoreCase(d.getEmailId())){ 
               Object[] row = new Object[3];
         
         //   row[1] = en.getDoctor().getFirstName()+""+en.getDoctor().getLastName();
         //   row[2] = en.getPatient().getFirstName()+""+en.getPatient().getLastName();  
               row[0] = en.getFrom().getFirstName()+" "+en.getFrom().getLastName();
               row[1] = en.getFrom().getRole();
               row[2] = en.getMessage();        
              
           
               model.addRow(row);
               }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finance;
    private javax.swing.JButton add_dept;
    private javax.swing.JButton bed;
    private javax.swing.JPanel dash;
    private javax.swing.JButton delivery;
    private javax.swing.JButton doctors;
    private javax.swing.JTable globalMsgTable;
    private javax.swing.JButton insurance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton lab;
    private javax.swing.JButton operation;
    private javax.swing.JTable personalMsgTable;
    private javax.swing.JButton pharmacy;
    private javax.swing.JButton voluteer;
    // End of variables declaration//GEN-END:variables
}