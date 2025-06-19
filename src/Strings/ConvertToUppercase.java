package Strings;

import java.util.Scanner;

public class ConvertToUppercase {

    public static String myToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder(text.length());

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
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

        System.out.println("--- String Uppercase Conversion and Comparison Program ---");

        System.out.print("Enter a line of text: ");
        String originalText = scanner.nextLine();

        System.out.println("\nOriginal Text: \"" + originalText + "\"");

        String customUpperCaseText = myToUpperCase(originalText);
        System.out.println("Uppercase (Custom Method): \"" + customUpperCaseText + "\"");

        String builtInUpperCaseText = originalText.toUpperCase();
        System.out.println("Uppercase (Built-in Method): \"" + builtInUpperCaseText + "\"");

        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        System.out.println("\nComparison Result:");
        System.out.println("Are the custom uppercase and built-in uppercase strings identical? " + areEqual);

        scanner.close();
    }
}