package com.daitan;

import org.junit.Test;

public class LineFinderTest {

    private static final String searchWord = "localhost";
    private static final String searchPath = "/etc/hosts";

    @Test
    public void shouldCountStringInFiles() {
        System.out.println(String.format("The amount of \"%s\" strings in \"%s\" is %d",
                searchWord, searchPath, LineCounter.countLines(searchWord, searchPath)));
    }
}
