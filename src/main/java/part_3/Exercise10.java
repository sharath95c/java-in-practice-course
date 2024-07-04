package part_3;

import java.util.Scanner;

public class Exercise10 {

    // Exercise 10 - The program sums all numbers provided by user.
    // Please add command to get back to the start of the loop when user provides negative number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            }
            // Add your code only in the lines below



            // Add your code only in the lines above
            sum += inputNumber;
        }
        System.out.println(sum);
    }
}