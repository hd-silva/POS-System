/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.text.DecimalFormat;

/**
 * Overview: Abstract Class to CashPayment and CreditPayment to represent a Payment made in in Transaction.
 * Payments are immutable.
 * 
 * The Abstraction Function:
 * AF(C) = A CashPayment or A CreditPayment made in in Transaction, T, where;
 *          C.paymentTotal = Total Payment of the transaction
 *          C.couponNumber = Coupon Number of the transaction. Assume Coupon Number=0 for Transaction with No Coupon
 * 
 * The Rep Invariant:   
 *          !(C.couponNumber less than  0 || C.paymentTotal less than or equals 0)
 *             
 * @author deshan
 * @author pasindu
 * @author charles
 */
public abstract class Payment {
    private final double paymentTotal;
    private final int couponNumber;

    /**
     * Create either CashPayment or CreditPayment Object
     * @param totalNetPrice Total Payment
     * @param couponNumber Coupon Number
     */
    public Payment(double totalNetPrice, int couponNumber) {
        this.paymentTotal=applyDiscount(totalNetPrice, couponNumber);
        this.couponNumber=couponNumber;
    }
    
    /**
     * 
     * @param totalNetPrice
     * @param couponNumber
     * @return 
     */
    private double applyDiscount(double totalNetPrice, int couponNumber) {
        int[][] coupons=POS_SystemV1.getCoupons();
        for (int i = 0; i < coupons[0].length; i++) {
            if(couponNumber==coupons[0][i]){
                return totalNetPrice*(100.0-(double)coupons[1][i])/100.0;
            }
        }
        return totalNetPrice;
    }

    /**
     *
     * @return Payment Total
     */
    public double getPaymentTotal() {
        return paymentTotal;
    }

    /**
     *
     * @return Coupon Number
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * EFFECTS: Returns a string that contains All the Information of the Payment.
     * @return Payment Summery
     */
    @Override
    public String toString() {
        String temp="";
        if(couponNumber!=0) temp="Coupon Number: "+couponNumber+"\t";
        return temp+"Payment Total: "+new DecimalFormat("#.00").format(paymentTotal);
    }
    

    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOk(){
        return !(couponNumber<0 || paymentTotal<=0);
    }
    
    
    
}
