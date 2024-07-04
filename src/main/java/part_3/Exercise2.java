package part_3;

import java.util.Scanner;

public class Exercise2 {

    // Exercise 2 - The program sums all numbers provided by user. There is bug in the condition.
    // Please fix the condition, so it allows user to sum 10 numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        // Add your code only in the lines below
        while (counter < 0) {
        // Add your code only in the lines above
            int number = scanner.nextInt();
            sum += number;
            counter++;
        }
        System.out.println("You picked " + counter + " numbers with sum of total " + sum + ", goodbye!");
    }
}