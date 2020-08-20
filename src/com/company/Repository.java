package com.company;

import java.util.List;

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

    private final List<String> fortunes;

    Repository() {
        fortunes = DEFAULT_FORTUNES;
    }
}
