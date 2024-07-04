package part_3;

import java.util.Scanner;

public class Exercise1 {

    // Exercise 1 - Below you will find program for calculating average of numbers read from user's input.
    // The program is not working. Please fix it by making the loop infinite.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        double average = 0.0;
        // Add your code only in the lines below
        boolean condition = false;
        while (condition) {
        // Add your code only in the lines above
            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            }
            counter++;
            sum += inputNumber;
            average = sum / counter;
        }
        System.out.println("Average of " + counter + " numbers (sum: " + sum + ") is: " + average);
    }
}