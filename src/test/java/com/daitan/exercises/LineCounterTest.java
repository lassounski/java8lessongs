package com.daitan.exercises;

import com.daitan.LineCounter;

import org.junit.Test;

public class LineCounterTest {

    private static final String searchWord = "localhost";
    private static final String searchPath = "/etc/hosts";

    @Test
    public void shouldCountStringInFiles() {
        System.out.println(String.format("The amount of \"%s\" strings in \"%s\" is %d",
                searchWord, searchPath, LineCounter.countLines(searchWord, searchPath)));
    }
}
