package com.example.tddstudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTests {
    @Test
    public void testMultipilication() {
        Doller five = new Doller(5);
        assertEquals(new Doller(10), five.times(2));
        assertEquals(new Doller(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Doller(5).equals(new Doller(5)));
        assertFalse(new Doller(5).equals(new Doller(6)));
    }
}
