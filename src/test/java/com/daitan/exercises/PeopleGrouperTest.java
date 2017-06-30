package com.daitan.exercises;

import com.google.common.collect.ImmutableMap;

import com.daitan.PeopleGrouper;

import org.junit.Test;

import java.util.Map;

public class PeopleGrouperTest {

    @Test
    public void shouldGroupPeopleByScores() {
        Map<String, Integer> scoredPeople = ImmutableMap.<String, Integer>builder()
                .put("James", 1)
                .put("Jean Claude", 1)
                .put("Chuck", 1)
                .put("Freddie", 12)
                .put("Chandre", 11)
                .put("Fred", 8)
                .put("Zizzi", 8)
                .put("Luigi", 4)
                .build();

        System.out.println(PeopleGrouper.groupByScores(scoredPeople));
    }
}
