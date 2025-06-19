package Strings;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateNumberFormatException(String text) {
        System.out.println("\n--- Attempting to generate NumberFormatException ---");
        System.out.println("Input string: \"" + text + "\"");
        // Using String method: trim() to remove leading/trailing whitespace
        String trimmedText = text.trim();
        System.out.println("Trimmed input: \"" + trimmedText + "\"");

        try {
            // Using String method: isEmpty() to check if the string is empty after trimming
            if (trimmedText.isEmpty()) {
                System.out.println("Input is empty after trimming. This will cause a NumberFormatException.");
            }
            int number = Integer.parseInt(trimmedText);
            System.out.println("Successfully parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException (as expected) in generate method: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Caught a generic exception in generate method: " + e.getMessage());
        } finally {
            System.out.println("Finished attempt to generate exception.");
        }
    }

    public static void demonstrateNumberFormatExceptionHandling(String text) {
        System.out.println("\n--- Demonstrating NumberFormatException Handling ---");
        System.out.println("Input string: \"" + text + "\"");
        // Using String method: trim() to remove leading/trailing whitespace
        String trimmedText = text.trim();
        System.out.println("Trimmed input: \"" + trimmedText + "\"");

        try {
            // Using String method: isEmpty() to check if the string is empty after trimming
            if (trimmedText.isEmpty()) {
                System.out.println("Input is empty after trimming. This will cause a NumberFormatException.");
            }
            int number = Integer.parseInt(trimmedText);
            System.out.println("Successfully parsed number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: The input string \"" + text + "\" (trimmed to \"" + trimmedText + "\") is not a valid number.");
            System.err.println("Error message: " + e.getMessage());
            System.out.println("Program continues execution after handling the specific exception.");
        } catch (RuntimeException e) {
            System.err.println("Caught a generic RuntimeException: " + e.getMessage());
            System.out.println("Program continues execution after handling the generic runtime exception.");
        } catch (Exception e) {
            System.err.println("Caught a general Exception: " + e.getMessage());
            System.out.println("Program continues execution after handling the general exception.");
        } finally {
            System.out.println("Finished demonstration of exception handling.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- NumberFormatException Demonstration Program ---");

        System.out.print("\nEnter a non-numeric string (or just press Enter for an empty string) to GENERATE an exception: ");
        String inputToGenerate = scanner.nextLine();
        try {
            System.out.println("\nAttempting to call generateNumberFormatException(\"" + inputToGenerate + "\")");
            generateNumberFormatException(inputToGenerate);
            System.out.println("This line will not be reached if NumberFormatException is unhandled in generate method and re-thrown.");
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException in main (from generate method re-throw): " + e.getMessage());
            System.err.println("The program would have stopped here if not caught in main.");
        } catch (Exception e) {
            System.err.println("Caught general exception in main (from generate method re-throw): " + e.getMessage());
        }


        System.out.print("\n\nEnter a non-numeric string (or just press Enter for an empty string) to DEMONSTRATE EXCEPTION HANDLING: ");
        String inputToHandle = scanner.nextLine();
        System.out.println("\nAttempting to call demonstrateNumberFormatExceptionHandling(\"" + inputToHandle + "\")");
        demonstrateNumberFormatExceptionHandling(inputToHandle);
        System.out.println("This line is reached because the exception was handled.");


        System.out.println("\nProgram finished gracefully.");
        scanner.close();
    }
}
