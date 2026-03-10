package org.example;

import java.util.Scanner;

public class Program4 {
    static void main(String[] args) {
        /*
         * Write a program that takes two numbers as input and prints their sum, difference, product,and division without using any extra variables for calculations.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1= scanner.nextInt();

        System.out.print("Enter second number: ");
        double number2= scanner.nextInt();

        System.out.println("Sum: "+(number1+number2));
        System.out.println("Difference: "+ (number1-number2));
        System.out.println("Product: "+(number1*number2));
        System.out.println("Division: "+(number1/number2));
    }
}
