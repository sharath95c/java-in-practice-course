package part_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Part3Test {

    @AfterEach
    public void restoreSystemIn() {
        // Restore the original System.in after each test
        System.setIn(System.in);
    }

    private void provideInput(String data) {
        ByteArrayInputStream testInput = new ByteArrayInputStream(data.getBytes());
        System.setIn(testInput);
    }

    @Test
    @DisplayName("Exercise 1 - making the loop infinite")
    void shouldCalculateTheAverageOf5numbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        provideInput("1 2 3 4 5 0");
        Exercise1.main(new String[]{});

        System.setOut(System.out);

        assertEquals("Average of 5 numbers (sum: 15.0) is: 3.0\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 2 - calculate the sum of 10 numbers")
    void shouldPrintTheSumOf10Numbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        provideInput("3 7 15 22 18 49 -20 70 10 99");
        Exercise2.main(new String[]{});

        System.setOut(System.out);

        assertEquals("You picked 10 numbers with sum of total 273, goodbye!\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 3 - fix initialization block in for loop")
    void shouldPrint5NumbersFrom5To9() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise3.main(new String[]{});

        System.setOut(System.out);

        assertEquals("5\n6\n7\n8\n9\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 4 - fix termination block in for loop")
    void shouldPrint16NumbersFrom0To15() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise4.main(new String[]{});

        System.setOut(System.out);

        assertEquals("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 5 - fix termination block in for loop")
    void shouldPrint8NumbersFrom10To3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise5.main(new String[]{});

        System.setOut(System.out);

        assertEquals("10\n9\n8\n7\n6\n5\n4\n3\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 6 - fix incrementation block in for loop")
    void shouldPrintEvenNumbersFrom24To40() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise6.main(new String[]{});

        System.setOut(System.out);

        assertEquals("24\n26\n28\n30\n32\n34\n36\n38\n40\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 7 - fix incrementation block in for loop")
    void shouldPrintPowersOf2From1To128() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise7.main(new String[]{});

        System.setOut(System.out);

        assertEquals("1\n2\n4\n8\n16\n32\n64\n128\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 8 - fix incrementation block in for loop")
    void shouldPrintPowersOf3From243To1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exercise8.main(new String[]{});

        System.setOut(System.out);

        assertEquals("243\n81\n27\n9\n3\n1\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 9 - break on 0")
    void shouldBreakOn0() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        provideInput("23 8 41 17 0");
        Exercise9.main(new String[]{});

        System.setOut(System.out);

        assertEquals("89.0\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 10 - add continue")
    void shouldIgnoreNegativeNumbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        provideInput("23 -17 99 -13 341 0");
        Exercise10.main(new String[]{});

        System.setOut(System.out);

        assertEquals("463.0\n", outContent.toString());
    }
}