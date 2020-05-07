package com.milan.calculator;

import org.junit.*;
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result, 0.1);
    }

    @Test
    public void testSubtract() {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult,result, 0.1);
    }

    @Test
    public void testMultiply() {
        double a = 24;
        double b = 10;
        double expectedResult = 240;
        double result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

}