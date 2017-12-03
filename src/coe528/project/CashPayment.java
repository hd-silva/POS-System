/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.text.DecimalFormat;

/**
 * Overview: Represents a Cash Payment made in in Transaction.
 * Inherited from Payment Class.
 * CashPayments are immutable.
 * 
 * The Abstraction Function:
 * AF(C) = A Cash Payment made in in Transaction, T, where;
 *          C.balance = Balance of the payment given to customer
 *          C.handingTotal= Total amount customer handing at the checkout.
 * 
 * The Rep Invariant:   
 *           PaymentClass.repOk() AND !(C.handingTotal less than or equal 0 || C.balance less than 0) 
 *             
 * @author deshan
 * @author pasindu
 * @author charles
 */
public class CashPayment extends Payment {
    private final double balance;
    private final double handingTotal;
    
    /**
     * EFFECTS: Creates a CashPayment Object
     * @param paymentTotal Total Payment
     * @param handingTotal Handing Total 
     * @param couponNumber Coupon Number
     */
    CashPayment(double paymentTotal,double handingTotal,int couponNumber) {
        super(paymentTotal,couponNumber);
        
        this.handingTotal=handingTotal;
        this.balance=handingTotal-super.getPaymentTotal();
    }

    /**
     * Returns the balance.
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the handing total
     * @return Handing total
     */
    public double getHandingTotal() {
        return handingTotal;
    }

    /**
     * EFFECTS: Returns a string that contains All the Information of the Payment.
     * @return Payment Summery
     */
    @Override
    public String toString() {
        return super.toString()+"\tPayment Method: Cash"+"\tHanded Total: "+new DecimalFormat("#.00").format(handingTotal)+"\tBalance: "+new DecimalFormat("#.00").format(balance);
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOk(){
        return super.repOk() && !(handingTotal<=0 || balance<0);
    }
    
    
}
