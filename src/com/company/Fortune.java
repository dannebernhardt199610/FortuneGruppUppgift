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


}