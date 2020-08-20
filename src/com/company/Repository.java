package com.company;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Repository {
    private static final List<String> DEFAULT_FORTUNES = List.of(
            "A dubious friend may be an enemy in camouflage.",
            "Your success will astonish everyone.",
            "You will soon be surrounded by good friends and laughter.",
            "Many will travel to hear you speak.",
            "Now is a good time to buy stock.",
            "Physical activity will dramatically improve your outlook today.",
            "Say hello to others. You will have a happier day.",
            "You should be able to undertake and complete anything.",
            "You will be pleasantly surprised tonight.",
            "You will be traveling and coming into a fortune."
    );
    private static final Random rng = new Random();
    private final List<String> fortunes;

    Repository() {
        fortunes = DEFAULT_FORTUNES;
    }

    // Get a random fortune
    public String getFortune() {
        return fortunes.get(rng.nextInt(fortunes.size()));
    }

    // Get a pseudorandom fortune derived from an arbitrary input
    public String getFortune(Object... values) {
        return fortunes.get(Objects.hash(values) % fortunes.size());
    }
}
