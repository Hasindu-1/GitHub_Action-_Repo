package org.example;

public class Main {

    // Method that generates the message
    public static String getMessage(int i) {
        return "i = " + i;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println(getMessage(i));

        }
    }
}
