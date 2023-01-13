/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SystemAdmin;

import Directories.Medicine_Directory;
import Hospital.Ecosystem;
import Model.House;
import Model.Person;
import Roles.Bed_Manager;
import Roles.DeliveryManager;
import Roles.Delivery_Man;
import Roles.DepartmentManager;
import Roles.Doctor;
import Roles.InsuranceSpecialist;
import Roles.Lab_Manager;
import Roles.Operation_Manager;
import Roles.Patient;
import Roles.Payment_Manager;
import Roles.Pharmacist;
import Roles.Volunteer;
import Roles.Volunteer_Manager;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sumanayanakonda
 */
public class CreateRoles extends javax.swing.JPanel {
//Ecosystem ecoSystem = Ecosystem.getInstance();
Ecosystem ecoSystem;
Payment_Manager paymentmanager;
Patient patients;
Doctor doctor;
Volunteer volunteer;
Volunteer_Manager volunteermanager;
Lab_Manager labmanager;
Bed_Manager bedmanager;
DeliveryManager deliverymanager;
Delivery_Man deliveryman;
InsuranceSpecialist insurancespecialist;
Operation_Manager operationmanager;
Pharmacist pharmacist;
DepartmentManager departmentmanager;

    /**
     * Creates new form CreateRoles
     */
    public CreateRoles(Ecosystem ecosystem) {
        initComponents();
        this.ecoSystem = ecosystem;
        firstName.setName("patientFirstName");        
        lastName.setName("patientLastName");
        eMailId.setName("patientEmailId");
        dob.setName("patientDOB");
        gender.setName("patientGender");
        phone.setName("patientPhone");
        addressLine1.setName("addressLine1");
        addressLine2.setName("addressLine2");
        community.setName("patientCommunity");
        city.setName("patientCity");
        state.setName("patientState");
        zipCode.setName("patientZipCode");
        passWord.setName("password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eMailId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressLine1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addressLine2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        community = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        zipCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        passWord = new javax.swing.JTextField();
        createPatient = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        eMailId.setBackground(new java.awt.Color(153, 153, 255));
        eMailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailIdActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel16.setText("Personal Information");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("First Name :");

        firstName.setBackground(new java.awt.Color(153, 153, 255));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Last Name :");

        lastName.setBackground(new java.awt.Color(153, 153, 255));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("E-mail Id :");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Line 1 :");

        addressLine1.setBackground(new java.awt.Color(153, 153, 255));
        addressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel14.setText("Address Information");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Line 2 :");

        addressLine2.setBackground(new java.awt.Color(153, 153, 255));
        addressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("City :");

        city.setBackground(new java.awt.Color(153, 153, 255));
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", " " }));
        city.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityItemStateChanged(evt);
            }
        });
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setText("Community :");

        community.setBackground(new java.awt.Color(153, 153, 255));
        community.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rochester", "Boylston", "Arlington", "Park Street", "Copley", "Burlington" }));
        community.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communityItemStateChanged(evt);
            }
        });
        community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("DOB :");

        zipCode.setBackground(new java.awt.Color(153, 153, 255));
        zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("State :");

        state.setBackground(new java.awt.Color(153, 153, 255));
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Zip Code :");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Phone:");

        phone.setBackground(new java.awt.Color(153, 153, 255));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Gender:");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel13.setText("Password :");

        passWord.setBackground(new java.awt.Color(153, 153, 255));

        createPatient.setBackground(new java.awt.Color(153, 153, 255));
        createPatient.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        createPatient.setText("Create");
        createPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientActionPerformed(evt);
            }
        });

        jLabel15.setText("Role:");

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department Manager", "Operation Manager", "Lab Manager", "Bed Manager", "Delivery Manager", "Volunteer Manager", "Volunteer", "Delivery Man", "Pharmacist", "Insurance Specialist", "Doctor", "Patient" }));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("Create Role");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phone)
                                    .addComponent(eMailId, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLine1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(community, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(446, 446, 446)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passWord)
                    .addComponent(role, 0, 212, Short.MAX_VALUE))
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(createPatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eMailId, firstName, lastName, phone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLine2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eMailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(createPatient)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eMailId, firstName, lastName, phone});

    }// </editor-fold>//GEN-END:initComponents

    private void eMailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailIdActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void addressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine1ActionPerformed

    private void addressLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressLine2ActionPerformed

    private void cityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cityItemStateChanged

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void communityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communityItemStateChanged
      
    }//GEN-LAST:event_communityItemStateChanged

    private void communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityActionPerformed

    private void zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void createPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientActionPerformed

