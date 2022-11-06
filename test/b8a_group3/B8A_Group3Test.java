
package b8a_group3;

import java.io.PrintWriter;
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
public class B8A_Group3Test {
    
    public B8A_Group3Test() {
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
     * Test of main method, of class B8A_Group3.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        B8A_Group3.main(args);
       
    }

    /**
     * Test of SecondMenu method, of class B8A_Group3.
     */
    @Test
    public void testSecondMenu() {
        System.out.println("SecondMenu");
        B8A_Group3.SecondMenu();
     
    }

    /**
     * Test of thirdMenu method, of class B8A_Group3.
     */
    @Test
    public void testThirdMenu() {
        System.out.println("thirdMenu");
        String[] longDonuts = null;
        String[] fancyDonuts = null;
        String[] RegularDonuts = null;
        Scanner input = null;
        int[] longDonuts_Price = null;
        int[] fancyDonuts_Price = null;
        int[] RegularDonuts_Price = null;
        String[] expResult = null;
        String[] result = B8A_Group3.thirdMenu(longDonuts, fancyDonuts, RegularDonuts, input, longDonuts_Price, fancyDonuts_Price, RegularDonuts_Price);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of Dots_Summary method, of class B8A_Group3.
     */
    @Test
    public void testDots_Summary() {
        System.out.println("Dots_Summary");
        PrintWriter output = null;
        ArrayList<String> orders = null;
        int Total = 0;
        Customer c = null;
        boolean test = false;
        B8A_Group3.Dots_Summary(output, orders, Total, c, test);
        
    }

    /**
     * Test of Write_review method, of class B8A_Group3.
     */
    @Test
    public void testWrite_review() {
        System.out.println("Write_review");
        PrintWriter revwrite = null;
        String expResult = "";
        String result = B8A_Group3.Write_review(revwrite);
        assertEquals(expResult, result);
        
    }
    
}
