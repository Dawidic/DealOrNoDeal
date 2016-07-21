/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal.ui;

import dealornodeal.model.Cases;
import dealornodeal.model.bankercal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebastian
 */
public class DealornoDealJFrameTest {
    
    public DealornoDealJFrameTest() {
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
     * Test of bankerChoice method, of class DealornoDealJFrame.
     */
    @Test
    public void testBankerChoice() {
        System.out.println("bankerChoice");
         DealornoDealJFrame instance = new DealornoDealJFrame("seb");
        int x = 1;
        int y = 2;
       assertTrue(instance.bankerChoice (x) == 0);
       assertTrue(instance.bankerChoice (y) == 0);
    }

    /**
     * Test of lastChoiceCheck method, of class DealornoDealJFrame.
     */
    @Test
    public void testLastChoiceCheck() {
        System.out.println("lastChoiceCheck");
        DealornoDealJFrame instance = new DealornoDealJFrame("seb");
        int x = 1;
        int y = 2;
       assertTrue(instance.bankerChoice (x) == 0);
       assertTrue(instance.bankerChoice (y) == 0);
    }

    /**
     * Test of Restart method, of class DealornoDealJFrame.
     */
  

    
}
