/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package task5.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import task5.dbmanager.ContactDbManager;
import task5.model.Contact;

/**
 *
 * @author Govind Kumar
 */
public class BookAddress extends javax.swing.JFrame {

    /**
     * Creates new form BookAddress
     */
    public BookAddress() {
        initComponents();
        fillContacTable();
        clearFields();
    }

    ContactDbManager contactDbManager = new ContactDbManager();
    Integer contactId = 0;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    String columns[] = {"Id", "First Name", "Last Name", "Father Name", "Phone Number", "Email", "Address", "City", "Gender"};
    DefaultTableModel contactDefaultTableModel;

    private void fillContacTable() {
        contactDefaultTableModel = new DefaultTableModel(columns, 0);
        try {
            List<Contact> contacts = contactDbManager.getAllContact();
            for (Contact contact : contacts) {
                Object row[] = {contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getFatherName(), contact.getPhoneNumber(), contact.getEmail(), contact.getAddress(), contact.getCity(), contact.getGender()};
                contactDefaultTableModel.addRow(row);
                contactTable.setModel(contactDefaultTableModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookAddress.class.getName()).log(Level.SEVERE, null, ex);
        }

        contactTable.getColumnModel().getColumn(0).setWidth(0);
        contactTable.getColumnModel().getColumn(0).setMinWidth(0);
        contactTable.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    private Contact getContact() {
        Contact contact = new Contact();

        String firstName = firstNameTextField.getText().toString();
        String lastName = lastNameTextField.getText().toString();
        String fatherName = fatherNameTextField.getText().toString();
        long phoneNumber = Long.parseLong(phoneNumberTextField.getText().toString());
        String email = emailTextField.getText().toString();
        String address = addressTextField.getText().toString();
        String city = cityTextField.getText().toString();
        String gender = "";

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setFatherName(fatherName);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contact.setAddress(address);
        contact.setCity(city);
        if (maleRadioButton.isSelected()) {
            contact.setGender("Male");
        } else if (femaleRadioButton.isSelected()) {
            contact.setGender("Female");
        } else {
            contact.setGender("");
        }

        return contact;
    }

    
    private void clearFields() {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        fatherNameTextField.setText("");
        phoneNumberTextField.setText("");
        emailTextField.setText("");
        addressTextField.setText("");
        cityTextField.setText("");
        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bookAddressSystemLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        bookAddressSystemLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bookAddressSystemLabel.setText("Book Address System");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        firstNameTextField.setBackground(new java.awt.Color(204, 204, 255));
        firstNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");

        lastNameTextField.setBackground(new java.awt.Color(204, 204, 255));
        lastNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Father Name");

        fatherNameTextField.setBackground(new java.awt.Color(204, 204, 255));
        fatherNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        phoneNumberTextField.setBackground(new java.awt.Color(204, 204, 255));
        phoneNumberTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        emailTextField.setBackground(new java.awt.Color(204, 204, 255));
        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        addressTextField.setBackground(new java.awt.Color(204, 204, 255));
        addressTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("City");

        cityTextField.setBackground(new java.awt.Color(204, 204, 255));
        cityTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Gender");

        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        maleRadioButton.setText("Male");

        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        femaleRadioButton.setText("Female");

        contactTable.setBackground(new java.awt.Color(255, 204, 204));
        contactTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contactTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Father Name", "Phone Number", "Email", "Address", "City", "Gender"
            }
        ));
        contactTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactTable);
        if (contactTable.getColumnModel().getColumnCount() > 0) {
            contactTable.getColumnModel().getColumn(0).setHeaderValue("First Name");
            contactTable.getColumnModel().getColumn(1).setHeaderValue("Last Name");
            contactTable.getColumnModel().getColumn(2).setHeaderValue("Father Name");
            contactTable.getColumnModel().getColumn(3).setHeaderValue("Phone Number");
            contactTable.getColumnModel().getColumn(4).setHeaderValue("Email");
            contactTable.getColumnModel().getColumn(5).setHeaderValue("Address");
            contactTable.getColumnModel().getColumn(6).setHeaderValue("City");
            contactTable.getColumnModel().getColumn(7).setHeaderValue("Gender");
        }

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        addButton.setBackground(new java.awt.Color(204, 255, 204));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 255, 204));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 255, 204));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 255, 204));
        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookAddressSystemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(emailTextField)
                            .addComponent(firstNameTextField)
                            .addComponent(fatherNameTextField))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameTextField)
                            .addComponent(phoneNumberTextField)
                            .addComponent(addressTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bookAddressSystemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            // TODO add your handling code here:

            boolean success = contactDbManager.addContact(getContact());
            if (success) {
                JOptionPane.showMessageDialog(this, "Contact Added Successfully...");
                fillContacTable();
                clearFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            // TODO add your handling code here:
            Contact contact = this.getContact();
            contact.setId(contactId);

            boolean success = contactDbManager.updateContact(contact);
            if (success) {
                JOptionPane.showMessageDialog(this, "Contact Updated Successfully...");
                fillContacTable();
                clearFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookAddress.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        try {
            boolean success = contactDbManager.deleteContact(contactId);
            if (success) {
            JOptionPane.showMessageDialog(this, "Contact Deleted Successfully...");
            fillContacTable();
            clearFields();
        }
        } catch (SQLException ex) {
            Logger.getLogger(BookAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void contactTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactTableMouseClicked
        // TODO add your handling code here:
        contactId = Integer.parseInt(contactTable.getValueAt(contactTable.getSelectedRow(), 0).toString());
        try {
            Contact contact = contactDbManager.getContactById(contactId);
            firstNameTextField.setText(contact.getFirstName());
            lastNameTextField.setText(contact.getLastName());
            fatherNameTextField.setText(contact.getFatherName());
            phoneNumberTextField.setText(String.valueOf(contact.getPhoneNumber()));
            emailTextField.setText(contact.getEmail());
            addressTextField.setText(contact.getAddress());
            cityTextField.setText(contact.getCity());
            
            buttonGroup1.clearSelection();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookAddress.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_contactTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel bookAddressSystemLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTable contactTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstNameTextField;
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
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
