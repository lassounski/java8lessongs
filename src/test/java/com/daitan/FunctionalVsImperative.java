package com.daitan;

import org.junit.Test;

import javaslang.collection.List;


public class FunctionalVsImperative {

    private List<String> names = List.of("John", "Micke", "Jenny");

    @Test
    public void imperativeIterationExample() {
        for (int i = 0; i < names.length(); i++) {
            System.out.println(names.get(i));
        }
    }

    @Test
    public void functionalIterationExample() {
        names.forEach(System.out::println);
    }
}
