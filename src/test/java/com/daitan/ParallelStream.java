package com.daitan;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ParallelStream {

    @Test
    public void printParallelism() {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.format("Parallelism:%d", forkJoinPool.getParallelism());
    }

    @Test
    public void parallelExecution() {
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((o1, o2) -> {
                    System.out.format("Sorting %s and %s [%s]\n", o1, o2, Thread.currentThread().getName());
                    return o1.compareTo(o2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
