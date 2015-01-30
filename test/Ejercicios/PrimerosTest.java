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
public class PrimerosTest {
    
    public PrimerosTest() {
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
     * Test of Suma method, of class Primeros.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int n = -3;
        int expResult = 0;
        int result = Primeros.Suma(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}