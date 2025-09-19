/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IPT
 */
public class ComplexoTest {
    
    public ComplexoTest() {
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
     * Test of getParteReal method, of class Complexo.
     */
    @Test
    public void testGetParteReal() {
        System.out.println("getParteReal");
        Complexo c1 = new Complexo();
        assertEquals(0, c1.getParteReal(),0);
        Complexo c2 = new Complexo(1,2);
        assertEquals(1, c2.getParteReal(),0);
        Complexo c3 = new Complexo(-1,-2);
        assertEquals(-1, c3.getParteReal(),0);
    }

    /**
     * Test of getParteImaginaria method, of class Complexo.
     */
    @Test
    public void testGetParteImaginaria() {
        System.out.println("getParteImaginaria");
        Complexo c1 = new Complexo();
        assertEquals(0, c1.getParteImaginaria(),0);
        Complexo c2 = new Complexo(1,2);
        assertEquals(2, c2.getParteImaginaria(),0);
        Complexo c3 = new Complexo(-1,-2);
        assertEquals(-2, c3.getParteImaginaria(),0);
    }

    /**
     * Test of somar method, of class Complexo.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.somar(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class Complexo.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.subtrair(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Complexo.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.multiplicar(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Complexo.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complexo c1 = null;
        Complexo c2 = null;
        Complexo expResult = null;
        Complexo result = Complexo.dividir(c1, c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conjugado method, of class Complexo.
     */
    @Test
    public void testConjugado() {
        System.out.println("conjugado");
        Complexo c = null;
        Complexo expResult = null;
        Complexo result = Complexo.conjugado(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complexo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complexo instance = new Complexo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Complexo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Complexo instance = new Complexo();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Complexo.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Complexo instance = new Complexo();
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
