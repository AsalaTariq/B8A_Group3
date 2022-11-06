
package b8a_group3;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maha
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addOrder method, of class Customer.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        String[] typeAndFlavor = null;
        Customer instance = new Customer();
        instance.addOrder(typeAndFlavor);
       
    }

    /**
     * Test of allOrders method, of class Customer.
     */
    @Test
    public void testAllOrders() {
        System.out.println("allOrders");
        Customer instance = new Customer();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.allOrders();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Payment method, of class Customer.
     */
    @Test
    public void testPayment() {
        System.out.println("Payment");
        Customer instance = new Customer();
        instance.Payment();
        
    }

    /**
     * Test of Credit_Card method, of class Customer.
     */
    @Test
    public void testCredit_Card() {
        System.out.println("Credit_Card");
        Scanner input = null;
        Customer instance = new Customer();
        instance.Credit_Card(input);
        assertNotNull(input);
     
    }

    /**
     * Test of Cash method, of class Customer.
     */
    @Test
   public void testCash() {
        System.out.println("Cash");
        Scanner input = null;
        int total = 0;
        Customer instance = new Customer();
        instance.Cash(input, total);
      
    }


    /**
     * Test of getNeighborhoodName method, of class Customer.
     */
    @Test
    public void testGetNeighborhoodName() {
        System.out.println("getNeighborhoodName");
        Customer instance = new Customer("عابر","القارات","2005684001","831","North Obhur");
        String expResult = "North Obhur";
        String result = instance.getNeighborhoodName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCardNumber method, of class Customer.
     */
    @Test
    public void testGetCardNumber() {
        System.out.println("getCardNumber");
        Customer instance = new Customer("عابر","القارات","2005684001","831","North Obhur");
        String expResult = "2005684001";
        String result = instance.getCardNumber();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCCV method, of class Customer.
     */
    @Test
    public void testGetCCV() {
        System.out.println("getCCV");
        Customer instance = new Customer("عابر","القارات","2005684001","831","North Obhur");
        String expResult = "831";
        String result = instance.getCCV();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getStreetName method, of class Customer.
     */
    @Test
    public void testGetStreetName() {
        System.out.println("getStreetName");
        Customer instance = new Customer("عابر","القارات","2005684001","831","North Obhur");
        String expResult = "عابر";
        String result = instance.getStreetName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getLastStreetName method, of class Customer.
     */
    @Test
    public void testGetLastStreetName() {
        System.out.println("getLastStreetName");
        Customer instance = new Customer("عابر","القارات","2005684001","831","North Obhur");
        String expResult = "القارات";
        String result = instance.getLastStreetName();
        assertEquals(expResult, result);
      
    }
    
}
