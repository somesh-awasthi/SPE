package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void calculateFactorial() {
        assertEquals(2, Main.calculateFactorial(2));
        assertEquals(1, Main.calculateFactorial(0));
    }

    @Test
    void calculateSquareRoot() {
        assertEquals(2, Main.calculateSquareRoot(4));
        assertEquals(3, Main.calculateSquareRoot(9));
    }

    @Test
    void calculateLog() {
        assertEquals(Math.log(10), Main.calculateLog(10));
    }

    @Test
    void calculatePower() {
        assertEquals(4, Main.calculatePower(2, 2));
    }
}
