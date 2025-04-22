package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        // Test name parametresi artık kullanılmıyor ama kaldırmadık
    }

    /**
     * @return the suite of tests being tested
     */
    public static Object suite() {
        return null; // JUnit 5'te TestSuite kullanılmaz, ama kalsın yorum için
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }
}