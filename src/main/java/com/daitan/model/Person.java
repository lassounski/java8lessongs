package com.daitan.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Person {

    String getName();

    int getAge();

    static com.daitan.model.ImmutablePerson.Builder builder() {
        return com.daitan.model.ImmutablePerson.builder();
    }
}
