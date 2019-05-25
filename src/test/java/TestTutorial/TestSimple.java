package TestTutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestSimple {

    @Before
    public void printStartTest(){
        System.out.println("Starting tests!");
    }

    @Test
    public void failTest(){
//        fail("FAIL - test not implemented");
//        assertTrue("Asserting", false);
        assertFalse("Not Asserting", false);

    }

    @Test
    public void passTest(){
        System.out.println("PASS - test implemented");
    }

    @After
    public void printEndTest(){
        System.out.println("Ending Tests :(");
    }
}
