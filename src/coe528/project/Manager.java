/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;


import java.util.*;
        
/**
 * Overview: Represents the Manager of the POS_SystemV1.0
 * Inherited from User.
 * Manager is immutable.
 * 
 * The Abstraction Function:
 * AF(C) = The Manager, where;
 *          C.username = User Name of the manager
 *          C.password = Password of the manager
 * 
 * The Rep Invariant:   
 *          C.username==admin AND C.password==admin
 *   
 * @author deshan
 * @author pasindu
 * @author charles
 */
public class Manager extends User{
    
    /**
     * EFFECTS: Create a Manager Object
     * @param username User Name of the manager
     * @param password Password of the manager
     */
    public Manager(String username, String password)
    {
        super(username,password);
    }
    
    /**       
     * EFFECTS: Returns List of All Menu Items of the inventory in the allInventory ArrayList in main class as a string array. Return null if there is no menu items.
     * @return List of All the Menu Items in the inventory
     */
    public String[] viewInventory()
    {
        if(POS_SystemV1.getAllInventory().isEmpty()){
            return null;
        }
        String[] temp=new String[POS_SystemV1.getAllInventory().size()];
        int i=0;
        for(MenuItem m:POS_SystemV1.getAllInventory())
        {
            temp[i++]=m.toString();
        }
        return temp;
    }
    
    /**
     * REQUIRES: MenuItem name has to be in the allInventory and new price has to be valid.
     * MODIFIES: Price of the Corresponding Menu Item in the allInventory ArrayList of MenuItems in POS_SystemV1 main Class.         
     * EFFECTS: Modify the price of Menu Item  
     * @param name Name of the Menu Item to Be Modified
     * @param newPrice New Price of the Menu Item
     * @throws IllegalArgumentException Invalid Name or Price
     * @throws NoSuchElementException No Such Menu Item
     */
    public void Modify_Pricing(String name, double newPrice) throws IllegalArgumentException, NoSuchElementException{
        if (newPrice<=0.0) throw new IllegalArgumentException("Invaild Price");
        MenuItem m=getMenuItemFromInventory(name);
        m.setPrice(newPrice);
    }
    
    /**
     * REQUIRES: MenuItem name has to be in the allInventory and new quantity has to be valid.
     * MODIFIES: Quantity of the Corresponding Menu Item in the allInventory ArrayList of MenuItems in POS_SystemV1 main Class.         
     * EFFECTS: Modify the quantity of Menu Item  
     * @param name Name of the Menu Item to be modified
     * @param quantity New Quantity of The Menu Item
     * @throws IllegalArgumentException Invalid Name or Quantity
     * @throws NoSuchElementException No Such Menu Item
     */
    public void Modify_Quantity(String name, int quantity) throws IllegalArgumentException, NoSuchElementException{
        if (quantity<0) throw new IllegalArgumentException("Invaild Quantity");
        MenuItem m=getMenuItemFromInventory(name);
        m.setQuantity(quantity);    
    }
    
    /**
     * REQUIRES: MenuItem name has not to be in the allInventory and price and quantity has to be valid.
     * MODIFIES: allInventory ArrayList of Menu Items in POS_SystemV1 main Class.         
     * EFFECTS: Add New Menu Item
     * @param name Name of the New Menu Item
     * @param price Price of the New Menu Item
     * @param quantity Quantity of the New Menu Item
     * @throws IllegalArgumentException Menu Item Already Exists
     */
    public void Add_New_Inventory(String name,double price, int quantity) throws IllegalArgumentException{
        try{
            getMenuItemFromInventory(name);
            throw new IllegalArgumentException("Menu Item Already Exists");
        }catch(NoSuchElementException e){
            POS_SystemV1.getAllInventory().add(new MenuItem(name, price, quantity));
        }
            
    }
    
