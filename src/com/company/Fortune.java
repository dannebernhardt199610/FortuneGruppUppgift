package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fortune {
    private final Scanner sc = new Scanner(System.in);
    private String name, color, food;

    private String getInput(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    void askQuestions() {
        try {
            name = getInput("What is your name?");
            color = getInput("What is your favourite color?");
            food = getInput("What is your favourite food?");
        } catch (NoSuchElementException | IllegalStateException e) {
            // The exceptions thrown by getInput (via Scanner.nextLine)
            System.err.println("Input interrupted, exiting...");
            System.exit(1);
        }
    }

    void tellFortune(String filename) {
        Repository repo;
        try {
            repo = new Repository(Paths.get(filename));
        } catch (IOException e) {
            System.out.println(filename + " file unreadable or not found, using built-in fortune repository...");
            repo = new Repository();
        }
        System.out.println(repo.getFortune(name, color, food));
    }
}
