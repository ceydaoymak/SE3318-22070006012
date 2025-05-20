package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Basic unit test for the App class.
 * This class uses JUnit 3 style testing.
 */
public class AppTest extends TestCase {

    /**
     * Constructor for the test case.
     *
     * @param testName the name of the test
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Creates a test suite containing all test methods in this class.
     *
     * @return the test suite
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * A simple test that always passes.
     */
    public void testApp() {
        assertTrue(true); // Always passes
    }
}
