package com.daitan.exercises;

import com.google.common.collect.ImmutableList;

import com.daitan.PrimeChecker;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class PrimeCheckerTest {

    @Test
    public void shouldEvaluatePrimeNumbers() {
        for (int number = 0; number < 10; number++) {
            System.out.println(
                    String.format("Number %d is prime (%b)", number, PrimeChecker.isPrime(number))
            );
        }
    }

    @Test
    public void shouldSumSqrtPrimeNumbers() {
        int start = 0;
        int count = 10;
        System.out.println(String.format("Sum of %d squared prime numbers starting from %d", count,
                start));
        System.out.println(PrimeChecker.sumSqrtOfPrimes(start, count));
    }

    @Test
    public void de() {
        List<Integer> numbers = ImmutableList.of(1, 2, 3);
        int[] factor = {2};

        Stream<Integer> stream = numbers.stream()
                .map(integer -> integer * factor[0]);

        factor[0] = 4;

        stream.forEach(System.out::println);
    }
}
