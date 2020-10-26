package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegnemaskineTest {

    @Test
    void add() {
        Regnemaskine calc = new Regnemaskine();
        assertEquals(16, calc.add(12,4), 0.001);

    }

    @Test
    void subtract() {
        Regnemaskine calc = new Regnemaskine();
        assertEquals(7, calc.subtract(13,6), 0.001);
    }

    @Test
    void multiply() {
        Regnemaskine calc = new Regnemaskine();
        assertEquals(56, calc.multiply(7,8), 0.001);
    }

    @Test
    void divide() {
        Regnemaskine calc = new Regnemaskine();
        assertEquals(2, calc.divide(12,6), 0.001);
    }
}