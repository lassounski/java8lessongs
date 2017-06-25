package com.daitan;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LazyEvaluation {

    public static void main(String[] args) {
        Supplier<Stream<String>> streamSupply = () -> Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(str -> str.startsWith("a"));

        streamSupply.get().forEach(System.out::println);
        streamSupply.get().forEach(System.out::println); //IllegalStateException
    }
}

