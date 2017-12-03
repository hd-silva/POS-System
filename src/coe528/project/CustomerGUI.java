/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * GUI FOR CUSTOMERS
 * @author pasindu
 */
public class CustomerGUI extends javax.swing.JFrame {

    private static boolean startListening=false;
    private static boolean checkOutSuccessful;
    private static DefaultListModel basketModel=new DefaultListModel();
    private ArrayList<MenuItem> tempInventory;
    private static double discount;
    private static int couponNumber=0;
    /**
     * Creates new form CustomerGUI
     */
    public CustomerGUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.savedLabel.setText("");
        this.activeCouponLabel.setText("");
        
        this.menuItemComboBox.setEnabled(false);
        this.quantityComboBox.setEnabled(false);

        this.addButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.checkoutButton.setEnabled(false);
        
        this.basketList.setModel(basketModel);
        this.loginLable.setText("Logged In As Customer: "+POS_SystemV1.getActiveUser().getUserName());
        
        
        this.applyCouponButton.setEnabled(false);
        this.couponTextField.setEnabled(false);
        
        POS_SystemV1.getActiveUser().getBasket().clear();
        updateBasketList();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginLable = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newOrderButton = new javax.swing.JButton();
        menuItemComboBox = new javax.swing.JComboBox<>();
        quantityComboBox = new javax.swing.JComboBox<>();
        menuItemLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        basketList = new javax.swing.JList<>();
        basketLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        totalNetPricelabel = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        applyCouponButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        couponLabel = new javax.swing.JLabel();
        couponTextField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        totalPaymentLabel = new javax.swing.JLabel();
        activeCouponLabel = new javax.swing.JLabel();
        savedLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS System V1.0");
        setResizable(false);

        loginLable.setText("Logged In As Customer:");
        loginLable.setToolTipText("");

