package part_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Part2Test {

    @Test
    @DisplayName("Exercise 1 - addition should print 921")
    void shouldPrintTheSum() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise1.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("921\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 2 - subtraction should print 8619")
    void shouldPrintTheDifference() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise2.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("8619\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 3 - multiplication should print 4473")
    void shouldPrintTheProduct() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise3.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("4473\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 4 - integer division should print 16")
    void shouldPrintTheIntegerQuotient() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise4.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("16\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 5 - division should print 24.6")
    void shouldPrintTheDoubleQuotient() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise5.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("24.6\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 6 - division modulo should print 15")
    void shouldPrintTheRemainder() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise6.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("15\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 7 - should print incremented value 9400")
    void shouldPrintTheIncrementedCounter() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise7.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("9400\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 8 - should print decremented value 2712")
    void shouldPrintTheDecrementedCountdown() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise8.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("2712\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 9 - less than comparison should print false")
    void shouldPrintTheLessThanComparisonResult() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise9.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("false\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 10 - less than comparison should print true")
    void shouldPrintTheGreaterThanComparisonResult() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise10.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("true\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 11 - less than or equal to comparison should print true")
    void shouldPrintTheLessThanOrEqualToComparisonResult() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise11.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("true\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 12 - greater than or equal to comparison should print false")
    void shouldPrintTheGreaterThanOrEqualToComparisonResult() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise12.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("false\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 13 - should return expression with parentheses result")
    void shouldPrintTheExpressionWithParenthesesResult() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise13.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("2\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 14 - if conditional statement should return correct message")
    void shouldPrintYouAreEligibleToVote() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise14.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("You are eligible to vote\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 15 - if-else conditional statement should return correct message")
    void shouldPrintTheNumberIsOdd() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise15.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("The number is odd\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 16 - if-else-if ladder conditional statement should return correct message")
    void shouldPrintTheNumberIsDivisibleBy5() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise16.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("The number is divisible by 5\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 17 - if-else-if-else conditional statement should return correct message")
    void shouldPrintTheNumberIsNegative() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise17.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("The number is negative\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 18 - switch conditional statement should return correct message")
    void shouldPrintTheSaturday() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise18.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Saturday\n", outContent.toString());
    }
}