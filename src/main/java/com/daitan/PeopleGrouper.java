package com.daitan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PeopleGrouper {

    public static Map<Integer, List<String>> groupByScores(Map<String, Integer> peopleWithScores) {
        Map<Integer, List<String>> orderedByScores = new TreeMap<>(Comparator.reverseOrder());

        for (String name : peopleWithScores.keySet()) {
            int score = peopleWithScores.get(name);

            List<String> names = new ArrayList<>();
            if(orderedByScores.containsKey(score)){
                names = orderedByScores.get(score);
            }
            names.add(name);
            orderedByScores.put(score, names);
        }
        return orderedByScores;
    }
}
