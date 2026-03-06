package com.study;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testDivideNormal() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10,5));
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(10,0));
    }
}