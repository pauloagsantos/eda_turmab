/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha3;

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
public class LinkedSingleListTest {
    
    public LinkedSingleListTest() {
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
     * Test of isEmpty method, of class LinkedSingleList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals(true, ll.isEmpty());
        ll.addFirst(1);
        assertEquals(false, ll.isEmpty());
        ll.remove(1);
        assertEquals(true, ll.isEmpty());
        
    }

    /**
     * Test of addFirst method, of class LinkedSingleList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        LinkedSingleList ll = new LinkedSingleList();
        ll.addFirst(1);
        assertEquals(true, ll.contains(1));
        assertEquals(1, ll.peekFirst());
        assertEquals(1, ll.peekLast());
        ll.addFirst(2);
        assertEquals(true, ll.contains(2));
        assertEquals(2, ll.peekFirst());
    }

    /**
     * Test of addLast method, of class LinkedSingleList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        LinkedSingleList ll = new LinkedSingleList();
        ll.addLast(1);
        assertEquals(true, ll.contains(1));
        assertEquals(1, ll.peekFirst());
        assertEquals(1, ll.peekLast());
        ll.addLast(2);
        assertEquals(true, ll.contains(2));
        assertEquals(2, ll.peekLast());
    }

    /**
     * Test of contains method, of class LinkedSingleList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals(false, ll.contains(1));
        ll.addFirst(1);
        assertEquals(true, ll.contains(1));
        assertEquals(false, ll.contains(2));
        ll.addFirst(2);
        assertEquals(true, ll.contains(1));
        assertEquals(true, ll.contains(2));
        assertEquals(false, ll.contains(3));
        ll.addFirst(3);
        assertEquals(true, ll.contains(1));
        assertEquals(true, ll.contains(2));
        assertEquals(true, ll.contains(3));
        assertEquals(false, ll.contains(4));
    }

    /**
     * Test of remove method, of class LinkedSingleList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals(false, ll.remove(1));
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        
        assertEquals(true, ll.remove(3));
        assertEquals(false, ll.contains(3));
        
        assertEquals(true, ll.remove(1));
        assertEquals(false, ll.contains(1));
        assertEquals(2, ll.peekLast());
        
        assertEquals(true, ll.remove(5));
        assertEquals(false, ll.contains(5));
        assertEquals(4, ll.peekFirst());   
    }

    /**
     * Test of peekFirst method, of class LinkedSingleList.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals(null, ll.peekFirst());
        ll.addFirst(1);
        assertEquals(1, ll.peekFirst());
        ll.addFirst(2);
        assertEquals(2, ll.peekFirst());
        assertEquals(true, ll.remove(2));
        assertEquals(1, ll.peekFirst());
        assertEquals(true, ll.remove(1));
        assertEquals(null, ll.peekFirst());
    }

    /**
     * Test of peekLast method, of class LinkedSingleList.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals(null, ll.peekLast());
        ll.addFirst(1);
        assertEquals(1, ll.peekLast());
        ll.addFirst(2);
        assertEquals(1, ll.peekLast());
        assertEquals(true, ll.remove(1));
        assertEquals(2, ll.peekLast());
        assertEquals(true, ll.remove(2));
        assertEquals(null, ll.peekLast());
    }
    
    @Test
    public void Teste() {
        LinkedSingleList ll = new LinkedSingleList();
        assertEquals("null", ll.toString());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        assertEquals("3 2 1", ll.toString());
        ll.remove(2);
        assertEquals("3 1", ll.toString());
        ll.remove(3);
        assertEquals("1", ll.toString());
        
        
    }
    
}
