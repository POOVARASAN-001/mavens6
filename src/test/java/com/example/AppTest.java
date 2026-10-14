package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testValidPalindrome() {
        App app = new App();
        assertTrue(app.isPalindrome("radar"));
    }

    @Test
    public void testMixedCasePalindrome() {
        App app = new App();
        assertTrue(app.isPalindrome("Madam"));
    }

    @Test
    public void testInvalidPalindrome() {
        App app = new App();
        assertFalse(app.isPalindrome("hello"));
    }
}
