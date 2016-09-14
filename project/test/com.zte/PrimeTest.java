package com.zte;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by 502 on 2016/9/10.
 */
public class PrimeTest {

    private Prime prime;

    @Before
    public void setup() {
        prime = new Prime();
    }

    @Test
    public void should_return_2_when_input_2() {
        String primes = prime.calculatePrimes(2);
        assertThat(primes, is("2"));
    }

    @Test
    public void should_return_invalid_when_input_1() {
        String primes = prime.calculatePrimes(1);
        assertThat(primes, is("has no prime"));
    }

    @Test
    public void should_return_5_when_input_5() {
        String primes = prime.calculatePrimes(5);
        assertThat(primes, is("5"));
    }

    @Test
    public void should_return_2_and_5_when_input_10() {
        String primes = prime.calculatePrimes(10);
        assertThat(primes, is("2 5"));
    }

    @Test
    public void should_return_2_and_2_when_input_4() {
        String primes = prime.calculatePrimes(4);
        assertThat(primes, is("2 2"));
    }

    @Test
    public void should_return_2_and_2_and_2_when_input_8() {
        String primes = prime.calculatePrimes(8);
        assertThat(primes, is("2 2 2"));
    }

    @Test
    public void should_return_3_and_5_when_input_15() {
        String primes = prime.calculatePrimes(15);
        assertThat(primes, is("3 5"));
    }

    @Test
    public void should_return_3_and_5_when_input_100() {
        String primes = prime.calculatePrimes(100);
        assertThat(primes, is("2 2 5 5"));
    }

    @Test
    public void should_return_101_when_input_101() {
        String primes = prime.calculatePrimes(101);
        assertThat(primes, is("101"));
    }

    @Test
    public void should_return_true_when_input_2() {
        assertThat(prime.isPrime(2), is(true));
    }

    @Test
    public void should_return_true_when_input_3() {
        assertThat(prime.isPrime(3), is(true));
    }

    @Test
    public void should_return_true_when_input_4() {
        assertThat(prime.isPrime(4), is(false));
    }
}