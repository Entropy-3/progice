package vcc.ice5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Ice5Test {
    
    public Ice5Test() {
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

    @Test
    public void testSomeMethod() {
        
    }

    /**
     * Test of fact method, of class Ice5.
     */
    @Test
    public void testFact() {
        System.out.println("fact");
        int n = 0;
        int expResult = 0;
        int result = Ice5.fact(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of reverseString method, of class Ice5.
     */
    @Test
    public void testReverseString() {
        System.out.println("reverseString");
        String input = "cat";
        String expResult = "tac";
        String result = Ice5.reverseString(input);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isPalindrome method, of class Ice5.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String input = "a";
        boolean expResult = true;
        boolean result = Ice5.isPalindrome(input);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sum method, of class Ice5.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 1;
        int expResult = 1;
        int result = Ice5.sum(n);
        assertEquals(expResult, result);
        
    }

    
    
}
