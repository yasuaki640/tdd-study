package com.example.tddstudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTests {
    @Test
    public void testMultipilication() {
        Money five = Money.doller(5);
        assertEquals(Money.doller(10), five.times(2));
        assertEquals(Money.doller(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.doller(5).equals(Money.doller(5)));
        assertFalse(Money.doller(5).equals(Money.doller(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.doller(5)));
    }

    @Test
    public void testFrancMultipilication() {
        Money five = Money.franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
