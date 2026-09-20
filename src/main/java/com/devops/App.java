package com.devops;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to DevOps CI Pipeline.";
    }

    public static void main(String[] args) {
        System.out.println(greet("Mitthun"));
    }
}