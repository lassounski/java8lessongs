package com.daitan;

import com.google.common.collect.ImmutableList;

import com.daitan.model.Closet;
import com.daitan.model.Clothing;

import org.junit.Test;

import java.util.List;

public class FlatMapping {

    private final Closet hisCloset = Closet.builder()
            .id("his closet")
            .addClothes(
                    Clothing.builder()
                            .name("Shirt").build(),
                    Clothing.builder()
                            .name("Pants").build(),
                    Clothing.builder()
                            .name("Socks").build(),
                    Clothing.builder()
                            .name("Shorts").build())
            .build();
    private final Closet herCloset = Closet.builder()
            .id("her closet")
            .addClothes(
                    Clothing.builder()
                            .name("Skirt").build(),
                    Clothing.builder()
                            .name("Dress").build(),
                    Clothing.builder()
                            .name("Shoes").build(),
                    Clothing.builder()
                            .name("Top").build())
            .build();

    private final List<Closet> closets = ImmutableList.of(hisCloset, herCloset);

    @Test
    public void clothesStartingWithS() {
        for (Closet closet : closets) {
            for (Clothing clothing : closet.clothes()) {
                if (clothing.name().startsWith("S")) {
                    System.out.println(clothing);
                }
            }
        }
    }
}
