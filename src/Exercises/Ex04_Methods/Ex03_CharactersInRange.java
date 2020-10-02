package Exercises.Ex04_Methods;

import java.util.Scanner;

public class Ex03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        char start = (char) Math.min(a, b);
        char end = (char) Math.max(a, b);

        printRange(start, end);
    }

    private static void printRange(char start, char end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
