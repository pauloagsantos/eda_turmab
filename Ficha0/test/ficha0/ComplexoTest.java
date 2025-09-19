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
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(3, 3), r);
        c1 = new Complexo(1,1);
        c2 = new Complexo(-2,2);
        r = Complexo.somar(c1, c2);
        assertEquals(new Complexo(-1, 3), r);
    }

    /**
     * Test of subtrair method, of class Complexo.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = new Complexo(2,2);
        Complexo r = Complexo.subtrair(c1, c2);
        assertEquals(new Complexo(-1, -1), r);
        c1 = new Complexo(1,1);
        c2 = new Complexo(-2,2);
        r = Complexo.subtrair(c1, c2);
        assertEquals(new Complexo(3, -1), r);
        assertNotEquals(new Complexo(), r);
    }

    /**
     * Test of multiplicar method, of class Complexo.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.multiplicar(c1, c2);
        assertEquals(new Complexo(-3, 4), r);
    }

    /**
     * Test of dividir method, of class Complexo.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Complexo c1 = new Complexo(1,2);
        Complexo c2 = new Complexo(1,2);
        Complexo r = Complexo.dividir(c1, c2);
        assertEquals(new Complexo(1, 0), r);
    }

    /**
     * Test of conjugado method, of class Complexo.
     */
    @Test
    public void testConjugado() {
        System.out.println("conjugado");
        Complexo c1 = new Complexo(1,2);
        Complexo r = Complexo.conjugado(c1);
        assertEquals(new Complexo(1, -2), r);
    }

    /**
     * Test of toString method, of class Complexo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals("1.0+1.0i", new Complexo(1,1).toString());
        assertEquals("-1.0+1.0i", new Complexo(-1,1).toString());
        assertEquals("1.0-1.0i", new Complexo(1,-1).toString());
        assertEquals("-1.0-1.0i", new Complexo(-1,-1).toString());
    }


    /**
     * Test of clone method, of class Complexo.
     */
    @Test
    public void testClone() {
        Complexo c1 = new Complexo(1,1);
        Complexo c2 = (Complexo)c1.clone();
        assertEquals(c1, c2);
    }
    
}
