package org.example;

public class Main {

    // Method that generates a greeting message
    public static String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println("Demo Greetings:");

        // Example greetings
        System.out.println(greet("Hasindu"));
        System.out.println(greet(""));
        System.out.println(greet(null));
    }
}
