/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui;

import java.awt.event.ItemEvent;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import universityfund.db.DbHelper;
import universityfund.db.models.ClassRepresentative;
import universityfund.db.models.Donor;
import universityfund.ui.tablemodels.BatchMembersTableModel;

/**
 *
 * @author MiriamMarie
 */
public class AssignWindow extends javax.swing.JFrame {

    /**
     * Creates new form AssignWindow
     */
    public AssignWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        batch_combo = new javax.swing.JComboBox(loadAvailableBatches());
        jScrollPane1 = new javax.swing.JScrollPane();
        directory_table = new javax.swing.JTable();
        assign_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ASSIGN CLASS REP");
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText("Batch:");
        jLabel1.setName("jLabel1"); // NOI18N

        batch_combo.setName("batch_combo"); // NOI18N
        batch_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                batch_comboItemStateChanged(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        directory_table.setModel(new BatchMembersTableModel());
        directory_table.setName("directory_table"); // NOI18N
        jScrollPane1.setViewportView(directory_table);

        assign_button.setText("Assign as Class Representative");
        assign_button.setName("assign_button"); // NOI18N
        assign_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assign_button)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(batch_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(batch_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(assign_button)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batch_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_batch_comboItemStateChanged
        // don't go through if event is not selection
        if (evt.getStateChange() != ItemEvent.SELECTED)
            return;
        try {
            int selectedYear;
            selectedYear = Integer.valueOf(batch_combo.getSelectedItem().toString());
            updateTable(selectedYear);
        } catch (NumberFormatException e) {
            directory_table.setModel(new BatchMembersTableModel());
        }
    }//GEN-LAST:event_batch_comboItemStateChanged

    private void assign_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_buttonActionPerformed
        assignClassRepresentative();
    }//GEN-LAST:event_assign_buttonActionPerformed
    
    private void assignClassRepresentative() {
        int selectedIndex = directory_table.getSelectedRow();
        BatchMembersTableModel model = (BatchMembersTableModel) directory_table.getModel();
        long id = model.getDonorIdByRowIndex(selectedIndex);
        ClassRepresentative rep = new ClassRepresentative();
        rep.setBatchYear(Integer.valueOf(batch_combo.getSelectedItem().toString()));
        EntityManager em = DbHelper.getEntityManager();
        rep.setRepresentative(em.find(Donor.class, id));
        em.close();
        rep.save();
    }
    
    private Object[] loadAvailableBatches() {
        SortedSet<Object> yearSet = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String) {
                    return -1;
                } else if (o2 instanceof String){
                    return 1;
                }
                return Integer.compare((int) o1, (int) o2);
            }
        });
        EntityManager em = DbHelper.getEntityManager();
        yearSet.add("----");
        for (Donor d : em.createQuery("SELECT d FROM Donor d", Donor.class).getResultList()) {
            yearSet.add(d.getGraduationYear());
        }
        em.close();
        return yearSet.toArray();
    }
    
    private void updateTable(int selectedYear) {
        directory_table.setModel(new BatchMembersTableModel(selectedYear));
        EntityManager em = DbHelper.getEntityManager();
        try {
            Donor representative;
            representative = em.createQuery(
                    "SELECT r FROM ClassRepresentative r WHERE r.batchYear = :year", ClassRepresentative.class
            ).setParameter("year", selectedYear).getSingleResult().getRepresentative();
            BatchMembersTableModel tableModel = (BatchMembersTableModel) directory_table.getModel();
            int rowIndex = tableModel.getRowIndexByDonorId(representative.getId());
            directory_table.setRowSelectionInterval(rowIndex, rowIndex);
        } catch (NoResultException e) {
            // do nothing
        } finally {
            em.close();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign_button;
    private javax.swing.JComboBox batch_combo;
    private javax.swing.JTable directory_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
