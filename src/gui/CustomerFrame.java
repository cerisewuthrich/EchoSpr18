/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author(s) yani.muskwe
 */
package gui;

import core.Customer;
import dao.CustomerDAO;


import dao.DBConnection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableRowSorter;

public class CustomerFrame extends javax.swing.JFrame {
    private DBConnection conn;
    private CustomerDAO customerDAO;
    private List<Customer> customers;
    CustomerTableModel model;

    /**
     * Creates new form CustomerFrame
     */
    public CustomerFrame(DBConnection myConn) {
        initComponents();
        this.conn = myConn;
        customerDAO = new CustomerDAO(this.conn);
        customer_table.setAutoCreateRowSorter(true);
        
        try
        {
            customers = customerDAO.getAllCustomers();
            model = new CustomerTableModel(customers);
            customer_table.setModel(model);            
        } 
        catch(Exception ex)
        {
            Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error 2: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        add_bttn = new javax.swing.JButton();
        reset_bttn = new javax.swing.JButton();
        delete_bttn = new javax.swing.JButton();
        update_bttn = new javax.swing.JButton();
        id_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        state_label = new javax.swing.JLabel();
        zipcode_label = new javax.swing.JLabel();
        contact_label = new javax.swing.JLabel();
        id_txtfld = new javax.swing.JTextField();
        name_txtfld = new javax.swing.JTextField();
        address_txtfld = new javax.swing.JTextField();
        city_txtfld = new javax.swing.JTextField();
        state_txtfld = new javax.swing.JTextField();
        zipcode_txtfld = new javax.swing.JTextField();
        contact_txtfld = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "City", "Zipcode", "Contact"
            }
        ));
        jScrollPane1.setViewportView(customer_table);

        add_bttn.setText("Add");
        add_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bttnActionPerformed(evt);
            }
        });
        contact_txtfld.setNextFocusableComponent(add_bttn);
        
        reset_bttn.setText("Reset");
        reset_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_bttnActionPerformed(evt);
            }
        });
        add_bttn.setNextFocusableComponent(delete_bttn);    
        
        delete_bttn.setText("Delete");
        delete_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bttnActionPerformed(evt);
            }
        });
        reset_bttn.setNextFocusableComponent(id_txtfld); 

        update_bttn.setText("Update");
        update_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bttnActionPerformed(evt);
            }
        });
        delete_bttn.setNextFocusableComponent(update_bttn); 
        update_bttn.setNextFocusableComponent(reset_bttn); 

        id_label.setText("ID");
        
        address_label.setText("Address");

        city_label.setText("City");

        state_label.setText("State");

        zipcode_label.setText("Zipcode");

        contact_label.setText("Contact");

        name_label.setText("Name");        
        
        id_txtfld.setNextFocusableComponent(name_txtfld);
        name_txtfld.setNextFocusableComponent(address_txtfld);
        address_txtfld.setNextFocusableComponent(city_txtfld);
        city_txtfld.setNextFocusableComponent(state_txtfld);
        state_txtfld.setNextFocusableComponent(zipcode_txtfld);
        zipcode_txtfld.setNextFocusableComponent(contact_txtfld);

        jScrollPane2.setViewportView(jScrollBar1);
        // Add a listener for mouse click on table row
         customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_tableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name_label)
                        .addGap(60, 60, 60)
                        .addComponent(name_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contact_label)
                                .addGap(49, 49, 49)
                                .addComponent(contact_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipcode_label)
                                .addGap(50, 50, 50)
                                .addComponent(zipcode_txtfld))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_txtfld))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(state_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(state_txtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(city_txtfld)
                                    .addComponent(address_txtfld))))
                        .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_bttn)
                    .addComponent(add_bttn)
                    .addComponent(update_bttn)
                    .addComponent(reset_bttn))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_label)
                        .addComponent(add_bttn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(name_txtfld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(delete_bttn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(state_label)
                            .addComponent(state_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(zipcode_label))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(zipcode_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset_bttn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contact_txtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_label)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(update_bttn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
     private void customer_tableMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int selectedRow = customer_table.getSelectedRow();
        int selectedRowModel = customer_table.convertRowIndexToModel(selectedRow);
        
        id_txtfld.setText(model.getValueAt(selectedRowModel,0).toString());
        name_txtfld.setText(model.getValueAt(selectedRowModel,1).toString());       
        address_txtfld.setText(model.getValueAt(selectedRowModel,2).toString());
        city_txtfld.setText(model.getValueAt(selectedRowModel,3).toString());
        state_txtfld.setText(model.getValueAt(selectedRowModel,4).toString());       
        zipcode_txtfld.setText(model.getValueAt(selectedRowModel,5).toString());
        contact_txtfld.setText(model.getValueAt(selectedRowModel,6).toString());
        add_bttn.setEnabled(false);
        
    }        
    private void add_bttnActionPerformed(java.awt.event.ActionEvent evt){
        
        
        int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to add this cutomer?","Add",JOptionPane.YES_NO_OPTION);
        
        if(ans == 0){
            try{
                Customer customer = new Customer(Integer.parseInt(id_txtfld.getText()),
                    name_txtfld.getText(), address_txtfld.getText(),city_txtfld.getText(),
                    state_txtfld.getText(), zipcode_txtfld.getText(), contact_txtfld.getText());
                
                customerDAO.addCustomer(customer);
                customers = customerDAO.getAllCustomers();
                model = new CustomerTableModel(customers);
                customer_table.setModel(model);
                JOptionPane.showMessageDialog(this,"Customer added!");
                System.out.println("Customer added!");

            }
            catch (NumberFormatException ex){
                String errorMessage = "";
                if(ex.getMessage().contains("input string"))
                {
                    errorMessage = "Invalid format entered in textfields";
                    errorMessage += ". Please ensure that integer value is\n";
                    errorMessage += "entered for ID .\n";
                    JOptionPane.showMessageDialog(this, "Value Error : " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);

            }
            catch(Exception exc){
                System.out.println("A Problem occured while adding a Customer: " + exc);
                JOptionPane.showMessageDialog(this,"A problem ocurred while trying to add a customer!");
            }
        }
        resetTextFields();
    }

    private void reset_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bttnActionPerformed
        resetTextFields();
    }//GEN-LAST:event_reset_bttnActionPerformed

    private void delete_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bttnActionPerformed
        try{
            if(inDatabase(Integer.parseInt(id_txtfld.getText())) == false){
                String notInDatabase = "";
                notInDatabase += "Error: The ID you have entered is not in the Table.\n";
                notInDatabase += "Please make sure the ID you have entered is an ID listed ";
                notInDatabase += "in the table.\n";
                JOptionPane.showMessageDialog(this, notInDatabase, "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Customer customer = new Customer(Integer.parseInt(id_txtfld.getText()),
                    name_txtfld.getText(), address_txtfld.getText(),city_txtfld.getText(),
                    state_txtfld.getText(), zipcode_txtfld.getText(), contact_txtfld.getText());
                int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this cutomer?","Delete",JOptionPane.YES_NO_OPTION);
                if(ans ==0){
                    customerDAO.deleteCustomer(customer);
                    customers = customerDAO.getAllCustomers();
                    model = new CustomerTableModel(customers);
                    customer_table.setModel(model);
                    JOptionPane.showMessageDialog(this,"Customer deleted!");
                    System.out.println("Customer deleted!");
                    
                }
            } 
        } 
        catch (NumberFormatException ex){
            String errorMessage = "";
             if(ex.getMessage().contains("input string"))
             {
                errorMessage = "Invalid format entered in textfields";
                errorMessage += ". Please ensure that the ID entered\n";
                errorMessage += " is the correct ID of the customer you";
                errorMessage += " wish to delete.";
                JOptionPane.showMessageDialog(this, "Value Error : " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception exc){
            System.out.println("A Problem occured while deleting a Customer: " + exc);
            JOptionPane.showMessageDialog(this,"A problem ocurred while trying to delete a customer!");
        }
        resetTextFields();
    }
    
    
    private void update_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bttnActionPerformed
        try{
            if(inDatabase(Integer.parseInt(id_txtfld.getText())) == false){
                String notInDatabase = "";
                notInDatabase += "Error: The ID you have entered is not in the Table.\n";
                notInDatabase += "Please make sure the ID you have entered is an ID listed ";
                notInDatabase += "in the table.\n";
                JOptionPane.showMessageDialog(this, notInDatabase, "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Customer customer = new Customer(Integer.parseInt(id_txtfld.getText()),
                    name_txtfld.getText(), address_txtfld.getText(),city_txtfld.getText(),
                     state_txtfld.getText(), zipcode_txtfld.getText(), contact_txtfld.getText());
                int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to update this cutomer?","Update",JOptionPane.YES_NO_OPTION);
                if(ans ==0){
                    customerDAO.updateCustomer(customer);
                    customers = customerDAO.getAllCustomers();
                    model = new CustomerTableModel(customers);
                    customer_table.setModel(model);
                    JOptionPane.showMessageDialog(this,"Customer updated!");
                    System.out.println("Customer updated!");
                }
            }    
        }
        catch (NumberFormatException ex){
            String errorMessage = "";
             if(ex.getMessage().contains("input string"))
             {
                errorMessage = "Invalid format entered in textfields";
                errorMessage += ". Please ensure that the ID entered\n";
                errorMessage += " is the correct ID of the customer you";
                errorMessage += " wish to update.";
                JOptionPane.showMessageDialog(this, "Value Error : " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception exc){
            System.out.println("A Problem occured while deleting a Customer: " + exc);
            JOptionPane.showMessageDialog(this,"A problem ocurred while trying to delete a customer!");
        }
        resetTextFields();
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
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame(null).setVisible(true);
            }
        });
    }
    
    
    private void resetTextFields(){
        id_txtfld.setText("");
        name_txtfld.setText("");
        address_txtfld.setText("");
        city_txtfld.setText("");
        state_txtfld.setText("");
        zipcode_txtfld.setText("");
        contact_txtfld.setText("");
        
        add_bttn.setEnabled(true);
    }
    
     private boolean inDatabase(int id){
         try{
            List<Customer> list = customerDAO.getAllCustomers();
            int size = list.size();
            for(int i =0; i < size; i++){
                Customer cust = list.get(i);
                if(cust.getID() == id){
                    return true;
                }
            }
         }
         catch(Exception exc){
             
         }
         return false;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bttn;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_txtfld;
    private javax.swing.JLabel city_label;
    private javax.swing.JTextField city_txtfld;
    private javax.swing.JLabel contact_label;
    private javax.swing.JTextField contact_txtfld;
    private javax.swing.JTable customer_table;
    private javax.swing.JButton delete_bttn;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_txtfld;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_txtfld;
    private javax.swing.JButton reset_bttn;
    private javax.swing.JLabel state_label;
    private javax.swing.JTextField state_txtfld;
    private javax.swing.JButton update_bttn;
    private javax.swing.JLabel zipcode_label;
    private javax.swing.JTextField zipcode_txtfld;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    
    
    
    
}
