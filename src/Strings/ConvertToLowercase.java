package Strings;

import java.util.Scanner;

public class ConvertToLowercase {

    public static String myToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
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

        System.out.println("--- String Case Conversion and Comparison Program ---");

        System.out.print("Enter a line of text: ");
        String originalText = scanner.nextLine();

        System.out.println("\nOriginal Text: \"" + originalText + "\"");

        String customLowerCaseText = myToLowerCase(originalText);
        System.out.println("Lowercase (Custom Method): \"" + customLowerCaseText + "\"");

        String builtInLowerCaseText = originalText.toLowerCase();
        System.out.println("Lowercase (Built-in Method): \"" + builtInLowerCaseText + "\"");

        boolean areEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);

        System.out.println("\nComparison Result:");
        System.out.println("Are the custom lowercase and built-in lowercase strings identical? " + areEqual);

        scanner.close();
    }
}
