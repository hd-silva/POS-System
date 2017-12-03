/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.ArrayList;

/**
 * MAIN CLASS for POS_SystemV1.0
 * POS_SystemV1 is mutable. 
 * 
 * The Abstraction Function:
 * AF(C) = A POS System  where;
 *          C.allCustomers = all the registered customers
 *          C.allInventory = all the menu items available
 *          C.allTractions = all transactions occurred
 *          C.manager= Manager of the system
 *          C.activeUser= active user for the system at a given moment
 *          C.coupons = all the coupons available
 * 
 * @author deshan
 * @author pasindu
 * @author charles
 */
public class POS_SystemV1 {
    private final static ArrayList<User> allCustomers=new ArrayList<User>();
    private final static ArrayList<MenuItem> allInventory=new ArrayList<MenuItem>();
    private final static ArrayList<Transaction> allTractions=new ArrayList<Transaction>();
    private final static User manager=new Manager("admin", "admin");
    private static User activeUser;
    private final static int[][] coupons=new int[2][100];

    /**
     * Creates a POS System with 3 Customers 4 Menu Items and 2 Coupon codes.
     */
    public POS_SystemV1() {
        allCustomers.add(new Customer("pasindu", "1"));
        allCustomers.add(new Customer("deshan", "2"));
        allCustomers.add(new Customer("charles", "3"));
        
        
        allInventory.add(new MenuItem("Apple",20.4,10));
        allInventory.add(new MenuItem("Orange",10.0,1));
        allInventory.add(new MenuItem("Banana",12.50,5));
        allInventory.add(new MenuItem("Cherry",30.2,3));
        
        coupons[0][0]=1;coupons[1][0]=50;
        coupons[0][1]=2;coupons[1][1]=25;
    }

    public static ArrayList<User> getAllCustomers() {
        return allCustomers;
    }

    public static ArrayList<MenuItem> getAllInventory() {
        return allInventory;
    }

    /**
     * EFFECTS: Return a copy of all inventory.
     * @return A copy of the inventory
     */
    public static ArrayList<MenuItem> getClonedAllInventory() {
        ArrayList<MenuItem> temp=new ArrayList<MenuItem>();
        for(MenuItem m:allInventory){
            temp.add(m.clone());
        }
        return temp;
    }
    
    public static ArrayList<Transaction> getAllTractions() {
        return allTractions;
    }

    public static User getManager() {
        return manager;
    }

    public static User getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(User activeUser) {
        POS_SystemV1.activeUser = activeUser;
    }
    
    public static int[][] getCoupons() {
        return coupons;
    }
    
    /**
     * Updates the original inventory.
     * @param tempInventory Temp Inventory used to proceed the transaction.
     */
    public static void updateAllInventory(ArrayList<MenuItem> tempInventory){
        for(MenuItem n:tempInventory){
            for(MenuItem o:allInventory){
                if(o.getName().equals(n.getName())){
                    o.setQuantity(n.getQuantity());
                    break;
                }
                
            }
        }
    }
    
    /**
     * Creates the New Login
     */
    public static void NewLogin(){
        new Login(null, true).setVisible(true);
        if(activeUser==null) System.exit(0);

        if(activeUser instanceof Manager){
            new ManagerGUI().setVisible(true);
        }
        if(activeUser instanceof Customer){
            new CustomerGUI().setVisible(true);
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(POS_SystemV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS_SystemV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS_SystemV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS_SystemV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        POS_SystemV1 POS_System=new POS_SystemV1();
        POS_System.NewLogin();

        


    }
}
