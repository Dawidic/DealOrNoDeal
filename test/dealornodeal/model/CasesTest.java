/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal.model;

import dealornodeal.ui.DealornoDealJFrame;
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
public class CasesTest {
    
    public CasesTest() {
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
     * Test of randomSort method, of class Cases.
     */
    @Test
    public void testRandomSort() {
        DealornoDealJFrame mainFrame = new DealornoDealJFrame("seb");
        System.out.println("randomSort");
        Cases instance = new Cases(mainFrame);
        instance.randomSort();
       assertTrue(instance.caseValues[0] != 1);
       System.out.println("caseValue"+instance.caseValues[0]);
    }


    /**
     * Test of caseOpen method, of class Cases.
     */
    @Test
    public void testCaseOpen() {
        DealornoDealJFrame mainFrame = new DealornoDealJFrame("seb");
        System.out.println("caseOpen");
        int y = 0;
        Cases instance = new Cases(mainFrame);
        instance.caseOpen(y);
        assertTrue(instance.caseValues[y] == 0);
    }

    /**
     * Test of Totalcal method, of class Cases.
     */
    @Test
    public void testTotalcal() {
        DealornoDealJFrame mainFrame = new DealornoDealJFrame("seb");
        System.out.println("Totalcal");
        Cases instance = new Cases(mainFrame);
        float expResult = 0.0F;
        for (int t =0; t< instance.caseValues.length; t++) {
                 expResult = expResult + instance.caseValues[t];
                }
        float result = instance.Totalcal();
        assertTrue(expResult==result);
    }

    /**
     * Test of retCaseValue method, of class Cases.
     */
    @Test
    public void testRetCaseValue() {
        DealornoDealJFrame mainFrame = new DealornoDealJFrame("seb");
        System.out.println("retCaseValue");
        int v = 0;
        Cases instance = new Cases(mainFrame);
        float expResult = 1.0F;
        float result = instance.retCaseValue(v);
        assertTrue(expResult == result);
       
    }
    
}
