/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui;

import java.text.DateFormatSymbols;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import universityfund.db.DbHelper;

/**
 *
 * @author MiriamMarie
 */
public class ReportWindow extends javax.swing.JFrame {

    /**
     * Creates new form ReportWindown
     */
    public ReportWindow() {
        initComponents();
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
        sol_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        thank_panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        invitation_panel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        annual_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        eachClass_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eachCategory_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eachDonor_button = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        monthly_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        class_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rep_combo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REPORTS");
        setName("Form"); // NOI18N
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        sol_panel.setBackground(new java.awt.Color(255, 255, 255));
        sol_panel.setName("sol_panel"); // NOI18N

        jButton1.setText("Send Solicitation Letter");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Send Thanking Letter");
        jButton2.setName("jButton2"); // NOI18N

        thank_panel.setBackground(new java.awt.Color(255, 255, 204));
        thank_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        thank_panel.setName("thank_panel"); // NOI18N

        jLabel12.setText("Dear ____________________,");
        jLabel12.setName("jLabel12"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("This letter is to inform you that we have received the promised pledge and gift from you.\n\nThe Beta University would like to send you our deepest gratitudes for choosing to pledge this fiscal year. Hope you would continue pledging pledges to the next pledgable years.\n\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane3.setViewportView(jTextArea1);

        jLabel13.setText("Yours truly,");
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel14.setText("Suzzane");
        jLabel14.setName("jLabel14"); // NOI18N

        javax.swing.GroupLayout thank_panelLayout = new javax.swing.GroupLayout(thank_panel);
        thank_panel.setLayout(thank_panelLayout);
        thank_panelLayout.setHorizontalGroup(
            thank_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thank_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thank_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thank_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thank_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(thank_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        thank_panelLayout.setVerticalGroup(
            thank_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thank_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        invitation_panel.setBackground(new java.awt.Color(204, 255, 204));
        invitation_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        invitation_panel.setName("invitation_panel"); // NOI18N

        jLabel15.setText("Dear ____________________,");
        jLabel15.setName("jLabel15"); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("This letter is to inform you that you are invited to place a pledge for this fiscal year for you are found to have close-ties with Beta University.\n\nAttached is a form, together with an envelope, for your response letter. The form is for you to fill up certain details about your pledge.\n\nHoping you would consider yourself to be part of the pledging people this pledgable year, and to the next pledgable years to come.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jTextArea2.setName("jTextArea2"); // NOI18N
        jScrollPane4.setViewportView(jTextArea2);

        jLabel16.setText("Yours truly,");
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel17.setText("Suzzane");
        jLabel17.setName("jLabel17"); // NOI18N

        javax.swing.GroupLayout invitation_panelLayout = new javax.swing.GroupLayout(invitation_panel);
        invitation_panel.setLayout(invitation_panelLayout);
        invitation_panelLayout.setHorizontalGroup(
            invitation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitation_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invitation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invitation_panelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invitation_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(invitation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        invitation_panelLayout.setVerticalGroup(
            invitation_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invitation_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sol_panelLayout = new javax.swing.GroupLayout(sol_panel);
        sol_panel.setLayout(sol_panelLayout);
        sol_panelLayout.setHorizontalGroup(
            sol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sol_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(thank_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(invitation_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(sol_panelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );
        sol_panelLayout.setVerticalGroup(
            sol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sol_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thank_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invitation_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Solicitation Letters", sol_panel);

        annual_panel.setBackground(new java.awt.Color(255, 255, 255));
        annual_panel.setName("annual_panel"); // NOI18N

        jLabel6.setText("Total Amount Raised:");
        jLabel6.setName("jLabel6"); // NOI18N

        eachClass_button.setText("Proceed>>");
        eachClass_button.setName("eachClass_button"); // NOI18N
        eachClass_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eachClass_buttonActionPerformed(evt);
            }
        });

        jLabel7.setText("Total for each class:");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText("Total for each category:");
        jLabel8.setName("jLabel8"); // NOI18N

        eachCategory_button.setText("Proceed>>");
        eachCategory_button.setName("eachCategory_button"); // NOI18N
        eachCategory_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eachCategory_buttonActionPerformed(evt);
            }
        });

        jLabel9.setText("Total for each donor circle:");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setText("Class total for each donor circle:");
        jLabel10.setName("jLabel10"); // NOI18N

        eachDonor_button.setText("Proceed>>");
        eachDonor_button.setName("eachDonor_button"); // NOI18N
        eachDonor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eachDonor_buttonActionPerformed(evt);
            }
        });

        jButton6.setText("Proceed>>");
        jButton6.setName("jButton6"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jLabel11.setText(getSum());
        jLabel11.setName("jLabel11"); // NOI18N

        javax.swing.GroupLayout annual_panelLayout = new javax.swing.GroupLayout(annual_panel);
        annual_panel.setLayout(annual_panelLayout);
        annual_panelLayout.setHorizontalGroup(
            annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(annual_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(annual_panelLayout.createSequentialGroup()
                        .addGroup(annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(annual_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(annual_panelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eachCategory_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(annual_panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(eachClass_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(44, 44, 44)
                                .addComponent(eachDonor_button)))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        annual_panelLayout.setVerticalGroup(
            annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, annual_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eachClass_button)
                    .addComponent(jLabel9)
                    .addComponent(eachDonor_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(annual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eachCategory_button)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Annual Report to Donors", annual_panel);

        monthly_panel.setBackground(new java.awt.Color(255, 255, 255));
        monthly_panel.setName("monthly_panel"); // NOI18N

        jLabel1.setText("Month of:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(getMonth()
        );
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Total pledges:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Total gifts and donations:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel18.setText("Percentage of pledges:");
        jLabel18.setName("jLabel18"); // NOI18N

        jLabel19.setText("Percentage of gifts and donations:");
        jLabel19.setName("jLabel19"); // NOI18N

        jLabel20.setText(getSumGifts());
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel21.setText(getPercentGifts());
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel22.setText("Total amount raised for this month:");
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel23.setText(getSumForThisMonth());
        jLabel23.setName("jLabel23"); // NOI18N

        javax.swing.GroupLayout monthly_panelLayout = new javax.swing.GroupLayout(monthly_panel);
        monthly_panel.setLayout(monthly_panelLayout);
        monthly_panelLayout.setHorizontalGroup(
            monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthly_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(monthly_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addGroup(monthly_panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addComponent(jLabel18)
                    .addGroup(monthly_panelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(monthly_panelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        monthly_panelLayout.setVerticalGroup(
            monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthly_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(15, 15, 15)
                .addGroup(monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(monthly_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monthly Report", monthly_panel);

        class_panel.setBackground(new java.awt.Color(255, 255, 255));
        class_panel.setName("class_panel"); // NOI18N

        jLabel5.setText("Class Representative:");
        jLabel5.setName("jLabel5"); // NOI18N

        rep_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rep_combo.setName("rep_combo"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout class_panelLayout = new javax.swing.GroupLayout(class_panel);
        class_panel.setLayout(class_panelLayout);
        class_panelLayout.setHorizontalGroup(
            class_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(class_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(class_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(class_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rep_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );
        class_panelLayout.setVerticalGroup(
            class_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(class_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(class_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rep_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Class Rep Contact List", class_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getMonth(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(Date.from(Instant.now()));
        return getMonthForInt(cal.get(Calendar.MONTH));
    }
    
    public String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11 ) {
            month = months[num];
        }
        return month;
    }
    
    public String getSum(){
        EntityManager em = DbHelper.getEntityManager();
        return em.createQuery(
           "SELECT SUM (f.amount) FROM Funding f "
        ).getSingleResult().toString();
    }

    public String getSumGifts(){
        EntityManager em = DbHelper.getEntityManager();
        return em.createNativeQuery(
              "SELECT SUM(AMOUNT) " +
                "FROM FUNDING JOIN DONATES ON FUNDINGID = FUNDING.ID JOIN DONOR ON DONORID = DONOR.ID " +
                "WHERE ((YEAR(FUNDING.DATEFUNDED) = ?1 " +
                "AND MONTH(FUNDING.DATEFUNDED) = ?2))"
        ).setParameter(1, java.time.Year.now().getValue()).
                setParameter(2, java.time.MonthDay.now().
                        getMonthValue()).getSingleResult().toString();
    }
    
    public String getSumForThisMonth(){
        EntityManager em = DbHelper.getEntityManager();
        return em.createNativeQuery(
              "SELECT SUM(AMOUNT) " +
                "FROM FUNDING " +
                "WHERE ((YEAR(FUNDING.DATEFUNDED) = ?1 " +
                "AND MONTH(FUNDING.DATEFUNDED) = ?2))"
        ).setParameter(1, java.time.Year.now().getValue()).
                setParameter(2, java.time.MonthDay.now().
                        getMonthValue()).getSingleResult().toString();
    }
    
    public String getPercentGifts(){
        String donations = getSumGifts();
        String all = getSum();
        
        return (Integer.valueOf(donations)/Integer.valueOf(all))*100 + "%";
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eachDonor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eachDonor_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eachDonor_buttonActionPerformed

    private void eachCategory_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eachCategory_buttonActionPerformed
        new TotalEachCategoryWindow().setVisible(true);
    }//GEN-LAST:event_eachCategory_buttonActionPerformed

    private void eachClass_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eachClass_buttonActionPerformed
        new TotalEachClassWindow().setVisible(true);
    }//GEN-LAST:event_eachClass_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel annual_panel;
    private javax.swing.JPanel class_panel;
    private javax.swing.JButton eachCategory_button;
    private javax.swing.JButton eachClass_button;
    private javax.swing.JButton eachDonor_button;
    private javax.swing.JPanel invitation_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel monthly_panel;
    private javax.swing.JComboBox rep_combo;
    private javax.swing.JPanel sol_panel;
    private javax.swing.JPanel thank_panel;
    // End of variables declaration//GEN-END:variables
}
