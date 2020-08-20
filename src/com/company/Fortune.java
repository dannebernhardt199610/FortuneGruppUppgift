package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fortune {
    Scanner sc = new Scanner(System.in);

    int name, color, food;

    void getName(){
        System.out.println("What is your name?");
        String scName = sc.next();
        name = scName.length();
    }

    void getColor(){
        System.out.println("What is your favourite color?");
        String scColor = sc.next();
        color = scColor.length();
    }

    void getFood(){
        System.out.println("What is your favourite food?");
        String ScFood = sc.next();
        food = ScFood.length();
    }

    void askQuestions(){
        getName();
        getColor();
        getFood();
    }

    void tellFortune(){
        Repository repo;
        try {
            repo = new Repository(Paths.get("fortunes"));
        } catch (IOException e) {
            System.out.println("'fortunes' file not found, using built-in fortune repository...");
            repo = new Repository();
        }
        System.out.println(repo.getFortune(name, color, food));
    }


}
