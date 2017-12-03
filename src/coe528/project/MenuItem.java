/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.text.DecimalFormat;

/**
 *
 * @author deshan
 * @author pasindu
 * @author charles
 */
class MenuItem implements Cloneable{
    private String name;
    private double price;
    private int quantity;

    /**
     * EFFECTS: Create a Menu Item Object
     * @param name Name of the Menu Item
     * @param price Price of the Menu Item
     * @param quantity Quantity of the Menu Item
     */
    public MenuItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * 
     * @param name Name of Menu Item
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @param price Price of the Menu Item
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * 
     * @param quantity Quantity of the menu Item
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * 
     * @return Price of the Menu Item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Quantity of the Menu Item
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 
     * @return Name of the Menu Item
     */
    public String getName() {
        return name;
    }

    /**
     * EFFECTS: Returns a string that contains All the Information of the Menu Item.
     * @return MenuItem Summery
     */
    @Override
    public String toString() {
        return name+"($"+new DecimalFormat("#0.00").format(price)+")\tQuantity:"+quantity+"\tTotal:$"+new DecimalFormat("#0.00").format(price*(double)quantity);
    }
    
    @Override
    public MenuItem clone() {
        try{
            return (MenuItem)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }
    
    /**
     * EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
     * @return Rep invariant
     */
    public boolean repOK(){
        if(name==null) return false;
        if(price<=0.0) return false;
        if(quantity<0) return false;
        
        return true;
    }
    
    
}
