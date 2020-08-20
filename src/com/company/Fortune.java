package com.company;

import java.util.Scanner;

public class Fortune {
    Scanner sc = new Scanner(System.in);
    String[] fortunes = {  "A dubious friend may be an enemy in camouflage.",
            "Your success will astonish everyone.",
            "You will soon be surrounded by good friends and laughter.",
            "Many will travel to hear you speak.",
            "Now is a good time to buy stock.",
            "Physical activity will dramatically improve your outlook today.",
            "Say hello to others. You will have a happier day.",
            "You should be able to undertake and complete anything.",
            "You will be pleasantly surprised tonight.",
            "You will be traveling and coming into a fortune.",
    };

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
        int result = name + color + food;
        result = result % fortunes.length;
        System.out.println(fortunes[result]);
    }


}
