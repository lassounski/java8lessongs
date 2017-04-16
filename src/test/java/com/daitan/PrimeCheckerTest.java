package com.daitan;

import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void shouldEvaluatePrimeNumbers() {
        for (int number = 0; number < 10; number++) {
            System.out.println(
                    String.format("Number %d is prime (%b)", number, PrimeChecker.isPrime(number))
            );
        }
    }
}
