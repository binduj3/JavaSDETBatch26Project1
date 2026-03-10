package org.example;

public class Program2 {
    static void main(String[] args) {
        /*
         * Create an array of five integer values. After the array is created, use a loop to calculate and print the average of all the elements..
         */

        int[] numbers ={1,2,3,4,6};
        int sum=0;

        for(int number : numbers) {
        sum+=number;
        }

        System.out.println("Average: "+(double)sum/ numbers.length);
    }
}
