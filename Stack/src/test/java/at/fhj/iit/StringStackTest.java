package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {
        s.push("Hallo");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("knock - knock - knock");
        s.push("Penny");
        s.push("knock - knock - knock");
        s.push("Penny");
        s.push("knock - knock - knock => Penny");

        assertEquals("knock - knock - knock => Penny",s.pop());
        assertEquals("Penny",s.pop());
        assertEquals("knock - knock - knock",s.pop());
        assertEquals("Penny",s.pop());
        assertEquals("knock - knock - knock",s.pop());

        assertTrue(s.isEmpty());
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */

    @Test(expected = IllegalStateException.class)
    public void testEmptyPop() throws Exception{
        s.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testFullPush() throws Exception {
        s.push("t1");
        s.push("t2");
        s.push("t3");
        s.push("t4");
        s.push("t5");
        s.push("t6");
    }
}
