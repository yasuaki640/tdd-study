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
        assertEquals(Money.doller(5), Money.doller(5));
        assertNotEquals(Money.doller(6), Money.doller(5));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(6), Money.franc(5));
        assertNotEquals(Money.doller(5), Money.franc(5));
    }

    @Test
    public void testFrancMultipilication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }


    @Test
    public void testCurrency() {
        assertEquals("USD", Money.doller(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality() {
        assertEquals(new Franc(10, "CHF"), new Money(10, "CHF"));
    }
}
