package com.daitan.model;

import org.immutables.value.Value;

import java.util.List;


@Value.Immutable
public interface Closet {

    String id();
    List<Clothing> clothes();

    static com.daitan.model.ImmutableCloset.Builder builder() {
        return com.daitan.model.ImmutableCloset.builder();
    }
}
