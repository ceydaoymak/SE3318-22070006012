package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a basic test for the App class.
 * It uses JUnit 3 style.
 */
public class AppTest extends TestCase {

    /**
     * Constructor for the test.
     *
     * @param testName the name of the test
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Runs all tests in this class.
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
        assertTrue(true);
    }
}
