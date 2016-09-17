package com.zte;

/**
 * Created by 502 on 2016/9/10.
 */
public class PrimeCalculator {

    private static final String SEPARATOR = " ";

    public String calculate(int number) {
        if (number == 1) {
            return "has no prime";
        }
        if (isPrime(number)) {
            return String.valueOf(number);
        }
        return calculatePrimesOfCompositeNumber(number);
    }

    private String calculatePrimesOfCompositeNumber(int number) {
        String primes = "";
        int cutNumber = number;
        for (int i = 2; i < number; i++) {
            while (cutNumber % i == 0) {
                primes = primes + i + SEPARATOR;
                cutNumber = cutNumber / i;
            }
        }
        return primes.trim();
    }

    boolean isPrime(int number) {
        if (number <= 3) {
            return number > 1;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
