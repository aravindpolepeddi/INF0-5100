/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Fleet;
import model.FleetDirectory;

/**
 *
 * @author aravindpolepeddi
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
FleetDirectory fd;
Fleet fleet;
    CreateJPanel(FleetDirectory fleetdir) {
    initComponents();
    this.fd=fleetdir; 
    fleet=new Fleet();
    fleet.setAvailable("NO");
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCarModel = new javax.swing.JLabel();
        jTextCarModel = new javax.swing.JTextField();
        lblCarManufacturer = new javax.swing.JLabel();
        jTextYearofManufacture = new javax.swing.JTextField();
        lblYearofManufacture = new javax.swing.JLabel();
        jTextCarManufacturer = new javax.swing.JTextField();
        lblMaintainanceExpiry = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        jTextSerialNumber = new javax.swing.JTextField();
        lblAvailableCity = new javax.swing.JLabel();
        jTextAvailableCity = new javax.swing.JTextField();
        lblSeatingCapacity = new javax.swing.JLabel();
        jTextSeatingCapacity = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jCheckAvailable = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Fleet");

        lblCarModel.setBackground(new java.awt.Color(255, 255, 255));
        lblCarModel.setForeground(new java.awt.Color(255, 255, 255));
        lblCarModel.setText("Car Model");

        jTextCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCarModelActionPerformed(evt);
            }
        });

        lblCarManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblCarManufacturer.setText("Car Manufacturer");

        jTextYearofManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextYearofManufactureActionPerformed(evt);
            }
        });
        jTextYearofManufacture.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextYearofManufactureKeyPressed(evt);
            }
        });

        lblYearofManufacture.setBackground(new java.awt.Color(255, 255, 255));
        lblYearofManufacture.setForeground(new java.awt.Color(255, 255, 255));
        lblYearofManufacture.setText("Year of Manufacture");

        jTextCarManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCarManufacturerActionPerformed(evt);
            }
        });

        lblMaintainanceExpiry.setForeground(new java.awt.Color(255, 255, 255));
        lblMaintainanceExpiry.setText("Maintainance Expiry");

        lblSerialNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblSerialNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblSerialNumber.setText("Serial Number");

        jTextSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSerialNumberActionPerformed(evt);
            }
        });

        lblAvailableCity.setForeground(new java.awt.Color(255, 255, 255));
        lblAvailableCity.setText("City");

        jTextAvailableCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAvailableCityActionPerformed(evt);
            }
        });

        lblSeatingCapacity.setForeground(new java.awt.Color(255, 255, 255));
        lblSeatingCapacity.setText("Seating Capacity");

        jTextSeatingCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSeatingCapacityActionPerformed(evt);
            }
        });
        jTextSeatingCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextSeatingCapacityKeyPressed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(0, 153, 51));
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jDateChooser2.setDateFormatString("MM, dd, yyyy");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Set Available");

        jCheckAvailable.setForeground(new java.awt.Color(255, 255, 255));
        jCheckAvailable.setText("Check box to set available");
        jCheckAvailable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckAvailableItemStateChanged(evt);
            }
        });
        jCheckAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarModel)
                            .addComponent(lblCarManufacturer)
                            .addComponent(lblYearofManufacture)
                            .addComponent(lblMaintainanceExpiry)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblAvailableCity)
                            .addComponent(lblSeatingCapacity)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextYearofManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckAvailable))
                        .addGap(127, 127, 127))))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarModel)
                    .addComponent(jTextCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarManufacturer)
                    .addComponent(jTextCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearofManufacture)
                    .addComponent(jTextYearofManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaintainanceExpiry)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(jTextSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailableCity)
                    .addComponent(jTextAvailableCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatingCapacity)
                    .addComponent(jTextSeatingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckAvailable))
                .addGap(16, 16, 16)
                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCarModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCarModelActionPerformed

    private void jTextYearofManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextYearofManufactureActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_jTextYearofManufactureActionPerformed

    private void jTextCarManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCarManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCarManufacturerActionPerformed

    private void jTextSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSerialNumberActionPerformed

    private void jTextAvailableCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAvailableCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAvailableCityActionPerformed

    private void jTextSeatingCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSeatingCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSeatingCapacityActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder Error = new StringBuilder();
        Fleet newfleet = fd.addFleet();
        if(!jTextCarModel.getText().isEmpty()){newfleet.setCarModel(jTextCarModel.getText());}
        else{ Error.append("Enter Model \n");}
        if(!jTextCarManufacturer.getText().isEmpty()){newfleet.setCarManufacturer(jTextCarManufacturer.getText());}
        else{ Error.append("Enter Car Manufacturer \n");}
        if(!jTextYearofManufacture.getText().isBlank()){newfleet.setYearofManufacture(Integer.parseInt(jTextYearofManufacture.getText()));}
        else{ Error.append("Enter Year of manufacture \n");}
        newfleet.setMaintainanceExpiry(jDateChooser2.getDate());
        if(!jTextSerialNumber.getText().isBlank()){newfleet.setSerialNumber(jTextSerialNumber.getText());}
        else{ Error.append("Enter Serial Number \n");}
        if(!jTextAvailableCity.getText().isBlank()){newfleet.setAvailableCity(jTextAvailableCity.getText());}
        else{ Error.append("Enter City of availability \n");}
        if(!jTextSeatingCapacity.getText().isBlank()){newfleet.setSeatingCapacity(Integer.parseInt(jTextSeatingCapacity.getText()));}
        else{ Error.append("Enter Seating Capacity \n");}
        newfleet.setUpdateTime();
        newfleet.setAvailable(fleet.getAvailable());
        if(Error.isEmpty()){JOptionPane.showMessageDialog(this,"User information saved");}
        else{JOptionPane.showMessageDialog(this,Error);
        fd.removeFleet(newfleet);}
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jCheckAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAvailableActionPerformed

    }//GEN-LAST:event_jCheckAvailableActionPerformed

    private void jCheckAvailableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckAvailableItemStateChanged
        // TODO add your handling code here:
        if(jCheckAvailable.isSelected()){
        fleet.setAvailable("YES");
        }
        else{
        fleet.setAvailable("NO");
        }
        
    }//GEN-LAST:event_jCheckAvailableItemStateChanged

    private void jTextYearofManufactureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextYearofManufactureKeyPressed
        // TODO add your handling code here:
         String phoneNumber =jTextYearofManufacture.getText();
        int length = phoneNumber.length();
        char ch=evt.getKeyChar();
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
            if(length<4)
            jTextYearofManufacture.setEditable(true);
            else
            jTextYearofManufacture.setEditable(false);
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jTextYearofManufacture.setEditable(true);
            }
            else{
                jTextYearofManufacture.setEditable(false);}
        }
    }//GEN-LAST:event_jTextYearofManufactureKeyPressed

    private void jTextSeatingCapacityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSeatingCapacityKeyPressed
        // TODO add your handling code here:
        String phoneNumber =jTextSeatingCapacity.getText();
        int length = phoneNumber.length();
        char ch=evt.getKeyChar();
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
            if(length<4)
            jTextSeatingCapacity.setEditable(true);
            else
            jTextSeatingCapacity.setEditable(false);
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jTextSeatingCapacity.setEditable(true);
            }
            else{
                jTextSeatingCapacity.setEditable(false);}
        }
    }//GEN-LAST:event_jTextSeatingCapacityKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JCheckBox jCheckAvailable;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextAvailableCity;
    private javax.swing.JTextField jTextCarManufacturer;
    private javax.swing.JTextField jTextCarModel;
    private javax.swing.JTextField jTextSeatingCapacity;
    private javax.swing.JTextField jTextSerialNumber;
    private javax.swing.JTextField jTextYearofManufacture;
    private javax.swing.JLabel lblAvailableCity;
    private javax.swing.JLabel lblCarManufacturer;
    private javax.swing.JLabel lblCarModel;
    private javax.swing.JLabel lblMaintainanceExpiry;
    private javax.swing.JLabel lblSeatingCapacity;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYearofManufacture;
    // End of variables declaration//GEN-END:variables
}
