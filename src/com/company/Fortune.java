package com.company;

import java.util.Scanner;

public class Fortune {
    Scanner sc = new Scanner(System.in);
    String[] fortunes = {};

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
        String scFood = sc.next();
        food = scFood.length();
    }


}
