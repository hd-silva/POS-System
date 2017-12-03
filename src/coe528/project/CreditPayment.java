/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 * Overview: Represents a Credit Payment made in in Transaction.
 * Inherited from Payment Class.
 * CreditPayments are immutable.
 * 
 * The Abstraction Function:
 * AF(C) = A Credit Payment made in in Transaction, T, where;
 *          C.creditCardNumber = Credit card of the customer.
 * 
 * The Rep Invariant:   
 *          PaymentClass.repOk() AND !(C.creditCardNumber==null)
 *             
 * @author deshan
 * @author pasindu
 * @author charles
 */
public class CreditPayment extends Payment {
    private final String creditCardNumber;

    /**
     * EFFECTS: Create a CreditPayment Object
     * @param paymentTotal
     * @param creditCardNumber
     * @param couponNumber 
     */
    CreditPayment(double paymentTotal,String creditCardNumber,int couponNumber) {
        super(paymentTotal,couponNumber);
        this.creditCardNumber=creditCardNumber;
    }

    /**
     *
     * @return Credit Card Number
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * EFFECTS: Returns a string that contains All the Information of the Payment.
     * @return Payment Summery
     */
    @Override
    public String toString() {
        return super.toString()+"\tPayment Method: Credit"+"\tCredit Card#: "+creditCardNumber;
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOk(){
        return super.repOk() && !(creditCardNumber==null);
    }
    
    
}
