package org.example;

public class Program1 {
    static void main(String[] args) {
        /*
        * Create a program that uses an array to store the names of five fruits, and then uses a loop to print each fruit name on a new line.
        */

        String[] fruits = {"Apple","Banana","Guava","Pineapple","Mango"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
