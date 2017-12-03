/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.NoSuchElementException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * GUI FOR MANAGER
 * @author pasindu
 */
public class ManagerGUI extends javax.swing.JFrame {

    /**
     * Creates new form ManagerGUI
     */
    public ManagerGUI() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        viewInventoryButton = new javax.swing.JButton();
        modifyPricingButton = new javax.swing.JButton();
        modifyQuantityButton = new javax.swing.JButton();
        addMenuItemButton = new javax.swing.JButton();
        removeMenuItemButton = new javax.swing.JButton();
        viewTransactionsButton = new javax.swing.JButton();
        viewCustomersButton = new javax.swing.JButton();
        addNewCouponButton = new javax.swing.JButton();
        removeCouponButton = new javax.swing.JButton();
        viewCouponsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS System V1.0");

        jLabel1.setText("Logged In As Manager");

        viewInventoryButton.setText("View All Inventory");
        viewInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryButtonActionPerformed(evt);
            }
        });

        modifyPricingButton.setText("Modify Pricing");
        modifyPricingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPricingButtonActionPerformed(evt);
            }
        });

        modifyQuantityButton.setText("Modify Quantity");
        modifyQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityButtonActionPerformed(evt);
            }
        });

        addMenuItemButton.setText("Add New Menu Item");
        addMenuItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemButtonActionPerformed(evt);
            }
        });

        removeMenuItemButton.setText("Remove Menu Item");
        removeMenuItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuItemButtonActionPerformed(evt);
            }
        });

        viewTransactionsButton.setText("View All Transactions");
        viewTransactionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionsButtonActionPerformed(evt);
            }
        });

        viewCustomersButton.setText("View All Customers");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        addNewCouponButton.setText("Add New Coupon");
        addNewCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCouponButtonActionPerformed(evt);
            }
        });

        removeCouponButton.setText("Remove Coupon");
        removeCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCouponButtonActionPerformed(evt);
            }
        });

        viewCouponsButton.setText("View All Coupons");
        viewCouponsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCouponsButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewTransactionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewCouponsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewCustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addMenuItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modifyQuantityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeMenuItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modifyPricingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewInventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addNewCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitButton))
                                    .addComponent(removeCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(viewInventoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCustomersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewTransactionsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCouponsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeMenuItemButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addMenuItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifyQuantityButton)
                            .addComponent(modifyPricingButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewCouponButton)
                    .addComponent(removeCouponButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        POS_SystemV1.setActiveUser(null);
        this.dispose();
        POS_SystemV1.NewLogin();
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void viewInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryButtonActionPerformed
        String[] inventory=POS_SystemV1.getActiveUser().viewInventory();
        if(inventory==null){
            JOptionPane.showMessageDialog(this, "Inventory Is Empty", "View Inventory",JOptionPane.PLAIN_MESSAGE);
        }
        String show="";
        for(String i:inventory){
            show+=(i+"\n");
        }
        JOptionPane.showMessageDialog(this, show, "View Inventory", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewInventoryButtonActionPerformed

    private void modifyPricingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPricingButtonActionPerformed
        JTextField menuItemName = new JTextField(5);
        JTextField newPrice = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("Menu Item Name: "));
        subPanel.add(menuItemName);
        subPanel.add(Box.createVerticalStrut(5));
        subPanel.add(new JLabel("New Price: "));
        subPanel.add(newPrice);
      

        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Modify Pricing", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           String name=menuItemName.getText();
           
           try{
               double price=Double.parseDouble(newPrice.getText());
               POS_SystemV1.getActiveUser().Modify_Pricing(name, price);
           }catch(NullPointerException e){
               JOptionPane.showMessageDialog(this, "No Price Entered", "Modify Pricing Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(IllegalArgumentException e){
               if(name.equals("")){
                   JOptionPane.showMessageDialog(this, "No Menu Item Entered", "Modify Pricing Error",JOptionPane.ERROR_MESSAGE); 
                   return;
               }
               JOptionPane.showMessageDialog(this, "Invaild Price", "Modify Pricing Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(NoSuchElementException e){
               JOptionPane.showMessageDialog(this, "Menu Item Not Found. Please Create A New Menu Item First.", "Modify Pricing Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "New Price Is Added Successfully.", "Price Modify Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_modifyPricingButtonActionPerformed

    private void modifyQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityButtonActionPerformed
        JTextField menuItemName = new JTextField(5);
        JTextField newQuantity = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("Menu Item Name: "));
        subPanel.add(menuItemName);
        subPanel.add(Box.createVerticalStrut(5));
        subPanel.add(new JLabel("New Quantity: "));
        subPanel.add(newQuantity);
      

        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Modify Quantity", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           String name=menuItemName.getText();
           
           try{
               int quantity=Integer.parseInt(newQuantity.getText());
               POS_SystemV1.getActiveUser().Modify_Quantity(name, quantity);
           }catch(NullPointerException e){
               JOptionPane.showMessageDialog(this, "No Quantity Entered", "Modify Quantity Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(IllegalArgumentException e){
               if(name.equals("")){
                   JOptionPane.showMessageDialog(this, "No Menu Item Entered", "Modify Quantity Error",JOptionPane.ERROR_MESSAGE); 
                   return;
               }
               JOptionPane.showMessageDialog(this, "Invaild Quantity", "Modify Quantity Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(NoSuchElementException e){
               JOptionPane.showMessageDialog(this, "Menu Item Not Found. Please Create A New Menu Item First.", "Modify Quantity Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "New Quantity Is Added Successfully.", "Quantity Modify Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_modifyQuantityButtonActionPerformed

    private void addMenuItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemButtonActionPerformed
        JTextField menuItemName = new JTextField(5);
        JTextField newPrice = new JTextField(5);
        JTextField newQuantity = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("New Menu Item Name: "));
        subPanel.add(menuItemName);
        subPanel.add(Box.createVerticalStrut(5));
        subPanel.add(new JLabel("Price: "));
        subPanel.add(newPrice);
        subPanel.add(Box.createVerticalStrut(5));
        subPanel.add(new JLabel("Quantity: "));
        subPanel.add(newQuantity);
      

        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Add New Menu Item", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           String name=menuItemName.getText();
           if(name.equals("")){
                   JOptionPane.showMessageDialog(this, "No Menu Item Entered", "Add New Menu Item Error",JOptionPane.ERROR_MESSAGE); 
                   return;
           }
           double price;
           int quantity;
           try{
               price=Double.parseDouble(newPrice.getText());
               quantity=Integer.parseInt(newQuantity.getText());
           }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(this, "Invaild Quantity OR Price", "Add New Menu Item Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(NullPointerException e){
               JOptionPane.showMessageDialog(this, "No Quantity OR No Price Entered", "Add New Menu Item Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }
           
           if(price==0.0){
               JOptionPane.showMessageDialog(this, "Invaild Price", "Add New Menu Item Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }
           

           try{
               POS_SystemV1.getActiveUser().Add_New_Inventory(name, price, quantity);
           }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(this, e.getMessage(), "Add New Menu Item Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "New Menu Item Is Added Successfully.", "Add New Menu Item Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_addMenuItemButtonActionPerformed

    private void removeMenuItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuItemButtonActionPerformed
        JTextField menuItemName = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("Menu Item Name: "));
        subPanel.add(menuItemName);
      
        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Remove Menu Item", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           String name=menuItemName.getText();
           if(name.equals("")){
                   JOptionPane.showMessageDialog(this, "No Menu Item Entered", "Remove Menu Item Error",JOptionPane.ERROR_MESSAGE); 
                   return;
           }

           try{
               POS_SystemV1.getActiveUser().RemoveInventory(name);
           }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(this, e.getMessage(), "Remove Menu Item Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "Menu Item Is Removed Successfully.", "Remove Menu Item Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_removeMenuItemButtonActionPerformed

    private void viewTransactionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionsButtonActionPerformed
        String[] transations=POS_SystemV1.getActiveUser().ViewTransactions();
        if(transations==null){
            JOptionPane.showMessageDialog(this, "No Transactions Happened Yet", "View All Transactions",JOptionPane.PLAIN_MESSAGE);
            return;
        }
        String show="";
        for(String i:transations){
            show+=(i+"\n");
        }
        JOptionPane.showMessageDialog(this, show, "View All Transactions", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewTransactionsButtonActionPerformed

    private void viewCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersButtonActionPerformed
        String[] customers=POS_SystemV1.getActiveUser().ViewCustomers();
        if(customers==null){
            JOptionPane.showMessageDialog(this, "No Customers To View", "View All Customers",JOptionPane.PLAIN_MESSAGE);
            return;
        }
        String show="";
        for(String i:customers){
            show+=(i+"\n\n");
        }
        JOptionPane.showMessageDialog(this, show, "View All Customers", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewCustomersButtonActionPerformed

    private void addNewCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCouponButtonActionPerformed
        JTextField couponNumber = new JTextField(5);
        JTextField discountValue = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("New Coupon Number: "));
        subPanel.add(couponNumber);
        subPanel.add(Box.createVerticalStrut(5));
        subPanel.add(new JLabel("Discount Percentage: "));
        subPanel.add(discountValue);
      

        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Add New Coupon", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           
           try{
               int coupon=Integer.parseInt(couponNumber.getText());
               int discount=Integer.parseInt(discountValue.getText());
               POS_SystemV1.getActiveUser().addCoupon(coupon, discount);
           }catch(NullPointerException e){
               JOptionPane.showMessageDialog(this, "No Price or No Discount Percentage Entered", "Add Coupon Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }catch(IllegalArgumentException e){
               if(e instanceof NumberFormatException){
                   JOptionPane.showMessageDialog(this, "Invaid Coupon Number or Discount Percentage", "Add Coupon Error",JOptionPane.ERROR_MESSAGE); 
                   return;
               }
               JOptionPane.showMessageDialog(this, e.getMessage(), "Add Coupon Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "New Coupon Is Added Successfully.", "New Coupon Adding Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_addNewCouponButtonActionPerformed

    private void removeCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCouponButtonActionPerformed
        JTextField couponNumber = new JTextField(5);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));               
        subPanel.add(new JLabel("Coupon Number: "));
        subPanel.add(couponNumber);
      
        int userinput = JOptionPane.showConfirmDialog(this, subPanel, "Remove Coupon", JOptionPane.OK_CANCEL_OPTION);
        if (userinput == JOptionPane.OK_OPTION) {
           try{
               int coupon=Integer.parseInt(couponNumber.getText());
               POS_SystemV1.getActiveUser().removeCoupon(coupon);
           }catch(IllegalArgumentException e){
               JOptionPane.showMessageDialog(this, e.getMessage(), "Remove Coupon Error",JOptionPane.ERROR_MESSAGE); 
               return;
           }

           JOptionPane.showMessageDialog(this, "Coupon Is Removed Successfully.", "Remove Coupon Successful",JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_removeCouponButtonActionPerformed

    private void viewCouponsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCouponsButtonActionPerformed
        String[] coupons=POS_SystemV1.getActiveUser().ViewCoupons();
        boolean isEmpty=true;
        
        String show="";
        for(String i:coupons){
            if(i!=null){
              isEmpty=false;
              show+=(i+"\n");  
            }else{
                break;
            }
        }
        
        if(isEmpty){
            JOptionPane.showMessageDialog(this, "No Coupons To View", "View Coupons Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, show, "View All Coupons", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_viewCouponsButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenuItemButton;
    private javax.swing.JButton addNewCouponButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton modifyPricingButton;
    private javax.swing.JButton modifyQuantityButton;
    private javax.swing.JButton removeCouponButton;
    private javax.swing.JButton removeMenuItemButton;
    private javax.swing.JButton viewCouponsButton;
    private javax.swing.JButton viewCustomersButton;
    private javax.swing.JButton viewInventoryButton;
    private javax.swing.JButton viewTransactionsButton;
    // End of variables declaration//GEN-END:variables
}