boolean validated = false;
        boolean validatedOtherFields = false;
        String selectedCity = city.getSelectedItem()==null?"":city.getSelectedItem().toString();
        String selectedGender = gender.getSelectedItem().toString();
        String selectedRole = role.getSelectedItem().toString();
        Date strtDt = dob.getDate();
         if(!selectedCity.isEmpty() && !selectedGender.isEmpty() && strtDt!=null && !selectedRole.isEmpty()){
            validatedOtherFields = true;
        }
        else{
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
         JTextField[] VARIABLE_CONSTANTS = {firstName, lastName, eMailId, phone, addressLine1, addressLine2,state,zipCode,passWord};
        for (JTextField field : VARIABLE_CONSTANTS) {
            if (!validateData(field)) {
                validated = false;
                break;
            } else {
                validated = true;
                System.out.println("Validated");
            }
        }        // TODO add your handling code here:
 if (validated && validatedOtherFields) {
    
        House house = new House();
       
        house.setAddressLine1(addressLine1.getText());
        house.setAddressLine2(addressLine2.getText());
        house.setCity(city.getSelectedItem().toString());
        house.setState(state.getText());
        house.setZipCode(Integer.valueOf(zipCode.getText()));

        
        switch (role.getSelectedItem().toString()) {
                case "Department Manager":
                    DepartmentManager departmentmanager = new DepartmentManager(firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getDeptmanagerdir().getDeptmanagerList().add(departmentmanager);
                    ecoSystem.getPersondir().getPersonList().add(departmentmanager);
                    break;
                case "Bed Manager":
                   Bed_Manager bedmanager = new Bed_Manager(firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getBedmanagerdir().getBedManagerList().add(bedmanager);
                    ecoSystem.getPersondir().getPersonList().add(bedmanager);
                    break; 
                case "Delivery Manager":
                     DeliveryManager deliverymanager = new DeliveryManager(firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getDeliverymanagerdir().getDeliveryManList().add(deliverymanager);
                    ecoSystem.getPersondir().getPersonList().add(deliverymanager);
                    break; 
                case "Delivery Man":
                     Delivery_Man delivery = new Delivery_Man(0, firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getDeliverymandir().getDelveryManList().add(delivery);
                    ecoSystem.getPersondir().getPersonList().add(delivery);
                    break;
                case "Doctor":
                    Doctor doctor = new Doctor("Not Assigned","Not Assigned", "Not Assigned",0 , firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getDocdir().getDocList().add(doctor);
                    ecoSystem.getPersondir().getPersonList().add(doctor);
                    break;
                default:
                    break;
                    
                case "Insurance Specialist":
                    InsuranceSpecialist ins = new InsuranceSpecialist(firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getInsurancespecialist().getInsuranceSpecialistList().add(ins);
                    ecoSystem.getPersondir().getPersonList().add(ins);
                    break;
                    
                case "Lab Manager":
                   Lab_Manager lab = new Lab_Manager( firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getLabmanagerdir().getLabManagerList().add(lab);
                    ecoSystem.getPersondir().getPersonList().add(lab);
                    break;
                case "Operation Manager":
                    Operation_Manager oper = new Operation_Manager( firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getOperationmanagerdir().getOpManagerList().add(oper);
                    ecoSystem.getPersondir().getPersonList().add(oper);
                    break;
                case "Patient":
                    Medicine_Directory meddir = new Medicine_Directory();
                    Patient patient = new Patient(meddir, firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getPatientdir().getPatientList().add(patient);
                    ecoSystem.getPersondir().getPersonList().add(patient);
                    break;
                case "Payment Manager":
                    Payment_Manager pay = new Payment_Manager( firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getPaymentmanager().getPaymentManagerList().add(pay);
                    ecoSystem.getPersondir().getPersonList().add(pay);
                    break;
                case "Pharmacist":
                    Pharmacist phar = new Pharmacist( firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getPharmacist().getPharmacistList().add(phar);
                    ecoSystem.getPersondir().getPersonList().add(phar);
                    break;
                case "Volunteer":
                    Volunteer vol = new Volunteer("Not Assigned", "Not Assigned", "Not Applicable", firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getVolunteerdir().getVolunteerList().add(vol);
                    ecoSystem.getPersondir().getPersonList().add(vol);
                    break;
                case "Volunteer_Manager":
                    Volunteer_Manager volman = new Volunteer_Manager( firstName.getText(), lastName.getText(), dob.getDate(), 
                    eMailId.getText(), gender.getSelectedItem().toString(), Long.valueOf(phone.getText()), house,role.getSelectedItem().toString(), passWord.getText());
                    ecoSystem.getVolunteermanagerdir().getVolunteerManagerList().add(volman);
                    ecoSystem.getPersondir().getPersonList().add(volman);
            }
 }
 
    
    }//GEN-LAST:event_createPatientActionPerformed
public boolean validateData(JComponent input) {
        Date date;
        date = dob.getDate();
        String name = input.getName();
        String errorMsg = " ";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);
        } else {
            switch (name) {
                case "patientFirstName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientLastName":
                    if (!text.matches("^[a-zA-z ]*$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }
                    break;
                case "patientPhone":
                    if (!text.matches("^[0-9]{10}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "patientEmailId":
                   /* if (!ecoSystem.getPatientdir().equals(text)) {
                        raiseError = true;
                        errorMsg = String.format("Email Id already exists, please enter a valid mail Id", name);
                        break;
                    }*/
                    if (!text.matches("^(.+)@(.+)$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                    
                case "DOB":
                    if(date == null)
                    {
                       raiseError = true;
                       errorMsg = String.format("Please select a date value %s", name); 
                    }
                break;
                default:
                    break;
            }
        }
        if (raiseError) {
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressLine1;
    private javax.swing.JTextField addressLine2;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> community;
    private javax.swing.JButton createPatient;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField eMailId;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField passWord;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField state;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
