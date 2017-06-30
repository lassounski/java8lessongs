package com.daitan;

import java.util.function.Supplier;

public class LazyEvaluation {

    public static void main(String[] args) {
        System.out.print(bothNumbers(()->hasNumber("nope"), ()->hasNumber("123")));
    }

    static String bothNumbers(boolean b1, boolean b2) {
        return b1 && b2 ? "both numbers!" : "I'm sorry!";
    }

    static String bothNumbers(Supplier<Boolean> b1, Supplier<Boolean> b2) {
        return b1.get() && b2.get() ? "both numbers!" : "I'm sorry!";
    }

    static boolean hasNumber(String str) {
        System.out.println("Verifying number...");
        return str.matches(".*[0-9]+.*");
    }
}

