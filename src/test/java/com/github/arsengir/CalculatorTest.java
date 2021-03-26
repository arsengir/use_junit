package com.github.arsengir;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @Test
    void test_plus(){
        Calculator calc = Calculator.instance.get();
        Integer actual = calc.plus.apply(2, 2);

        assertThat(actual, equalTo(4));
    }

    @Test
    void test_minus(){
        Calculator calc = Calculator.instance.get();
        Integer actual = calc.minus.apply(3, 5);

        assertThat(actual, equalTo(-2));
    }

    @Test
    void test_divide(){
        Calculator calc = Calculator.instance.get();
        Double actual = calc.divide.apply(5.0, 2.0);

        assertThat(actual, equalTo(2.5));
    }

    @Test
    void test_divide_zero(){
        Calculator calc = Calculator.instance.get();
        Double actual = calc.divide.apply(5.0, 0.0);

        assertThat(actual, equalTo(Double.POSITIVE_INFINITY));
    }


    @Test
    public void test_divide_whenCompare_thenCorrect() {
        Calculator calc = Calculator.instance.get();
        Double actual = calc.divide.apply(10.0, 3.0);

        assertThat(actual, closeTo(3.33333, 0.00001));
    }

    @Test
    public void test_abs() {
        Calculator calc = Calculator.instance.get();
        Integer actual = calc.abs.apply(-5);

        assertThat(actual, allOf(greaterThan(0), equalTo(5)));
    }

}