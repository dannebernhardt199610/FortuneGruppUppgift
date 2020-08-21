package com.company;

public class Main {

    public static void main(String[] args) {
        String filename = "fortunes";
        if (args.length > 0) filename = args[0];

        Fortune fortune = new Fortune();

        fortune.askQuestions();
        fortune.tellFortune(filename);
    }
}
