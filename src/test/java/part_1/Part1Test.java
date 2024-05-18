package part_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Part1Test {

    @Test
    @DisplayName("Exercise 1 - should print Hello, World!")
    void shouldPrintHelloWorld() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise1.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Hello, World!\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 2 - should print Java in Practice course")
    void shouldPrintJavaInPracticeCourse() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise2.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Java in Practice course\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 3 - should print int variable value")
    void shouldPrintIntegerValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise3.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("10\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 4 - should print double variable value")
    void shouldPrintDoubleValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise4.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("3.141592653589793\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 5 - should print boolean variable value")
    void shouldPrintBooleanValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise5.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("true\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 6 - should print char variable value")
    void shouldPrintCharValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise6.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("J\n", outContent.toString());
    }

    @Test
    @DisplayName("Exercise 7 - should print String variable value")
    void shouldPrintStringValue() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Exercise7.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("I finished exercise 7\n", outContent.toString());
    }
}