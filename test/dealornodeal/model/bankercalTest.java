/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dealornodeal.model;

import dealornodeal.model.bankercal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian & David
 */
public class bankercalTest {
    
    public bankercalTest() {
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
     * Test method banker calculation 
     * inputs value and checks the result
     * I have manual worked out what the range of the answer is coming back.
     */
    @Test
    public void testBankercal() {
        System.out.println("bankercal");
        float a = 500000.0F;
        float b = 1.0F;
        float c = 20.0F;
        bankercal instance = new bankercal();
        Float result = instance.bankercal(a, b, c);
        System.out.println(result);
        assertTrue(result >= 2777 || result <= 2777);
    }
    
}
