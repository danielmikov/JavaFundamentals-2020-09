package Exercises.Ex04_Methods;

import java.util.Scanner;

public class Ex02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int vowels = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char iChar = inputString.charAt(i);
            vowels = countVowels(vowels, iChar);
        }
        System.out.println(vowels);
    }

    private static int countVowels(int vowels, char iChar) {
        switch (iChar) {
            case 'a','A','e','E','i','I','o','O','u','U','y','Y' :
                vowels++;
                break;
            default:
                break;

        }
        return vowels;
    }
}