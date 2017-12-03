/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;


import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import static junit.framework.Assert.*;

/**
 *
 * @author deshan
 * @author pasindu
 * @author charles 
 */
public class TransactionTest {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/**
 *
 * @author Charles
 */
    
    Transaction test_transaction;
    Customer testcus;
    ArrayList<MenuItem> testlist;
    @Before
    public void testsetup()
    {
        testcus = new Customer("user", "pass");
        MenuItem testitem = new MenuItem("apple",2.49,1);
        testlist = new ArrayList<>();
        testlist.add(testitem);
        test_transaction = new Transaction(testcus,testlist, 5, 0);
    }
    
    @After
    public void teardown()
    {
        test_transaction = null;
    }
    
     @Test
    public void testConstructorCreditCard() {
        System.out.println("testConstructorCreditCard");
        Customer testCustomer = new Customer("Jane", "2");
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Oranges", 5.0, 10));
        Transaction instance = new Transaction(testCustomer, menu, "568", 1);
        assertTrue(instance.repOK());
        assertEquals(testCustomer, instance.getCustomer());
        assertEquals(menu, instance.getMenuItemsBought());
        assertEquals(50.0, instance.getTotalNetPrice(), 0.01);
    }
    
    @Test
    public void testConstructorCash() {
        System.out.println("testConstructorCash");
        Customer testCustomer = new Customer("Dean", "3");
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Bananas", 7.0, 3));
        Transaction instance = new Transaction(testCustomer, menu, 40.0, 1);
        assertTrue(instance.repOK());
        assertEquals(testCustomer, instance.getCustomer());
        assertEquals(menu, instance.getMenuItemsBought());
        assertEquals(21.0, instance.getTotalNetPrice(), 0.01);
    }

    /**
     * Test of getTransactionCounter method, of class Transaction.
     */
    @Test
    public void testGetTransactionCounter() {
        System.out.println("getTransactionCounter");
        int expResult = Transaction.getTransactionCounter()+1;
        Customer testCustomer = new Customer("Dean", "3");
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Bananas", 7.0, 3));
        Transaction instance = new Transaction(testCustomer, menu, 40.0, 1);
        int result = Transaction.getTransactionCounter();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTransactionId method, of class Transaction.
     */
    @Test
    public void testGetTransactionId() {
        System.out.println("getTransactionId");
        int expResult = Transaction.getTransactionCounter()+1;
        Customer testCustomer = new Customer("John", "1");
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Apples", 10.0, 5));
        Transaction instance = new Transaction(testCustomer, menu, "123", 1);
        int result = instance.getTransactionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Transaction.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Customer testCustomer = new Customer("John", "1");
        ArrayList<MenuItem> menu = new ArrayList();
        menu.add(new MenuItem("Apples", 10.0, 5));
        Transaction instance = new Transaction(testCustomer, menu, "123", 1);
        Customer expResult = testCustomer;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
    }
    

    @Test
    public void testGetMenuItemsBought() {
        System.out.println("getMenuItemsBought");
        Transaction instance = test_transaction;
        MenuItem apple = new MenuItem("apple",2.49,1);
        ArrayList<MenuItem> basket = new ArrayList<>();
        basket.add(apple); 
        assertTrue(instance.getMenuItemsBought().get(0).toString().equals(basket.get(0).toString()));
    }
    
    
    @Test
    public void testgetTotalNetPrice() 
    {
        System.out.println("getTotalNetPrice");
        double expresult = 2.49;
        assertEquals(expresult,test_transaction.getTotalNetPrice());
    }



    /**
     * Test of getPayment method, of class Transaction.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Transaction instance = test_transaction;
        Payment expResult = new CashPayment(2.49,5,0);
        Payment result = instance.getPayment();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Transaction instance = test_transaction;
        String result = instance.toString();
        String expResult="Transaction ID: "+Transaction.getTransactionCounter()+"\tCustomer Username: user\tItems Bought: { apple (Qty:1) }"+
                "\tTotal Net Price: 2.49\tPayment Total: 2.49\tPayment Method: Cash"+"\tHanded Total: 5.00\tBalance: 2.51";
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void test_repOK()
    {
        assertEquals(true, test_transaction.repOK());
    }
    
    @Test
    public void test_repOK_customer()
    {
        Customer testcus2 = new Customer("user","pass");
        testcus2 = null;
        MenuItem testitem2 = new MenuItem("apple",2.49,1);
        ArrayList<MenuItem> testlist2 = new ArrayList<>();
        testlist2.add(testitem2);
        Transaction test_transaction2 = new Transaction(testcus2,testlist2, 5, 1);
        assertEquals(false,test_transaction2.repOK());
    }
    
    
    
    @Test
    public void test_repOK_menuItemsNull()
    {
        Customer testcus3 = new Customer("user", "pass");
        MenuItem testitem3 = new MenuItem("apple",2.49,1);
        ArrayList<MenuItem> testlist3 = new ArrayList<>();
        testlist3.add(testitem3);
        testlist3 = null;
        Transaction test_transaction3 = new Transaction(testcus3,testlist3, 5, 1);
        
        assertEquals(false,test_transaction3.repOK());
    }
    
    @Test
    public void test_repOK_menuEmpty()
    {
        Customer testcus4 = new Customer("user", "pass");
        MenuItem testitem4 = new MenuItem("apple",2.49,1);
        ArrayList<MenuItem> testlist4 = new ArrayList<>();
        testlist4.add(testitem4);
        testlist4.clear();
        Transaction test_transaction4 = new Transaction(testcus4,testlist4, 5, 1);
        assertEquals(false,test_transaction4.repOK());
    }
    
    @Test
    public void test_repOK_NetPrice()
    {
        Customer testcus5 = new Customer("user", "pass");
        MenuItem testitem5 = new MenuItem("apple",0.0,1);
        ArrayList<MenuItem> testlist5 = new ArrayList<>();
        testlist5.add(testitem5);
        Transaction test_transaction5 = new Transaction(testcus5,testlist5, 5, 1);
        assertEquals(false,test_transaction5.repOK());
    }
}
