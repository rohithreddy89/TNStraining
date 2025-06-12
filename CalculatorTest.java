package com.tns.kprit.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // initialize before each test
    }

    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    @DisplayName("Test Division")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Test Division by Zero Exception")
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
