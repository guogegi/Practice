package com.zte;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by 502 on 2016/9/10.
 */
public class PrimeCalculatorTest {

    private PrimeCalculator calculator;

    @Before
    public void setup() {
        calculator = new PrimeCalculator();
    }

    @Test
    public void should_return_2_when_input_2() {
        assertThat(calculator.calculate(2), is("2"));
    }

    @Test
    public void should_return_invalid_when_input_1() {
        assertThat(calculator.calculate(1), is("has no prime"));
    }

    @Test
    public void should_return_invalid_when_input_0() {
        assertThat(calculator.calculate(0), is("has no prime"));
    }

    @Test
    public void should_return_5_when_input_5() {
        assertThat(calculator.calculate(5), is("5"));
    }

    @Test
    public void should_return_2_and_5_when_input_10() {
        assertThat(calculator.calculate(10), is("2 5"));
    }

    @Test
    public void should_return_2_and_2_when_input_4() {
        assertThat(calculator.calculate(4), is("2 2"));
    }

    @Test
    public void should_return_2_and_2_and_2_when_input_8() {
        assertThat(calculator.calculate(8), is("2 2 2"));
    }

    @Test
    public void should_return_3_and_5_when_input_15() {
        assertThat(calculator.calculate(15), is("3 5"));
    }

    @Test
    public void should_return_3_and_5_when_input_100() {
        assertThat(calculator.calculate(100), is("2 2 5 5"));
    }

    @Test
    public void should_return_101_when_input_101() {
        assertThat(calculator.calculate(101), is("101"));
    }

    @Test
    public void should_return_true_when_input_2() {
        assertThat(calculator.isPrime(2), is(true));
    }

    @Test
    public void should_return_true_when_input_3() {
        assertThat(calculator.isPrime(3), is(true));
    }

    @Test
    public void should_return_false_when_input_4() {
        assertThat(calculator.isPrime(4), is(false));
    }

    @Test
    public void should_return_false_when_input_1() {
        assertThat(calculator.isPrime(1), is(false));
    }

    @Test
    public void should_return_false_when_input_0() {
        assertThat(calculator.isPrime(0), is(false));
    }
}