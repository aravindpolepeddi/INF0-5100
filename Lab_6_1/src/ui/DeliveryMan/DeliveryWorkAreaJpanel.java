/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryMan;

import business.Business;
import business.DeliveryMan.DeliveryMan;
import business.Order.Order;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravindpolepeddi
 */
public class DeliveryWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryWorkAreaJpanel
     */
    JPanel userProcessContainer;
    Business system;
    UserAccount useraccount;
    Order order;
    //DeliveryMan deliveryman =new DeliveryMan();
    public DeliveryWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount=account;
        this.system = system;
/*        for(Order o:system.getOrderdirectory().getOrderdir()){
        for(DeliveryMan dm:system.getDeliveryManDirectory().getDeliveryManList()){
        if(useraccount.getName().equals(o.getDeliveryManName())){
        deliveryman.setName(dm.getName());
        deliveryman.setPassword(dm.getPassword());
        deliveryman.setUsername(dm.getUsername());
        if(deliveryman.getOrderdir()==null)
        deliveryman.setOrderdir(dm.getOrderdir());
        deliveryman.addOrder(o);
        }
        }
        }
*/
        
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Restaurant", "OrderedTime", "Status", "DeliveredTime", "FeedBack"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Delivered");
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
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

int selectedRowIndex = jTable1.getSelectedRow();


     if (selectedRowIndex < 0) {
     JOptionPane.showMessageDialog(this, "Please select an Order");
     return;
}


        else{       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Order selectedOrder = (Order) model.getValueAt(selectedRowIndex, 0);
        Order updatedorder= system.getOrderdirectory().findOrder(selectedOrder.getIndex());
        updatedorder.setStatus("Delivered");
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        updatedorder.setDeliveryTime(formatter.format(date));
        int j=0;
        for(Order order:system.getOrderdirectory().getOrderdir()){
        if(order.getIndex()==updatedorder.getIndex()){
        system.getOrderdirectory().getOrderdir().set(j, updatedorder);
        }
        j++;
        }
                }
     refreshTable();


        
/*
        updatedorder.setStatus("Delivered");
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        updatedorder.setDeliveryTime(formatter.format(date));
        system.getOrderdirectory().getOrderdir().set(index, updatedorder);
        
*/

    }//GEN-LAST:event_jButton1ActionPerformed
public void refreshTable(){
        int rowCount =jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Order order: system.getOrderdirectory().getOrderdir()){
            if(useraccount.getName().equals(order.getDeliveryManName())){
            Object row[] = new Object[7];
            row[0] = order;
            row[1] = order.getCustomerName();
            row[2] = order.getRestaurantName();
            row[3] = order.getOrderTime();
            row[4] = order.getStatus();
            row[5] = order.getDeliveryTime();
            row[6] = order.getFeedback();
            model.addRow(row);
            
            }

        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
