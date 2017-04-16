package com.daitan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

    public static int countLines(String searchWord, String path) {
        int count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

}
