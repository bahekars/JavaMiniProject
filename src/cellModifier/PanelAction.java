/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cellModifier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP PC
 */
public class PanelAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
    }

    public void initEvent(TableActionEvent event, int row)
    {
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onEdit(row);
            }
                    
                });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onDelete(row);
            }
                    
                });
        cmdView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onView(row);
            }
                    
                });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdEdit = new cellModifier.ActionButton();
        cmdDelete = new cellModifier.ActionButton();
        cmdView = new cellModifier.ActionButton();

        cmdEdit.setText("Update");
        cmdEdit.setAlignmentY(0.0F);
        cmdEdit.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cmdEdit.setIconTextGap(0);
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setText("View Encounter");
        cmdDelete.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cmdDelete.setMaximumSize(new java.awt.Dimension(44, 44));
        cmdDelete.setMinimumSize(new java.awt.Dimension(44, 44));
        cmdDelete.setPreferredSize(new java.awt.Dimension(44, 44));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdView.setText("Delete");
        cmdView.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cmdView.setMaximumSize(new java.awt.Dimension(44, 44));
        cmdView.setMinimumSize(new java.awt.Dimension(44, 44));
        cmdView.setPreferredSize(new java.awt.Dimension(44, 44));
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cellModifier.ActionButton cmdDelete;
    private cellModifier.ActionButton cmdEdit;
    private cellModifier.ActionButton cmdView;
    // End of variables declaration//GEN-END:variables
}