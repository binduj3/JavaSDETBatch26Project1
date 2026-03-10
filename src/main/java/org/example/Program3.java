package org.example;

public class Program3 {
    static void main(String[] args) {
        /*
         * Create an array to store the scores of six students in a class. Use a loop to count and print how many scores are above 80.
         */

        double[] scores={72.5,89.5,90.5,99.5,67.0,87.67};
        int count=0;

        for (double score:scores)
        {
            if(score>80)
            {
                count++;
            }
        }

        System.out.println("Number of students who have score above 80: "+count);
    }
}
