package com.demo;

public class App {

    public static void main(String[] args) {

        System.out.println("Hello SonarQube Demo");

        int a = 10;
        int b = 20;

        int sum = addNumbers(a, b);

        System.out.println("Sum: " + sum);
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
}}
