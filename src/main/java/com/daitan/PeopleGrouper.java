package com.daitan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleGrouper {

    public Map<Integer, List<String>> groupByScores(Map<String, Integer> peopleWithScores) {
        Map<Integer, List<String>> byScores = new HashMap<>();
        for (String name : peopleWithScores.keySet()) {
            int score = peopleWithScores.get(name);

            List<String> names = new ArrayList<>();
            if(peopleWithScores.containsKey(score)){
                names = byScores.get(score);
            }
            names.add(name);
            byScores.put(score, names);
        }
        return byScores;
    }
}
