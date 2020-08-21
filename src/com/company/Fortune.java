package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fortune {
    Scanner sc = new Scanner(System.in);

    int name, color, food;

    private String getInput(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    String getName(){
        return getInput("What is your name?");
    }

    String getColor(){
        return getInput("What is your favourite color?");
    }

    String getFood(){
        return getInput("What is your favourite food?");
    }

    void askQuestions(){
        name = getName().length();
        color = getColor().length();
        food = getFood().length();
    }

    void tellFortune(String filename){
        Repository repo;
        try {
            repo = new Repository(Paths.get(filename));
        } catch (IOException e) {
            System.out.println(filename + " file not found, using built-in fortune repository...");
            repo = new Repository();
        }
        System.out.println(repo.getFortune(name, color, food));
    }


}
