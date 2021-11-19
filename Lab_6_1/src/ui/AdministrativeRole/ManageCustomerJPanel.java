/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import business.Business;
import business.Customer.Customer;
import business.Role.CustomerRole;
import business.Customer.CustomerDirectory;
import business.Employee.Employee;
import business.Organization.DeliveryOrganization;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravindpolepeddi
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    private Business system;
    private CustomerDirectory cusdir;
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Boolean update=false;
    private Customer updatedcus=new Customer();
    private UserAccount updatedua = new UserAccount();
    
    public ManageCustomerJPanel(JPanel userProcessContainer,Business system,CustomerDirectory cusdir) {
        initComponents();
        this.cusdir=cusdir;
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateTable();
    }

        private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTableCustomers.getModel();
        
        model.setRowCount(0);
        
        for (business.Customer.Customer customer : cusdir.getCustomerList()){
            Object[] row = new Object[1];
            row[0] = customer.getName();

            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomers = new javax.swing.JTable();
        jTextName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(jTableCustomers);

        jLabel1.setText("Enter Name");

        jLabel2.setText("Enter Username");

        jLabel3.setText("Enter Password");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextName)
                            .addComponent(jTextUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSave)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonSave)
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
      
       if(!update){
       CustomerRole c = new CustomerRole();
       system.getCustomerDirectory().createCustomer(jTextName.getText(),jTextUsername.getText(), jPasswordField1.getText());
       system.getUserAccountDirectory().createUserAccount(system,jTextName.getText(),jTextUsername.getText(), jPasswordField1.getText(), c);
       }
       else{
       updatedcus.setName(jTextName.getText());
       updatedcus.setUsername(jTextUsername.getText());
       updatedcus.setPassword(jPasswordField1.getText());
       system.getCustomerDirectory().getCustomerList().add(updatedcus);
       
       updatedua.setName(updatedcus.getName());
       updatedua.setUsername(updatedcus.getUsername());
       updatedua.setPassword(updatedcus.getPassword());
       
       system.getUserAccountDirectory().getUserAccountList().add(updatedua);
       
       update=false;
       }
        
       populateTable();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!update){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
        else{
        JOptionPane.showMessageDialog(this, "Please Save your updated Customer");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int index =jTableCustomers.getSelectedRow();
        if (index < 0) {
        JOptionPane.showMessageDialog(this, "Please select an Customer");
        return;
        }
        else{
        int j=0;
        for(Customer customer: system.getCustomerDirectory().getCustomerList()){
        if(j==index){
        Customer updatedcustomer=system.getCustomerDirectory().findCustomer(customer.getName());
        for(UserAccount ua:system.getUserAccountDirectory().getUserAccountList()){
        if(ua.getName().equals(customer.getName())){
        system.getUserAccountDirectory().getUserAccountList().remove(ua);
        //system.getCustomerDirectory().deleteCustomer(updatedcustomer);
        break;
        }
        }
        system.getCustomerDirectory().deleteCustomer(updatedcustomer);
        break;
        }
        j++;
        }
        
        }
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        update=true;
        int index=jTableCustomers.getSelectedRow();
        if(index<0){
        JOptionPane.showMessageDialog(this, "Please select an Customer");
        update=false;
        return;
        }
        int i=0;
        for(Customer customer:system.getCustomerDirectory().getCustomerList()){
        if(i==index){
        updatedcus.setName(customer.getName());
        updatedcus.setMenu(customer.getMenu());
        updatedcus.setUsername(customer.getUsername());
        updatedcus.setPassword(customer.getPassword());
        updatedcus.setAddress(customer.getAddress());
        
        for(UserAccount ua:system.getUserAccountDirectory().getUserAccountList()){
        if(ua.getName().equals(customer.getName())){
        updatedua.setName(ua.getName());
        updatedua.setUsername(ua.getUsername());
        updatedua.setPassword(ua.getPassword());
        updatedua.setRole(ua.getRole());
        updatedua.setEmployee(ua.getEmployee());
        
        
                
        jTextName.setText(ua.getName());
        jTextUsername.setText(ua.getUsername());
        jPasswordField1.setText(ua.getPassword());
        
        system.getCustomerDirectory().getCustomerList().remove(customer);
        system.getUserAccountDirectory().getUserAccountList().remove(ua);
        break;
        }
        }
        break;
        }
        i++;
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomers;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
