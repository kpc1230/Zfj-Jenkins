package com.getzephyr;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App2Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App2Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        assertEquals(2, 3);
    }
    
    public void testApp2() {
    	assertEquals(1, 1);
    }

    public void testApp3() {
    	assertEquals("one", "one");
    }
    
    public void testApp4() {
    	assertEquals("one", "one");
    }
    public void testApp5() {
    	assertEquals("one", "one");
    }
    public void testApp6() {
    	assertEquals("2", "2");
    }
    public void testApp7() {
    	assertEquals("one", "one");
    }
    
    public void testApp8() {
    	assertEquals("one", "one");
    }
    public void testApp9() {
    	assertEquals("one", "one");
    }
    public void testApp10() {
    	assertEquals("2", "2");
    }

}
