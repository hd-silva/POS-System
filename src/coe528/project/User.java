/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.ArrayList;

/**
 * Overview: Abstract Class to Customer and Manager to represents the Users of the POS_SystemV1.0
 * Users are mutable.
 * 
 * The Abstraction Function:
 * AF(C) = The User, where;
 *          C.username = User Name of the User
 *          C.password = Password of the User
 * 
 * The Rep Invariant:   
 *          C.username!=null AND C.password!=null
 *   
 * @author deshan
 * @author pasindu
 * @author charles
 */
public abstract class User {
    private String username;
    private String password;
    
    /**
     * Constructor: assigns User's username and password
     * EFFECTS: Create either Customer Object Or Manager Object
     * @param username Username
     * @param password Password
     */
    public User(String username, String password){
        this.username=username;
        this.password=password;
    }
    
    /**
     * Returns User's username
     * @return username
     */
    public String getUserName(){
        return username;
    }
    
    /**
     * Returns User's Password
     * @return password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * Sets User's username
     * @param username Username
     */
    public void setUsername(String username){
        this.username=username;
    }
    
    /**
     * Sets User's password
     * @param password Password
     */
    public void setPassword(String password){
        this.password=password;
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOk(){
        if(username==null) return false;
        if(password==null) return false;
        return true;
    }
    
    
    
    
    
    
    //*** ALL THE METHOD FROM CUSTOMER CLASS WITH OUT BODY IMPLEMENTATION TO ACHIVE POLYMORPHIC BEHAVIOUR ***
    public void add_to_basket(MenuItem item){}
    public void remove_from_basket(MenuItem item){}
    public ArrayList<Transaction> getTransaction_list() {return null;}
    public ArrayList<MenuItem> getBasket() {return null;}
    
    //*** ALL THE METHOD FROM MANAGER CLASS WITH OUT BODY IMPLEMENTATION TO ACHIVE POLYMORPHIC BEHAVIOUR ***
    public String[] viewInventory(){return null;}
    public void Modify_Pricing(String name, double newPrice){}
    public void Modify_Quantity(String name, int quantity){}
    public void Add_New_Inventory(String name,double price, int quantity){}
    public void RemoveInventory(String name){}
    public String[] ViewTransactions(){return null;}
    public String[] ViewCustomers(){return null;}
    public String[] ViewCoupons(){return null;}
    public void addCoupon(int coupon_number, int discountvalue){}
    public void removeCoupon(int coupon_number){}
    
    
}
