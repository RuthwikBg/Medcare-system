/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Department;

import Hospital.Ecosystem;
import Model.Insurance_Request;
import Roles.InsuranceSpecialist;
import Roles.Payment_Manager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class InsuranceDepartment extends javax.swing.JPanel {
Ecosystem ecoSystem;
    /**
     * Creates new form InsuranceDepartment
     */
    public InsuranceDepartment(Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem =ecoSystem;
        TableFilling();
        TableFilling1();
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
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Date Of Birth", "Email", "Gender", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insurance Specialists", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jTable2.setBackground(new java.awt.Color(153, 153, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Insurance Kind", "Patient Name", "Patient Email", "Income", "Employment", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insurance Requests", jPanel2);

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
private void TableFilling() {
    
          
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          model.setRowCount(0);  
          for(InsuranceSpecialist en : ecoSystem.getInsurancespecialist().getInsuranceSpecialistList())             
            {
                            
            Object[] row = new Object[5];
         
          
               row[0] = en.getFirstName()+" "+en.getLastName();
               row[1] = en.getDateOfBirth();
               row[2] = en.getEmailId();
               row[3] = en.getGender();
               row[4] = en.getPhoneNumber();
               
              
            model.addRow(row);
            } 
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void TableFilling1() {
    
        
     
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          model.setRowCount(0);  
          for(Insurance_Request en : ecoSystem.getInsurancereqdir().getInsuranceReqList())             
            {
                            
            Object[] row = new Object[6];
         
          
               row[0] = en.getInsurancename();
               row[1] = en.getPatient().getFirstName()+" "+en.getPatient().getLastName();
               row[2] = en.getPatient().getEmailId();
               row[3] = en.getIncome();
               row[4] = en.getEmployment();
               row[5] = en.getStatus();
              
            model.addRow(row);
            } 
    
    }
}
