/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RestaurantOwnerRole;

import business.Business;
import business.Organization.Organization;
import business.Restaurant.Item;
import business.Restaurant.Restaurant;
import business.Restaurant.RestaurantDirectory;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravindpolepeddi
 */
public class RestaurantMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantMenuJPanel
     */
    Boolean update=false;
    Item updateditem=new Item();
    JPanel userProcessContainer;
    Business system;
    UserAccount useraccount;
    public RestaurantMenuJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Business system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount=account;
        this.system = system;
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

        jTextItemName = new javax.swing.JTextField();
        jTextPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setText("Item Name");

        jLabel2.setText("Price");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jButton4))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Restaurant restaurant=system.getRestaurantDirectory().findRestaurant(useraccount.getName());
        if(!update){
        Item item=new Item();
        if(restaurant!=null){
        item.setItemName(jTextItemName.getText());
        item.setPrice(Integer.parseInt(jTextPrice.getText()));
        }
        if(restaurant.findItem(jTextItemName.getText(), item.getPrice())==null)
        restaurant.addItem(item);
        else{
        JOptionPane.showMessageDialog(this, "Item Already Exists");
        }
        }
        else{
        Item item=new Item();
        item.setItemName(jTextItemName.getText());
        item.setPrice(Integer.parseInt(jTextPrice.getText()));
        if(updateditem.getItemName().equals(item.getItemName())|| updateditem.getPrice()==(item.getPrice())){
        restaurant.addItem(item);
        update=false;
        }
        }

        refreshTable();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void refreshTable(){
        
        Restaurant restaurant=system.getRestaurantDirectory().findRestaurant(useraccount.getName());
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
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(update){
        JOptionPane.showMessageDialog(this, "Please Save your updated order");
        }
        else{
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Restaurant restaurant=system.getRestaurantDirectory().findRestaurant(useraccount.getName());
        int rowdelete=jTable1.getSelectedRow();
        if (rowdelete < 0) {
        JOptionPane.showMessageDialog(this, "Please select Item to Delete");
        return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(rowdelete);
        int rowCount =jTable1.getRowCount();
        int j=0;
        for(Item i: restaurant.getMenu()){
        if(j==rowdelete){
        restaurant.removeItem(i);
        break;
        }
        j++;
        }
        refreshTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        update=true;
        Restaurant restaurant=system.getRestaurantDirectory().findRestaurant(useraccount.getName());
        int rowupdate=jTable1.getSelectedRow();
        if (rowupdate < 0) {
        JOptionPane.showMessageDialog(this, "Please select Item to Update");
        update=false;
        return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          int j=0;
        for(Item i: restaurant.getMenu()){
        if(j==rowupdate){
        jTextItemName.setText(i.getItemName());
        jTextPrice.setText(String.valueOf(i.getPrice()));
        updateditem=i;
        restaurant.removeItem(i);
        break;        
        }
        j++;
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextItemName;
    private javax.swing.JTextField jTextPrice;
    // End of variables declaration//GEN-END:variables
}
