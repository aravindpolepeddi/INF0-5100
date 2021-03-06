/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.customer;

import business.Business;
import business.Order.Order;
import business.Organization.Organization;
import business.Restaurant.Item;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {



    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    JPanel userProcessContainer;
    Business system;
    UserAccount useraccount;

    public ProcessWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount=account;
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 51));

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Result Submission");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Restaurant", "OrderedTime", "Status", "DeliveredTime", "DeliveredBy", "FeedBack"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Send Feedback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack)
                        .addGap(33, 33, 33)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents
public void populateTable(){
        int rowCount =jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Order order: system.getOrderdirectory().getOrderdir()){
            Object row[] = new Object[8];
            row[0] = order;
            row[1] = order.getCustomerName();
            row[2] = order.getRestaurantName();
            row[3] = order.getOrderTime();
            row[4] = order.getStatus();
            row[5] = order.getDeliveryTime();
            row[6] = order.getDeliveryManName();
            row[7] = order.getFeedback();
            model.addRow(row);
        }
}
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int index =jTable1.getSelectedRow();
        if (index < 0) {
        JOptionPane.showMessageDialog(this, "Please select an Order");
        return;
        }
        else{
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Order selectedOrder = (Order) model.getValueAt(index, 0);
        Order updatedorder= system.getOrderdirectory().findOrder(selectedOrder.getIndex());
        updatedorder.setFeedback(jTextField1.getText());
        int j=0;
        for(Order order:system.getOrderdirectory().getOrderdir()){
        if(order.getIndex()==updatedorder.getIndex()){
        system.getOrderdirectory().getOrderdir().set(j, updatedorder);
        }
        j++;
        //system.getOrderdirectory().getOrderdir().set(index, order);
        }
        populateTable();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
