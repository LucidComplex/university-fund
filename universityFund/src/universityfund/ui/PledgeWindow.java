/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui;

import java.awt.Color;
import javax.persistence.EntityManager;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author MiriamMarie
 */
public class PledgeWindow extends javax.swing.JFrame implements UI{
    Donor selectedDonor;
    /**
     * Creates new form PledgeWindow
     */
    public PledgeWindow() {
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

        paymentGroup = new javax.swing.ButtonGroup();
        methodGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        name_text = new javax.swing.JLabel();
        select_button = new javax.swing.JButton();
        amount_label = new javax.swing.JLabel();
        amount_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        corpName_text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        corpAdd_text = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        spouse_text = new javax.swing.JTextField();
        cancel_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        payment_label = new javax.swing.JLabel();
        deffered_rButton = new javax.swing.JRadioButton();
        card_rButton = new javax.swing.JRadioButton();
        cash_rButton = new javax.swing.JRadioButton();
        single_rButton = new javax.swing.JRadioButton();
        method_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Pledge");

        name_label.setText("Name:");

        name_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_text.setText(" ");
        name_text.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        select_button.setText("Set...");
        select_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_buttonActionPerformed(evt);
            }
        });

        amount_label.setText("Amount:");

        amount_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_textActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Matching Gift");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel5.setText("Corporation Name:");

        jLabel6.setText("Corporation Address:");

        corpAdd_text.setColumns(20);
        corpAdd_text.setLineWrap(true);
        corpAdd_text.setRows(5);
        corpAdd_text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(corpAdd_text);

        jLabel7.setText("Name of Spouse:");

        cancel_button.setText("Cancel");

        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        payment_label.setText("Kind of Payment:");

        deffered_rButton.setBackground(new java.awt.Color(255, 255, 255));
        paymentGroup.add(deffered_rButton);
        deffered_rButton.setText("Deffered Payment");
        deffered_rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deffered_rButtonActionPerformed(evt);
            }
        });

        card_rButton.setBackground(new java.awt.Color(255, 255, 255));
        methodGroup.add(card_rButton);
        card_rButton.setText("Credit Card");
        card_rButton.setEnabled(false);

        cash_rButton.setBackground(new java.awt.Color(255, 255, 255));
        methodGroup.add(cash_rButton);
        cash_rButton.setText("Cash");
        cash_rButton.setEnabled(false);

        single_rButton.setBackground(new java.awt.Color(255, 255, 255));
        paymentGroup.add(single_rButton);
        single_rButton.setText("Single Payment");
        single_rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                single_rButtonActionPerformed(evt);
            }
        });

        method_label.setText("Method");

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corpName_text))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spouse_text))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(amount_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(amount_text))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(name_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(select_button, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(deffered_rButton)
                                        .addGap(10, 10, 10)
                                        .addComponent(single_rButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(payment_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(method_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cash_rButton)
                                        .addGap(10, 10, 10)
                                        .addComponent(card_rButton)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_label)
                        .addComponent(select_button)
                        .addComponent(jLabel3))
                    .addComponent(name_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount_label)
                    .addComponent(amount_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_label)
                    .addComponent(method_label)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deffered_rButton)
                    .addComponent(card_rButton)
                    .addComponent(cash_rButton)
                    .addComponent(single_rButton))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(corpName_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spouse_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_button)
                    .addComponent(save_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_buttonActionPerformed
        // TODO add your handling code here:
        new SelectDonorWindow(this).setVisible(true);
    }//GEN-LAST:event_select_buttonActionPerformed

    private void amount_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount_textActionPerformed

    private void deffered_rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deffered_rButtonActionPerformed
        // TODO add your handling code here:
        if(deffered_rButton.isSelected()){
            cash_rButton.setEnabled(true);
            card_rButton.setEnabled(true);
        } else {
            cash_rButton.setEnabled(false);
            card_rButton.setEnabled(false);
        }
    }//GEN-LAST:event_deffered_rButtonActionPerformed

    private void single_rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_single_rButtonActionPerformed
        // TODO add your handling code here:
        if(single_rButton.isSelected()){
            cash_rButton.setEnabled(true);
            card_rButton.setEnabled(true);
        } else {
            cash_rButton.setEnabled(false);
            card_rButton.setEnabled(false);
        }
    }//GEN-LAST:event_single_rButtonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        // TODO add your handling code here:
        valid();
    }//GEN-LAST:event_save_buttonActionPerformed

    private boolean valid() {
        boolean valid = true;
        if (selectedDonor == null) {
            name_label.setForeground(Color.RED);
            valid = false;
        } else {
            name_label.setForeground(Color.BLACK);
        }
        if (!amount_text.getText().matches("^[0-9]+$")) {
            amount_label.setForeground(Color.RED);
            valid = false;
        } else {
            amount_label.setForeground(Color.BLACK);
        }
        if (!(deffered_rButton.isSelected()||single_rButton.isSelected())) {
            payment_label.setForeground(Color.RED);
            valid = false;
        } else {
            payment_label.setForeground(Color.BLACK);
        }
        if (!(cash_rButton.isSelected()||card_rButton.isSelected())) {
            method_label.setForeground(Color.RED);
            valid = false;
        } else {
            method_label.setForeground(Color.BLACK);
        }
        return valid;
    }
    
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
            java.util.logging.Logger.getLogger(PledgeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PledgeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PledgeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PledgeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PledgeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount_label;
    private javax.swing.JTextField amount_text;
    private javax.swing.JButton cancel_button;
    private javax.swing.JRadioButton card_rButton;
    private javax.swing.JRadioButton cash_rButton;
    private javax.swing.JTextArea corpAdd_text;
    private javax.swing.JTextField corpName_text;
    private javax.swing.JRadioButton deffered_rButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup methodGroup;
    private javax.swing.JLabel method_label;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_text;
    private javax.swing.ButtonGroup paymentGroup;
    private javax.swing.JLabel payment_label;
    private javax.swing.JButton save_button;
    private javax.swing.JButton select_button;
    private javax.swing.JRadioButton single_rButton;
    private javax.swing.JTextField spouse_text;
    // End of variables declaration//GEN-END:variables

    @Override
    public void receiveIntent(Object intent) {
        EntityManager em = DbHelper.getEntityManager();
        selectedDonor = em.find(Donor.class, (long) intent);
        name_text.setText(selectedDonor.getName());
    }
}
