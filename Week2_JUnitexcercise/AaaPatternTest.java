package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AaaPatternTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange
    }

    @Test
    public void testAddition() {
        int result = calculator.add(10, 5); // Act
        assertEquals(15, result); // Assert
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(10, 2); // Act
        assertEquals(5, result); // Assert
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
