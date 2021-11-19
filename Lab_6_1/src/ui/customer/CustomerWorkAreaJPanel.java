/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.customer;

import business.Business;
import business.Customer.Customer;
import business.Order.Order;
import business.Organization.Organization;
import business.Restaurant.Item;
import business.Restaurant.Restaurant;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.RestaurantOwnerRole.RestaurantMenuJPanel;

/**
 *
 * @author aravindpolepeddi
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Business system;   
    UserAccount account;
    Organization organization;
    Customer customer;
    Order order;
    
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account=account;
        this.organization=organization;
        this.customer=new Customer();
        this.order=new Order();
        String[] array = new String[system.getRestaurantDirectory().getRestaurantList().size()];
        int i=0;
        for(Restaurant res:system.getRestaurantDirectory().getRestaurantList()){
        array[i] = res.getRestaurantName();
        i++;
        }
        jComboBox1.setModel(new DefaultComboBoxModel<String>(array));
        Customer c = system.getCustomerDirectory().findCustomer(account.getName());
        customer.setName(c.getName());
        customer.setPassword(c.getPassword());
        customer.setUsername(c.getUsername());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("Fetch Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Restaurant");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Your Order");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Place Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Select Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int index=jComboBox1.getSelectedIndex();
        if(index<0){
        JOptionPane.showMessageDialog(this, "Please select an Restaurant");
        return;
        }
        Restaurant res=system.getRestaurantDirectory().getRestaurantList().get(index);
        
        refreshMenu(res);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        int index=jComboBox1.getSelectedIndex();
        if(selectedRow<0){
        JOptionPane.showMessageDialog(this, "Please select an Item");
        return;
        }
        if(index<0){
        JOptionPane.showMessageDialog(this, "Please select an Restaurant");
        return;
        }
        Restaurant res=system.getRestaurantDirectory().getRestaurantList().get(index);
        int j=0;
           for(Item i:res.getMenu()){
            if(j==selectedRow){
            addItemtoOrdrer(res,selectedRow);
            break;
        }
            j++;
      }
      refreshOrder();  
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(customer.getMenu().isEmpty()){
        JOptionPane.showMessageDialog(this,"Select an order to place order");
        }
        else{
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        order.setOrderTime(formatter.format(date));
        int index=jComboBox1.getSelectedIndex();
        Restaurant res=system.getRestaurantDirectory().getRestaurantList().get(index);
        order.setCustomerName(customer.getName());
        order.setRestaurantName(res.getRestaurantName());
        order.setDeliveryManName("Not Yet Assigned");
        order.setStatus("ordered");
        Random randomNum = new Random();
        int randomOrderId = randomNum.nextInt(65536 - 32768);
        order.setIndex(randomOrderId);
        order.setFeedback("");
        system.getOrderdirectory().addOrder(order);
        JOptionPane.showMessageDialog(this, "Order Placed");
        int rowCount =jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        int rowCount2 =jTable2.getRowCount();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        for(int j=rowCount2 - 1;j>=0;j--){
            model2.removeRow(j);
        }
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int rowCount =jTable2.getRowCount();
                
        int rowdelete=jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int j=0;
        for(Item i: customer.getMenu()){
        if(j==rowdelete){
        customer.removefromCustomerMenu(i);
        break;
        }
        j++;
        }
        refreshOrder();     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ProcessWorkRequestJPanel mcjp = new ProcessWorkRequestJPanel(userProcessContainer,account,organization, system);
        userProcessContainer.add("ManageUserAccountJPanel", mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed
public void refreshMenu(Restaurant restaurant){
        int rowCount =jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Item i: restaurant.getMenu()){
            Object row[] = new Object[2];
            row[0] = i.getItemName();
            row[1] = i.getPrice();
            model.addRow(row);
        }
}

public void refreshOrder(){
        int rowCount =jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Item i: customer.getMenu()){
            Object row[] = new Object[2];
            row[0] = i.getItemName();
            row[1] = i.getPrice();
            model.addRow(row);
        }
}

public void addItemtoOrdrer(Restaurant restaurant,int selectedRow){
        int rowCount =jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        int j=0;
        for(Item i: restaurant.getMenu()){
            if(selectedRow==j){
            Object row[] = new Object[2];
            row[0] = i.getItemName();
            row[1] = i.getPrice();
            Item item=restaurant.findItem(i.getItemName(), i.getPrice());
            customer.getMenu().add(item);
            //customer.addtoCustomerMenu(item);
            model.addRow(row);
            }
            j++;
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
