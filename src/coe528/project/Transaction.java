/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Overview: Represents Transaction done by customers
 * Transactions are immutable. (Note: setTransactionCounter method was implemented only for JUnit testing purposes)
 * 
 * The Abstraction Function:
 * AF(C) = Transaction T, where;
 *          C.transactionCounter=count of the total number of transactions happened
 *          C.transactionId = Transaction ID
 *          C.customer = Customer of the Transaction
 *          C.menuItemsBought= Menu Items bought in the transaction
 *          C.totalNetPrice= Total net price of the menu items bought
 *          C.payment = Payment made to complete the transaction
 * 
 * The Rep Invariant:   
 *         ![ (C.transactionCounter less than or equals 0) AND (C.transactionId less than or equals 0) AND (C.customer==null) AND
 *           (C.menuItemsBought==null) AND (C.menuItemsBought.isEmpty()) AND (C.totalNetPrice less than or equals 0.0) AND (C.payment==null) ]
 *           
 *             
 * @author deshan
 * @author pasindu
 * @author charles
 */
public class Transaction {
    private static int transactionCounter=0;
    
    private final int transactionId;
    private final Customer customer;
    private final ArrayList<MenuItem> menuItemsBought;
    private final double totalNetPrice;
    private Payment payment;

    /**
     * EFFECTS: Create a Transaction Object
     * @param customer Customer of the transaction
     * @param menuItemsBought Menu Items Bought
     */
    private Transaction(Customer customer, ArrayList<MenuItem> menuItemsBought) {
        //Setting TransactionId
        this.transactionId=++transactionCounter;
        //Setting Customer
        this.customer = customer;
        //Setting the selected menuitems
        this.menuItemsBought=menuItemsBought;
        
        //Calculating Total Price without discount
        double temp=0;
        if(menuItemsBought!=null){
            for (MenuItem m:this.menuItemsBought) {
                temp+=m.getPrice()*(double)m.getQuantity();
            }
        }
        this.totalNetPrice=temp;
    }
    
    /**
     * Create a Transaction Object
     * @param customer Customer of the Transaction
     * @param menuItemsBought Menu Items Bought
     * @param creditCardNumber Credit Card Number
     * @param couponNumber Coupon Number
     */
    public Transaction(Customer customer, ArrayList<MenuItem> menuItemsBought, String creditCardNumber, int couponNumber) {
        this(customer,menuItemsBought);
        
        //Setting the payment
        this.payment=new CreditPayment(this.totalNetPrice,creditCardNumber,couponNumber);
        
    }
    
    /**
     * Create a Transaction Object
     * @param customer Customer of the Transaction
     * @param menuItemsBought Menu Items Bought
     * @param handingTotal handing total of the customer
     * @param couponNumber Coupon number
     */
    public Transaction(Customer customer, ArrayList<MenuItem> menuItemsBought, double handingTotal,int couponNumber) {
        this(customer,menuItemsBought);
        
        //Setting the payment
        this.payment=new CashPayment(this.totalNetPrice,handingTotal,couponNumber);
        
    }

    /**
     * 
     * @return transactionCounter
     */
    public static int getTransactionCounter() {
        return transactionCounter;
    }

    /**
     * 
     * @return transactionId
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }


    public static void setTransactionCounter(int transactionCounter) {
        Transaction.transactionCounter = transactionCounter;
    }

    /**
     * 
     * @return menuItemsBought
     */
    public ArrayList<MenuItem> getMenuItemsBought() {
        return menuItemsBought;
    }

    /**
     * 
     * @return totalNetPrice
     */
    public double getTotalNetPrice() {
        return totalNetPrice;
    }

    /**
     * 
     * @return payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * EFFECTS: Returns a string that contains All the Information of the transaction.
     * @return Transaction Summery
     */
    @Override
    public String toString() {
        
        String listMenuItemsBought="{ ";
        for (MenuItem m:this.menuItemsBought) {
            listMenuItemsBought+=m.getName();
            listMenuItemsBought+=" (Qty:"+m.getQuantity()+") , "; 
        }
        listMenuItemsBought=listMenuItemsBought.substring(0, listMenuItemsBought.length()-2)+"}";
        
        return "Transaction ID: "+transactionId+"\tCustomer Username: "+customer.getUserName()+"\tItems Bought: "+listMenuItemsBought+
                "\tTotal Net Price: "+new DecimalFormat("#.00").format(totalNetPrice)+"\t"+payment.toString();  
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOK(){
        if(transactionCounter<=0) return false;
        if(transactionId<=0) return false;
        if(customer==null) return false;
        if(menuItemsBought==null) return false;
        if(menuItemsBought.isEmpty()) return false;
        if(totalNetPrice<=0.0) return false;        
        if(payment==null) return false;
                
        return true;
    }
  

  
    

    
    
}
