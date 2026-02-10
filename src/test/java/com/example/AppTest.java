package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void testCalculateDiscount_validPrice() {
        assertEquals(10, app.calculateDiscount(100));
    }

    @Test
    void testCalculateDiscount_negativePrice() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> app.calculateDiscount(-1));
        assertEquals("Price cannot be negative", ex.getMessage());
    }

    @Test
    void testFormatName_null() {
        assertEquals("", app.formatName(null));
    }

    @Test
    void testFormatName_empty() {
        assertEquals("", app.formatName(""));
    }

    @Test
    void testFormatName_longName() {
        assertEquals("ABCDEFGHIJKLMNOPQRST",
                app.formatName("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testFormatName_normal() {
        assertEquals("SHIVAM", app.formatName("shivam"));
    }

    @Test
    void testAdd() {
        assertEquals(8, app.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, app.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, app.multiply(5, 3));
    }

    @Test
    void testDivide_valid() {
        assertEquals(1, app.divide(5, 3));
    }

    @Test
    void testDivide_byZero() {
        assertThrows(IllegalArgumentException.class,
                () -> app.divide(5, 0));
    }

    @Test
    void testIsPositive() {
        assertTrue(app.isPositive(5));
        assertFalse(app.isPositive(0));
        assertFalse(app.isPositive(-3));
    }

    @Test
    void testIsEven() {
        assertTrue(app.isEven(4));
        assertFalse(app.isEven(5));
    }

    @Test
    void testGetUserType() {
        assertEquals("INVALID", app.getUserType(-1));
        assertEquals("MINOR", app.getUserType(10));
        assertEquals("ADULT", app.getUserType(30));
        assertEquals("SENIOR", app.getUserType(65));
    }
}
