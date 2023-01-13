/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Department;

import Hospital.Ecosystem;
import Model.Beds;
import Model.BedsRequest;
import Roles.Bed_Manager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumanayanakonda
 */
public class BedDepartment extends javax.swing.JPanel {
Ecosystem ecoSystem;
    /**
     * Creates new form BedDepartment
     */
    public BedDepartment(Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        TableFilling();
        TableFilling1();
         TableFilling2();
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
        bedmanager = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bed = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bedsreq = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        bedmanager.setBackground(new java.awt.Color(153, 153, 255));
        bedmanager.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(bedmanager);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Bed Managers", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        bed.setBackground(new java.awt.Color(153, 153, 255));
        bed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bed Name", "Available", "Clean"
            }
        ));
        jScrollPane2.setViewportView(bed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Beds", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        bedsreq.setBackground(new java.awt.Color(153, 153, 255));
        bedsreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Patient Name", "Patient Email", "Inference", "Bed Name"
            }
        ));
        jScrollPane3.setViewportView(bedsreq);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bed Requests", jPanel3);

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
    
          
          DefaultTableModel model = (DefaultTableModel) bedmanager.getModel();
          model.setRowCount(0);  
          for(Bed_Manager en : ecoSystem.getBedmanagerdir().getBedManagerList())             
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
    private javax.swing.JTable bed;
    private javax.swing.JTable bedmanager;
    private javax.swing.JTable bedsreq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void TableFilling1() {
        
     
          DefaultTableModel model = (DefaultTableModel) bed.getModel();
          model.setRowCount(0);  
          for(Beds en : ecoSystem.getBeddir().getBedsList())             
            {
                            
            Object[] row = new Object[3];
         
          
               row[0] = en.getBedName();
               row[1] = en.getAvailable();
               row[2] = en.getClean();
         
            model.addRow(row);
            } 
    
    
    }

    private void TableFilling2() {
        
    
          DefaultTableModel model = (DefaultTableModel) bedsreq.getModel();
          model.setRowCount(0);  
          for(BedsRequest en : ecoSystem.getBedsbookingdir().getBedReqList())             
            {
                            
            Object[] row = new Object[5];
         
          
               row[0] = en.getDateofOperation();
               row[1] = en.getPatient().getFirstName()+" "+en.getPatient().getLastName();
               row[2] = en.getPatient().getEmailId();
               row[3] = en.getInference();
               row[4] = en.getBed().getBedName();
         
            model.addRow(row);
            } 
    
    }
}
