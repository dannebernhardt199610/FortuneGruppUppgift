package com.company;

public class Main {
    public static void main(String[] args) {
        String filename = (args.length > 0) ? args[0] : "fortunes";

        Fortune fortune = new Fortune();
        fortune.askQuestions();
        fortune.tellFortune(filename);
    }
}
