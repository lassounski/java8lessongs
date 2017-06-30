package com.daitan;


public class PrimeChecker {

    /**
     * A prime number is a number that is only divisible by 1 and itself
     */
    public static boolean isPrime(int number) {
        boolean divisible = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisible = true;
                break;
            }
        }
        return divisible;
//        return number > 1 && !IntStream.range(2, number)
//                .anyMatch(value -> number % value == 0);
    }

    public static double sumSqrtOfPrimes(int start, int count) {
//        return Stream.iterate(start, e -> e + 1)
//                .filter(PrimeChecker::isPrime)
//                .limit(count)
//                .mapToDouble(Math::sqrt)
//                .sum();
        int index = start;
        int computedCount = 0;
        double sum = 0;

        while (computedCount < count) {
            if (PrimeChecker.isPrime(index)) {
                sum += Math.sqrt(index);
                computedCount++;
            }
            index++;
        }
        return sum;
    }
}
