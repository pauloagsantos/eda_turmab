/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import ficha2.IlimitedStack;
import ficha2.LimitedStack;
import ficha2.Stack;
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
public class TestStack {
    
    public TestStack() {
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
    public void TestStack() {
        testar(new LimitedStack(10));
        testar(new IlimitedStack());
    }
    
    private void testar(Stack p) {
        assertEquals(true, p.isEmpty());
        assertEquals(null, p.peek());
        assertEquals(null, p.pop());
        p.push("ola");
        assertEquals(false, p.isEmpty());
        assertEquals("ola", p.peek());
        assertEquals("ola", p.pop());
        assertEquals(true, p.isEmpty());
        p.push("ola");
        p.push("mundo");
        assertEquals("mundo", p.peek());
        assertEquals("mundo", p.pop());
        assertEquals("ola", p.peek());
        assertEquals("ola", p.pop());
        assertEquals(true, p.isEmpty());
        for(int i=0; i < 10; i++)
            p.push(i);
        
        if (p instanceof LimitedStack)
            try {
                p.push(10);
                fail("Devia ter dado um ArrayIndexOutOfBounds");
            } catch(ArrayIndexOutOfBoundsException e) {
                // continua o teste
            }
        for(int i=9; i >= 0; i--)
            assertEquals(i, p.pop());
        
        
        
    }
}
