package part_3;

import java.util.Scanner;

public class Exercise9 {

    // Exercise 9 - The program sums all numbers provided by user.
    // Please add command to break out of the loop when user provide number 0.
    // Print the sum after the loop finishes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            int inputNumber = scanner.nextInt();
            // Add your code only in the lines below



            // Add your code only in the lines above

            if (inputNumber < 0) {
                System.out.println("Please do not use negative numbers");
                continue;
            }
            sum += inputNumber;
        }
        // Add your code only in the lines below

        // Add your code only in the lines above
    }
}