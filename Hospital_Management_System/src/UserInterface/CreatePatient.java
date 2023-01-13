/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Directories.Medicine_Directory;
import Hospital.Ecosystem;
import Model.Beds;
import Model.House;
import Model.Person;
import Roles.Patient;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JComponent;

/**
 *
 * @author sumanayanakonda
 */
public class CreatePatient extends javax.swing.JPanel {
Ecosystem ecoSystem;
//Patient patient;
//Person p;
    /**
     * Creates new form CreatePatient
     */
    public CreatePatient(Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem=ecoSystem;
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

        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eMailId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressLine1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addressLine2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        community = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        zipCode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passWord = new javax.swing.JTextField();
        backToHome = new javax.swing.JButton();
        createPatient = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 204, 255));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/back-button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel16.setText("Personal Information");

        jLabel1.setText("First Name :");

        firstName.setBackground(new java.awt.Color(153, 153, 255));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name :");

        lastName.setBackground(new java.awt.Color(153, 153, 255));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail Id :");

        eMailId.setBackground(new java.awt.Color(153, 153, 255));
        eMailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailIdActionPerformed(evt);
            }
        });

        jLabel3.setText("DOB :");

        jLabel5.setText("Gender :");

        gender.setBackground(new java.awt.Color(153, 153, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel11.setText("Phone :");

        phone.setBackground(new java.awt.Color(153, 153, 255));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel6.setText("Line 1 :");

        addressLine1.setBackground(new java.awt.Color(153, 153, 255));
        addressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel14.setText("Address Information");

        jLabel7.setText("Line 2 :");

        addressLine2.setBackground(new java.awt.Color(153, 153, 255));
        addressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressLine2ActionPerformed(evt);
            }
        });

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

        jLabel9.setText("State :");

        state.setBackground(new java.awt.Color(153, 153, 255));
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        jLabel10.setText("Zip Code :");

        zipCode.setBackground(new java.awt.Color(153, 153, 255));
        zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeActionPerformed(evt);
            }
        });

        jLabel13.setText("Password :");

        passWord.setBackground(new java.awt.Color(153, 153, 255));

        backToHome.setBackground(new java.awt.Color(153, 153, 255));
        backToHome.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        backToHome.setText("Cancel");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });

        createPatient.setBackground(new java.awt.Color(153, 153, 255));
        createPatient.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        createPatient.setText("Create");
        createPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eMailId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel12)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addComponent(backToHome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(createPatient)
                                .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(jLabel13)))
                    .addGap(60, 60, 60)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(205, 205, 205)
                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eMailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGap(62, 62, 62))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createPatient)
                        .addComponent(backToHome))
                    .addGap(88, 88, 88)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void eMailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMailIdActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

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
        // TODO add your handling code here:

        /*   DefaultComboBoxModel<String> mode1 = new DefaultComboBoxModel<String>();
        for(Community c:ecoSystem.getCommunityList()){

            if(c.getCity().getCity().equals(city.getSelectedItem().toString()))
            {

                mode1.addElement(c.getCommunity().toString());

            }

        }
        community.setModel(mode1);*/
    }//GEN-LAST:event_communityItemStateChanged

    private void communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeActionPerformed

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        // TODO add your handling code here:
        Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_backToHomeActionPerformed

    private void createPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientActionPerformed
        // TODO add your handling code here:
        
        boolean validated = false;
        boolean validatedOtherFields = false;
        String selectedCity = city.getSelectedItem()==null?"":city.getSelectedItem().toString();
        String selectedGender = gender.getSelectedItem().toString();
        Date strtDt = dob.getDate();
         if(!selectedCity.isEmpty() && !selectedGender.isEmpty() && strtDt!=null){
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
        }
        
         if (validated && validatedOtherFields) {
               
       Patient patient = new Patient(); 
        House house = new House();
        patient.setFirstName(firstName.getText());
        patient.setLastName(lastName.getText());
        patient.setEmailId(eMailId.getText());
        patient.setDateOfBirth(dob.getDate());
        patient.setGender(gender.getSelectedItem().toString());
        house.setAddressLine1(addressLine1.getText());
        house.setAddressLine2(addressLine2.getText());
        house.setCity(city.getSelectedItem().toString());
        house.setState(state.getText());
        house.setZipCode(Integer.valueOf(zipCode.getText()));
        patient.setHouse(house);
        patient.setRole("Patient");
        patient.setPassword(passWord.getText());
        patient.setPhoneNumber(Long.valueOf(phone.getText()));
        
        Beds bed = new Beds();
        bed.setAvailable("Unavailable");
        bed.setBedName("Not Applicable");
        bed.setClean("Unavailable");
        patient.setBeds(bed);
        Medicine_Directory medicinedir = new Medicine_Directory();
        patient.setMedicinedir(medicinedir);
        ecoSystem.getPatientdir().getPatientList().add(patient);
        ecoSystem.getPersondir().getPersonList().add(patient);
            Login home = new Login();
            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
            home.setVisible(true);
        

    }//GEN-LAST:event_createPatientActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Login home = new Login();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        home.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton backToHome;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> community;
    private javax.swing.JButton createPatient;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField eMailId;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField state;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
