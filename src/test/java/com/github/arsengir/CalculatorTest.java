package com.github.arsengir;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void test_plus(){
        Integer expected = 4;

        Calculator calc = Calculator.instance.get();
        Integer actual = calc.plus.apply(2, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_minus(){
        Integer expected = -2;

        Calculator calc = Calculator.instance.get();
        Integer actual = calc.minus.apply(3, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_divide(){
        Double expected = 2.5;

        Calculator calc = Calculator.instance.get();
        Double actual = calc.divide.apply(5.0, 2.0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test_divide_zero(){
        Double expected = Double.POSITIVE_INFINITY;

        Calculator calc = Calculator.instance.get();
        Double actual = calc.divide.apply(5.0, 0.0);

        Assertions.assertEquals(expected, actual);
    }

}