        newOrderButton.setText("New Order");
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        menuItemComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuItemComboBoxItemStateChanged(evt);
            }
        });

        menuItemLabel.setText("Menu Item");

        quantityLabel.setText("Quantity");

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

        jScrollPane1.setViewportView(basketList);

        basketLabel.setText("Basket:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        totalNetPricelabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        totalNetPricelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalNetPricelabel.setText("$ 0.0");

        priceLabel1.setText("Total Net Price:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel1)
                                    .addComponent(totalNetPricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(basketLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(basketLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalNetPricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(menuItemLabel)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderButton)
                    .addComponent(logoutButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemLabel)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );

        applyCouponButton.setText("Apply Coupon");
        applyCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCouponButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Check Out");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        couponLabel.setText("Coupon Code:");

        paymentLabel.setText("Total Payment:");

        totalPaymentLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalPaymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPaymentLabel.setText("$ 0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(couponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(couponLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(applyCouponButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couponTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutButton)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(applyCouponButton)
                        .addComponent(couponLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        activeCouponLabel.setForeground(new java.awt.Color(255, 0, 0));
        activeCouponLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        savedLabel.setForeground(new java.awt.Color(255, 0, 0));
        savedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(loginLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(activeCouponLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savedLabel)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activeCouponLabel)
                    .addComponent(savedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void setCheckOutSuccessful(boolean checkOutSuccessful) {
        CustomerGUI.checkOutSuccessful = checkOutSuccessful;
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        POS_SystemV1.setActiveUser(null);
        this.dispose();
        POS_SystemV1.NewLogin();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        startListening=false;
        couponNumber=0;
        discount=0.0;
        POS_SystemV1.getActiveUser().getBasket().clear();
        updateBasketList();
        this.totalNetPricelabel.setText("$ 0.00");
        tempInventory=POS_SystemV1.getClonedAllInventory();
        this.menuItemComboBox.removeAllItems();
        for(MenuItem m:tempInventory){
            if(m.getQuantity()>0){
                this.menuItemComboBox.addItem(m.getName());
            }
        }
        this.menuItemComboBox.setSelectedItem(null);
        this.quantityComboBox.setSelectedItem(null);
        this.quantityComboBox.setEnabled(false);
        this.menuItemComboBox.setEnabled(true);
        this.addButton.setEnabled(true);
        this.removeButton.setEnabled(false);
        this.checkoutButton.setEnabled(false);
        this.couponTextField.setText("");
        this.couponTextField.setEnabled(false);
        this.applyCouponButton.setEnabled(false);
        
        //this.savedLabel.setText("");
        //this.activeCouponLabel.setText("");
        
        startListening=true;
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void menuItemComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuItemComboBoxItemStateChanged
        if(startListening){    
            this.quantityComboBox.removeAllItems();          
            for(MenuItem m:tempInventory){
                if(m.getName().equals(this.menuItemComboBox.getSelectedItem().toString())){
                    for (int i = 1; i <= m.getQuantity(); i++) {
                        this.quantityComboBox.addItem(""+i);
                    }
                    break;
                }
            }
            this.quantityComboBox.setEnabled(true);
        }
    }//GEN-LAST:event_menuItemComboBoxItemStateChanged

    private void updateBasketList(){
        basketModel.clear();
        double netPrice=0;
        for(MenuItem m:POS_SystemV1.getActiveUser().getBasket()){
            basketModel.addElement(m.toString());
            netPrice+=m.getPrice()*(double)m.getQuantity();
        }
        this.totalNetPricelabel.setText("$ "+new DecimalFormat("#0.00").format(netPrice));
        double netPayment=netPrice*(100.0-discount)/100.0;
        this.totalPaymentLabel.setText("$ "+new DecimalFormat("#0.00").format(netPayment));
        
        if(discount>0.0){
            this.savedLabel.setText("Your Saving : $ "+new DecimalFormat("#0.00").format(netPrice - netPayment));
        }else{
            this.savedLabel.setText("");
            this.activeCouponLabel.setText("");
        }
        
        
    }
    
    
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(this.menuItemComboBox.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "No Menu Item Is Selected", "Add Error",JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
        
        
        String menuItemName=this.menuItemComboBox.getSelectedItem().toString();
        int quantity=Integer.parseInt(this.quantityComboBox.getSelectedItem().toString());
        
        for(MenuItem m:tempInventory){
            if(m.getName().equals(menuItemName)){
                m.setQuantity(m.getQuantity()-quantity);
                MenuItem temp=m.clone();
                temp.setQuantity(quantity);
                POS_SystemV1.getActiveUser().add_to_basket(temp);
                break;
            }
        }
       
        updateBasketList();
        
        startListening=false;
        this.menuItemComboBox.removeAllItems();
        for(MenuItem m:tempInventory){
            if(m.getQuantity()>0){
                this.menuItemComboBox.addItem(m.getName());
            }
        }
        this.menuItemComboBox.setSelectedItem(null);
        this.quantityComboBox.setEnabled(false);
        this.quantityComboBox.setSelectedItem(null);
        this.removeButton.setEnabled(true);
        this.couponTextField.setEnabled(true);
        this.checkoutButton.setEnabled(true);
        this.applyCouponButton.setEnabled(true);
        startListening=true;
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int indexToRemove=this.basketList.getSelectedIndex();
        if(indexToRemove==-1){
            JOptionPane.showMessageDialog(this, "No Menu Item Is Selected From Basket", "Remove Error",JOptionPane.ERROR_MESSAGE); 
            return;
        }
        MenuItem temp1=POS_SystemV1.getActiveUser().getBasket().remove(indexToRemove);
        updateBasketList();
         
        for(MenuItem m:tempInventory){
            if(m.getName().equals(temp1.getName())){
                m.setQuantity(m.getQuantity()+temp1.getQuantity());
                break;
            }
        }
       
        updateBasketList();
        
        startListening=false;
        this.menuItemComboBox.removeAllItems();
        for(MenuItem m:tempInventory){
            if(m.getQuantity()>0){
                this.menuItemComboBox.addItem(m.getName());
            }
        }
        this.menuItemComboBox.setSelectedItem(null);
        this.quantityComboBox.setEnabled(false);
        this.quantityComboBox.setSelectedItem(null);
        startListening=true;
        
        if(POS_SystemV1.getActiveUser().getBasket().isEmpty()){
            this.removeButton.setEnabled(false);
            this.couponTextField.setText("");
            this.couponTextField.setEnabled(false);
            this.checkoutButton.setEnabled(false);
            this.applyCouponButton.setEnabled(false);
            this.savedLabel.setText("");
            this.activeCouponLabel.setText("");
            discount=0.0;
        }
        
        
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void applyCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCouponButtonActionPerformed
        String temp=this.couponTextField.getText();
        this.couponTextField.setText("");
        if(temp.equals("")){
            JOptionPane.showMessageDialog(this, "No Coupon Is Entered", "Apply Coupon Error",JOptionPane.ERROR_MESSAGE); 
            return;
        }
        try{
            couponNumber=Integer.parseInt(temp);
            if(couponNumber==0)throw new NoSuchFieldException();
            int[][] coupons=POS_SystemV1.getCoupons();
            for (int i = 0; i < coupons[0].length; i++) {
                if(couponNumber==coupons[0][i]){
                    discount=(double)coupons[1][i];
                    updateBasketList();
                    this.activeCouponLabel.setText("Active Coupon: "+couponNumber+" ("+coupons[1][i]+"% Off)");
                    JOptionPane.showMessageDialog(this, "Coupon Code:"+temp+" Is Applied Successfully", "Apply Coupon Completed",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            throw new NoSuchFieldException();
        }catch(NumberFormatException e){
            discount=0.0;
            updateBasketList();
            JOptionPane.showMessageDialog(this, "Coupon Code:"+temp+" Is An Invaid Coupon", "Apply Coupon Error",JOptionPane.ERROR_MESSAGE); 
        }catch(NoSuchFieldException e){
            discount=0.0;
            updateBasketList();
            JOptionPane.showMessageDialog(this, "Coupon Code:"+temp+" Doesn't Exist", "Apply Coupon Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_applyCouponButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        new PaymentGUI(this, true, totalNetPricelabel.getText(),totalPaymentLabel.getText(),couponNumber).setVisible(true);
        if(checkOutSuccessful==true){
            POS_SystemV1.updateAllInventory(tempInventory);
            int[][] coupons = POS_SystemV1.getCoupons();
            for (int i = 0; i < coupons[0].length; i++) {
                if(couponNumber==coupons[0][i]){
                    coupons[0][i]=0;
                    coupons[1][i]=0;
                    break;
                }    
            }
            this.dispose();
            
            new CustomerGUI().setVisible(true);
        }
        
    }//GEN-LAST:event_checkoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeCouponLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton applyCouponButton;
    private javax.swing.JLabel basketLabel;
    private javax.swing.JList<String> basketList;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JLabel couponLabel;
    private javax.swing.JTextField couponTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel loginLable;
    private javax.swing.JButton logoutButton;
    private javax.swing.JComboBox<String> menuItemComboBox;
    private javax.swing.JLabel menuItemLabel;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JComboBox<String> quantityComboBox;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel savedLabel;
    private javax.swing.JLabel totalNetPricelabel;
    private javax.swing.JLabel totalPaymentLabel;
    // End of variables declaration//GEN-END:variables
}
