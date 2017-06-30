package com.daitan;

import com.daitan.model.Person;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javaslang.Tuple;

public class Reduction {

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
    public void oldest() {
        System.out.println(
                people.stream()
                        .reduce((person, person2) ->
                                person.getAge() > person2.getAge() ? person : person2
                        ).get()
        );
        System.out.println(
                people.stream()
                        .mapToInt(person -> person.getAge())
                        .max()
        );
    }

    @Test
    public void olderThan90() {
        System.out.println(
                people.stream()
                        .reduce(Person.builder().age(90).name("Grandpa").build(),
                                (person, person2) ->
                                        person.getAge() > person2.getAge() ? person : person2)
        );
    }

    @Test
    public void parallelAgeSum() {
        System.out.format("The sum of ages is %d",
                people.stream()
                        .reduce(0,
                                (sum, person) -> {
                                    System.out.format("Accumulating %d with %s's %d years\n",
                                            sum, person.getName(), person.getAge()
                                    );
                                    return sum + person.getAge();
                                },
                                (sum1, sum2) -> {
                                    System.out.format("Combining %d with %d\n", sum1, sum2);
                                    return sum1 + sum2;
                                }
                        )
        );
    }
}
