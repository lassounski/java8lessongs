package com.daitan;

import com.google.common.collect.Lists;

import com.daitan.model.Person;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javaslang.Tuple;

public class GroupingBy {

    private List<Person> people;

    @Before
    public void setUp() {
        people = Stream.of(
                Tuple.of("Joe", 30),
                Tuple.of("Fred", 15),
                Tuple.of("Barney", 70),
                Tuple.of("Michael", 70))
                .map(nameAgeTuple -> Person.builder()
                        .name(nameAgeTuple._1())
                        .age(nameAgeTuple._2())
                        .build())
                .collect(Collectors.toList());
    }

    @Test
    public void mapByAge() {
        Map<Integer, List<Person>> groupedByAge = new HashMap<>();

        for (Person p : people) {
            if (groupedByAge.get(p.getAge()) == null) {
                groupedByAge.put(p.getAge(), Lists.newArrayList(p));
            } else {
                List<Person> names = groupedByAge.get(p.getAge());
                names.add(p);
                groupedByAge.put(p.getAge(), names);
            }
        }

        System.out.println(groupedByAge);
    }

    @Test
    public void getTheAverageAge() {
        double averageAge = 0;

        for (Person p : people) {
            averageAge += p.getAge();
        }
        averageAge = averageAge / people.size();

        System.out.println(averageAge);
    }

    @Test
    public void joinOlderThan18InString() {
        StringBuilder builder = new StringBuilder("Our friends ");

        for (int i = 0; i < people.size() - 1; i++) {
            Person p = people.get(i);
            if (p.getAge() > 18) {
                builder.append(p.getName()).append(" and ");
            }
        }
        if (people.get(people.size() - 1).getAge() > 18) {
            builder.append(people.get(people.size() - 1).getName());
        }
        builder.append(" are older than 18");

        System.out.println(builder.toString());
    }

    @Test
    public void mapAgesToNames() {
        Map<Integer, String> groupedByAge = new HashMap<>();

        for (Person p : people) {
            if (groupedByAge.get(p.getAge()) == null) {
                groupedByAge.put(p.getAge(), p.getName());
            } else {
                String names = groupedByAge.get(p.getAge());
                names = names + ";" + p.getName();
                groupedByAge.put(p.getAge(), names);
            }
        }

        System.out.println(groupedByAge);
    }

    @Test
    public void upperCasedStringsJoinedByPipes() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < people.size() - 1; i++) {
            Person p = people.get(i);
            builder.append(p.getName().toUpperCase()).append(" | ");
        }
        builder.append(people.get(people.size() - 1).getName().toUpperCase());

        System.out.println(builder.toString());
    }
}
