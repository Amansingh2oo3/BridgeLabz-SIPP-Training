package Strings;

import java.util.Scanner;

public class Substringcompare {
    public static String mySubstring(String text, int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex > text.length() ||
            endIndex < 0 || endIndex > text.length() ||
            startIndex > endIndex) {
            System.err.println("Error: Invalid start or end index provided for substring. Returning empty string.");
            return "";
        }

        StringBuilder substring = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Substring Creation and Comparison Program ---");

        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        System.out.print("Enter the start index (inclusive): ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index (exclusive): ");
        int endIndex = scanner.nextInt();

        System.out.println("\nOriginal String: \"" + mainString + "\"");
        System.out.println("Requested Substring from index " + startIndex + " to " + endIndex + " (exclusive)");

        String customSubstring = mySubstring(mainString, startIndex, endIndex);
        System.out.println("Custom Substring: \"" + customSubstring + "\"");

        String builtInSubstring = "";
        try {
            builtInSubstring = mainString.substring(startIndex, endIndex);
            System.out.println("Built-in Substring: \"" + builtInSubstring + "\"");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error with built-in substring: " + e.getMessage());
            System.out.println("Built-in Substring: (Error occurred)");
            builtInSubstring = "";
        }

        boolean areSubstringsEqual = compareStrings(customSubstring, builtInSubstring);

        System.out.println("\nComparison Result:");
        System.out.println("Are the custom and built-in substrings identical? " + areSubstringsEqual);

        scanner.close();
    }
}
