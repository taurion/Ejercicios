/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class SumArrayTest {
    
    public SumArrayTest() {
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
     * Test of SumArray method, of class SumArray.
     */
    @Test
    public void testSumArray() {
        System.out.println("SumArray");
        int[] n = {1,2,3,4,5,6,7,8,9,76,5,3,2,2,2,3,3};
        int[] expResult = {141};
        int[] result = SumArray.SumArray(n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}