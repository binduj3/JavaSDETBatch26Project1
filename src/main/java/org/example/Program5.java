package org.example;

public class Program5 {
    static void main(String[] args) {
        /*
         * Write a program that declares two integer variables with values, and then swaps them using a temporary variable. Print the values before and after the swap.
         */

      int number1 =10;
      int number2=20;

        System.out.println("Before swap Number1: "+ number1 +" , Number2: "+ number2);

        int temp = number1;
        number1=number2;
        number2=temp;

        System.out.println("After swap Number1: "+ number1 +" , Number2: "+ number2);

    }
}
