/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.ArrayList;

/**
 * Overview: Represents the Customers of the POS_SystemV1.0
 * Inherited from User.
 * Manager is mutable.
 * 
 * The Abstraction Function:
 * AF(C) = The Customer, where;
 *          C.username = User Name of the Customer
 *          C.password = Password of the Customer
 *          C.memberShipcount_id= Total Number of customers
 *          C.membership_id=Membership ID of the customer
 *          C.transaction_list= All the transactions done by the customer
 *          C.basket= basket for each transaction occurring.
 * 
 * The Rep Invariant:   
 *         ! [ UserClass.repOK() AND (C.membership_id less than or equals 0) AND (C.transaction_list == null) AND
 *              (C.transaction_list.isEmpty()) ]
 * 
 * @author deshan
 * @author pasindu
 * @author charles
 */
class Customer extends User{
    private static int membershipcount_id;
    private int membership_id;
    private ArrayList<Transaction> transaction_list;
    private ArrayList<MenuItem> basket;
    
    /**
     * Constructor: Assigns Username, Password, and Membership ID
     * EFFECTS: Create a Customer Object
     * @param username  Customer's Username.
     * @param password  Customer's Password.
     */
    public Customer(String username, String password){
        //Setting Customer's Username and Password
        super(username, password);
        //Assigning a Membership ID
        this.membership_id = ++membershipcount_id;
        
        this.transaction_list=new ArrayList<Transaction>();
        this.basket=new ArrayList<MenuItem>();
        
    }
    
    /**
     * Adds menu item to basket
     * @param item  Menu item to be added to basket. 
     */
    public void add_to_basket(MenuItem item){
        basket.add(item);
    }
    
    /**
     * Removes item from basket
     * @param item  Menu item to be removed from basket. 
     */
    public void remove_from_basket(MenuItem item){
        basket.remove(item);
    }
    
    public static int getMembershipcount_id() {
        return membershipcount_id;
    }



    public ArrayList<Transaction> getTransaction_list() {
        return transaction_list;
    }

    public ArrayList<MenuItem> getBasket() {
        return basket;
    }
    
    
    /**
     * Returns Customer's Membership ID
     * @return membership_id
     */
    public int getMembershipId(){
        return membership_id;
    }
    
    /**
     * Returns Customer's all transactions
     * @return transaction_list
     */
    public ArrayList<Transaction> getTransactions(){
        return transaction_list;
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOk(){
        if(super.getUserName()==null) return false;
        if(super.getPassword()==null) return false;
        if(membership_id<=0) return false;
        if(transaction_list == null) return false;
        if(transaction_list.isEmpty()) return false;
        return true;
    }
    
    /**
     * EFFECTS: Returns a string that contains All the Information of the Customer.
     * Overrides toString() method of Object Class. Returns Customer's Username,
     * Membership ID, and all Transactions
     * @return username, membership_id, transaction_list 
     */
    @Override
    public String toString(){
        String temp="";
        for(Transaction t:transaction_list){
            temp+="\n"+t.toString();
        }
        if(transaction_list.isEmpty()){
            temp=": [No Transactions Yet]";
        }
        return "User Name: "+getUserName()+"\tMembership ID: " + getMembershipId() + "\n<Transactions>"+temp;
    }
    
    
    
    
    
    
}