    /**
     * REQUIRES: MenuItem name has to be in the allInventory
     * MODIFIES: allInventory ArrayList of Menu Items in POS_SystemV1 main Class.         
     * EFFECTS: Remove the Menu Item
     * @param name Name of the Menu Item to be removed
     * @throws IllegalArgumentException No Such Menu Item
     */
    public void RemoveInventory(String name) throws IllegalArgumentException{
        try{
            MenuItem m=getMenuItemFromInventory(name);
            POS_SystemV1.getAllInventory().remove(m);
        }catch(NoSuchElementException e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    /**       
     * EFFECTS: Returns List of All Transactions in the allTransaction ArrayList in main class as a string array. Return null if there is no transactions.
     * @return List of All the Transactions
     */
    public String[] ViewTransactions(){
        if(POS_SystemV1.getAllTractions().isEmpty()){
            return null;
        }
        String[] temp=new String[POS_SystemV1.getAllTractions().size()];
        int i=0;
        for(Transaction t:POS_SystemV1.getAllTractions()){
            temp[i++]=t.toString();
        }
        return temp;
    }
    
    /**       
     * EFFECTS: Returns List of All Customers in the allCustomers ArrayList in main class as a string array. Return null if there is no customers.
     * @return List of All the Transactions
     */
    public String[] ViewCustomers(){
        if(POS_SystemV1.getAllCustomers().isEmpty()){
            return null;
        }
        String[] temp=new String[POS_SystemV1.getAllCustomers().size()];
        int i=0;
        for(User u:POS_SystemV1.getAllCustomers()){
            temp[i++]=u.toString();
        }
        return temp;
    }
    
    /**       
     * EFFECTS: Returns List of All Coupons in the coupons Array[][] in main class as a string array. Return null if there is no coupons.
     * @return List of All the Coupons
     */
    public String[] ViewCoupons(){
        int[][] coupons=POS_SystemV1.getCoupons();
        String[] temp=new String[100];
        for (int i = 0,j=0; i < 100; i++) {
            if(coupons[0][i]!=0){
                temp[j++]="Coupon Number: "+coupons[0][i]+"\t Discount: "+coupons[1][i]+"%";
            }
        }
        return temp;
    }
    
    /**
     * REQUIRES: Coupon Number has not to be in the coupons array and new discount value has to be valid.
     * MODIFIES: coupons Array[][] in POS_SystemV1 main Class.         
     * EFFECTS: Add New Coupon Number with its discount percentage
     * @param coupon_number New Coupon Number
     * @param discountvalue New Discount Percentage
     * @throws IllegalArgumentException Invalid Coupon Code, Discount or Coupon Code Already Exists
     */
    public void addCoupon(int coupon_number, int discountvalue) throws IllegalArgumentException{
        if(coupon_number<=0) throw new IllegalArgumentException("Invalid Coupon Code");
        if(discountvalue<=0 || discountvalue>=100) throw new IllegalArgumentException("Invalid Discount Value");
        int[][] coupons = POS_SystemV1.getCoupons();
        for (int i = 0; i < coupons[0].length; i++) {
            if(coupon_number==coupons[0][i]){
                throw new IllegalArgumentException("Coupon Code Already Exists");
            }
            if(coupons[0][i]==0){
                coupons[0][i]=coupon_number;
                coupons[1][i]=discountvalue;
                return;
            }
        }
       
    }
    
    
    /**
     * REQUIRES: Coupon number has to be in the coupons[][]
     * MODIFIES: coupons[][] in POS_SystemV1 main Class.         
     * EFFECTS: Remove Coupon Number and its discount value
     * @param coupon_number Coupon Number to be removed.
     * @throws IllegalArgumentException Invalid Coupon Code or Coupon Code Doesn't Exist
     */
    public void removeCoupon(int coupon_number) throws IllegalArgumentException{
        if(coupon_number<=0) throw new IllegalArgumentException("Invalid Coupon Code");
        int[][] coupons = POS_SystemV1.getCoupons();
        for (int i = 0; i < coupons[0].length; i++) {
            if(coupon_number==coupons[0][i]){
                coupons[0][i]=0;
                coupons[1][i]=0;
                return;
            }    
        }
        throw new IllegalArgumentException("Coupon Code Doesn't Exist");
    }
    
      
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOK(){
        if(this.getUserName().equals("admin")== false)
            return false;
        
        if(this.getPassword().equals("admin")== false) 
           return false;
    
        return true;
    }

    /**
     * EFFECTS: Returns a string that contains All the Username of the Manager.
     * @return Manager Username
     */
    @Override
    public String toString() {
        return "Manager User Name"+this.getUserName();
    }
    
    
    /**
     * REQUIRES: MenuItem name has to be in the allInventory        
     * EFFECTS: Return Menu Item if it's in the inventory, otherwise throw NoSuchElementException
     * @param name Name of the Menu Item
     * @return Menu Item
     * @throws NoSuchElementException 
     */
    private MenuItem getMenuItemFromInventory (String name) throws NoSuchElementException{
        for(MenuItem m:POS_SystemV1.getAllInventory()){
            if(m.getName().equals(name)){
                return m;
            }
        }
        throw new NoSuchElementException("Menu Item Doesn't Exist");
    }
      
     
}
