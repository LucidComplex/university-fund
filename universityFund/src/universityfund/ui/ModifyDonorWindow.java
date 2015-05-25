/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui;

import javax.persistence.EntityManager;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author MiriamMarie
 */
public class ModifyDonorWindow extends javax.swing.JFrame implements UI {
    Donor selectedDonor;
    /**
     * Creates new form ModifyDonorWindow
     */
    public ModifyDonorWindow() {
        initComponents();
        selectedDonor = null;
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
        nameSelected_text = new javax.swing.JLabel();
        name_box = new javax.swing.JCheckBox();
        address_box = new javax.swing.JCheckBox();
        number_box = new javax.swing.JCheckBox();
        email_box = new javax.swing.JCheckBox();
        year_box = new javax.swing.JCheckBox();
        category_box = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_text = new javax.swing.JTextArea();
        name_text = new javax.swing.JTextField();
        number_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        year_text = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        category_combo = new javax.swing.JComboBox();
        set_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UPDATE DONOR");
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText("Name:");
        jLabel1.setName("jLabel1"); // NOI18N

        nameSelected_text.setText(" ");
        nameSelected_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameSelected_text.setName("nameSelected_text"); // NOI18N

        name_box.setBackground(new java.awt.Color(255, 255, 255));
        name_box.setText("Name:");
        name_box.setName("name_box"); // NOI18N
        name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_boxActionPerformed(evt);
            }
        });

        address_box.setBackground(new java.awt.Color(255, 255, 255));
        address_box.setText("Address:");
        address_box.setName("address_box"); // NOI18N
        address_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_boxActionPerformed(evt);
            }
        });

        number_box.setBackground(new java.awt.Color(255, 255, 255));
        number_box.setText("Contact number:");
        number_box.setName("number_box"); // NOI18N
        number_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_boxActionPerformed(evt);
            }
        });

        email_box.setBackground(new java.awt.Color(255, 255, 255));
        email_box.setText("Email Address:");
        email_box.setName("email_box"); // NOI18N
        email_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_boxActionPerformed(evt);
            }
        });

        year_box.setBackground(new java.awt.Color(255, 255, 255));
        year_box.setText("Year of Graduation:");
        year_box.setName("year_box"); // NOI18N
        year_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_boxActionPerformed(evt);
            }
        });

        category_box.setBackground(new java.awt.Color(255, 255, 255));
        category_box.setText("Category:");
        category_box.setName("category_box"); // NOI18N
        category_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_boxActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        address_text.setColumns(20);
        address_text.setRows(5);
        address_text.setEnabled(false);
        address_text.setName("address_text"); // NOI18N
        jScrollPane1.setViewportView(address_text);

        name_text.setEnabled(false);
        name_text.setName("name_text"); // NOI18N

        number_text.setEnabled(false);
        number_text.setName("number_text"); // NOI18N

        email_text.setEnabled(false);
        email_text.setName("email_text"); // NOI18N

        year_text.setEnabled(false);
        year_text.setName("year_text"); // NOI18N

        save_button.setText("Save");
        save_button.setName("save_button"); // NOI18N
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        category_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        category_combo.setEnabled(false);
        category_combo.setName("category_combo"); // NOI18N

        set_button.setText("Set...");
        set_button.setName("set_button"); // NOI18N
        set_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_buttonActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modify Donor");
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(year_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_text))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(category_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email_text))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(number_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number_text))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(address_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name_box)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_text))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameSelected_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(set_button)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(save_button)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameSelected_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(set_button)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_box)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_box)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_box)
                    .addComponent(number_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_box)
                    .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(year_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category_box)
                    .addComponent(category_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_button)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void address_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_boxActionPerformed
        // TODO add your handling code here:
        if(address_box.isSelected())
            address_text.setEnabled(true);
        else address_text.setEnabled(false);
    }//GEN-LAST:event_address_boxActionPerformed

    private void year_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_boxActionPerformed
        // TODO add your handling code here:
        if(year_box.isSelected())
            year_text.setEnabled(true);
        else year_text.setEnabled(false);
    }//GEN-LAST:event_year_boxActionPerformed

    private void name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_boxActionPerformed
        // TODO add your handling code here:
        if(name_box.isSelected()){
            name_text.setEnabled(true);
        }
        else name_text.setEnabled(false);
    }//GEN-LAST:event_name_boxActionPerformed

    private void number_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_boxActionPerformed
        // TODO add your handling code here:
        if(number_box.isSelected())
            number_text.setEnabled(true);
        else number_text.setEnabled(false);
    }//GEN-LAST:event_number_boxActionPerformed

    private void email_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_boxActionPerformed
        // TODO add your handling code here:
        if(email_box.isSelected())
            email_text.setEnabled(true);
        else email_text.setEnabled(false);
    }//GEN-LAST:event_email_boxActionPerformed

    private void category_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_boxActionPerformed
        // TODO add your handling code here:
        if(category_box.isSelected())
            category_combo.setEnabled(true);
        else category_combo.setEnabled(false);
    }//GEN-LAST:event_category_boxActionPerformed

    private void set_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_buttonActionPerformed
        // TODO add your handling code here:
        new SelectDonorWindow(this).setVisible(true);
    }//GEN-LAST:event_set_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        updateDonor();
        dispose();
    }//GEN-LAST:event_save_buttonActionPerformed

    private void updateDonor(){
        Donor donor = selectedDonor;
        if(name_box.isSelected())
            donor.setName(name_text.getText());
        if(address_box.isSelected())
            donor.setAddress(address_text.getText());
        if(email_box.isSelected())
            donor.setEmail(email_text.getText());
        if(number_box.isSelected())
            donor.setContactNumber(number_text.getText());
        if(year_box.isSelected())
            donor.setGraduationYear(Integer.valueOf(year_text.getText()));
        if(category_box.isSelected())
            donor.setCategory(category_combo.getSelectedItem().toString());
        donor.save();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox address_box;
    private javax.swing.JTextArea address_text;
    private javax.swing.JCheckBox category_box;
    private javax.swing.JComboBox category_combo;
    private javax.swing.JCheckBox email_box;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameSelected_text;
    private javax.swing.JCheckBox name_box;
    private javax.swing.JTextField name_text;
    private javax.swing.JCheckBox number_box;
    private javax.swing.JTextField number_text;
    private javax.swing.JButton save_button;
    private javax.swing.JButton set_button;
    private javax.swing.JCheckBox year_box;
    private javax.swing.JTextField year_text;
    // End of variables declaration//GEN-END:variables

    @Override
    public void receiveIntent(Object intent) {
        EntityManager em = DbHelper.getEntityManager();
        selectedDonor = em.find(Donor.class, (long) intent);
        nameSelected_text.setText(selectedDonor.getName());
    }
}
