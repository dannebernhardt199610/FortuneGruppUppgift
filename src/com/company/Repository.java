package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    // Get a repository loaded with default fortunes
    Repository() {
        fortunes = DEFAULT_FORTUNES;
    }

    // Read fortunes from the file defined by a given path
    Repository(Path p) throws IOException {
        try (Stream<String> lines = Files.lines(p, StandardCharsets.UTF_8)) {
            fortunes = lines.collect(Collectors.toList());
        }
    }

    // Get a random fortune
    public String getFortune() {
        return fortunes.get(rng.nextInt(fortunes.size()));
    }

    // Get a pseudorandom fortune derived from an arbitrary input
    public String getFortune(Object... values) {
        return fortunes.get(Math.abs(Objects.hash(values)) % fortunes.size());
    }
}
