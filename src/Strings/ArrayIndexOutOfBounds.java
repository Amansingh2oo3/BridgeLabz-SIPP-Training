package Strings;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayIndexOutOfBounds {

    public static void generateArrayIndexOutOfBoundsException(String[] arr, int index) {
        System.out.println("\n--- Attempting to generate ArrayIndexOutOfBoundsException ---");
        System.out.println("Array length: " + arr.length);
        System.out.println("Attempting to access index: " + index);
        try {
            String element = arr[index];
            System.out.println("Successfully accessed element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException (as expected) in generate method: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            System.out.println("Caught a generic exception in generate method: " + e.getMessage());
        } finally {
            System.out.println("Finished attempt to generate exception.");
        }
    }

    public static void demonstrateArrayIndexOutOfBoundsExceptionHandling(String[] arr, int index) {
        System.out.println("\n--- Demonstrating ArrayIndexOutOfBoundsException Handling ---");
        System.out.println("Array length: " + arr.length);
        System.out.println("Attempting to access index: " + index);
        try {
            String element = arr[index];
            System.out.println("Successfully accessed element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: The index " + index + " is out of bounds for array length " + arr.length + ".");
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
        String[] names;
        int size = 0;

        System.out.println("--- ArrayIndexOutOfBoundsException Demonstration Program ---");

        try {
            System.out.print("Enter the number of names for the array: ");
            size = scanner.nextInt();
            scanner.nextLine();

            if (size <= 0) {
                System.out.println("Array size must be positive. Exiting.");
                scanner.close();
                return;
            }

            names = new String[size];
            System.out.println("Enter " + size + " names:");
            for (int i = 0; i < size; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }

            System.out.println("\n--- Part 1: Generating Unhandled Exception ---");
            System.out.print("Enter an index to cause an EXCEPTION (e.g., " + size + " or " + (size + 5) + " for out of bounds): ");
            int indexToGenerate = scanner.nextInt();
            scanner.nextLine();

            try {
                System.out.println("\nCalling generateArrayIndexOutOfBoundsException(names, " + indexToGenerate + ")");
                generateArrayIndexOutOfBoundsException(names, indexToGenerate);
                System.out.println("This line will not be reached if ArrayIndexOutOfBoundsException is unhandled and re-thrown.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Caught ArrayIndexOutOfBoundsException in main (from generate method re-throw): " + e.getMessage());
                System.err.println("The program would have stopped here if not caught in main.");
            } catch (Exception e) {
                System.err.println("Caught general exception in main (from generate method re-throw): " + e.getMessage());
            }

            System.out.println("\n--- Part 2: Demonstrating Exception Handling ---");
            System.out.print("Enter an index to DEMONSTRATE EXCEPTION HANDLING (e.g., " + size + " or " + (size + 5) + " for out of bounds): ");
            int indexToHandle = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nCalling demonstrateArrayIndexOutOfBoundsExceptionHandling(names, " + indexToHandle + ")");
            demonstrateArrayIndexOutOfBoundsExceptionHandling(names, indexToHandle);
            System.out.println("This line is reached because the exception was handled gracefully.");

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer for array size or index.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nProgram finished gracefully.");
        }
    }
}