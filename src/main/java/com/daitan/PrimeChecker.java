package com.daitan;

public class PrimeChecker {

    /**
     * A prime number is a number that is only divisible by 1 and itself
     * @param number
     * @return
     */
    public static boolean isPrime(int number){
        boolean divisible = false;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                divisible = true;
                break;
            }
        }
        return number > 1 && !divisible;
    }
}
