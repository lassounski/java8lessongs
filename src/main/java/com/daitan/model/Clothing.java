package com.daitan.model;

import org.immutables.value.Value;

@Value.Immutable
public interface Clothing {

    String name();

    static com.daitan.model.ImmutableClothing.Builder builder(){
        return com.daitan.model.ImmutableClothing.builder();
    }
}
