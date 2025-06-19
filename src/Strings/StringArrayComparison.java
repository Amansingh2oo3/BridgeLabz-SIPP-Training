package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class StringArrayComparison {

    public static char[] myToCharArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- String to Char Array Conversion and Comparison Program ---");

        System.out.print("Enter a word or text (single token): ");
        String inputText = scanner.next();

        System.out.println("\nOriginal String: \"" + inputText + "\"");

        char[] customCharArray = myToCharArray(inputText);
        System.out.println("Char Array (Custom Method): " + Arrays.toString(customCharArray));

        char[] builtInCharArray = inputText.toCharArray();
        System.out.println("Char Array (Built-in Method): " + Arrays.toString(builtInCharArray));

        boolean areArraysEqual = compareCharArrays(customCharArray, builtInCharArray);

        System.out.println("\nComparison Result:");
        System.out.println("Are the custom and built-in char arrays identical? " + areArraysEqual);

        scanner.close();
    }
}