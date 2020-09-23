package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            char level1 = (char)('a' + i);
            for (int j = 0; j < size; j++) {
                char level2 =(char)('a' + j);
                for (int k = 0; k < size; k++) {
                    char level3 =(char)('a' + k);
                    System.out.printf("%c%c%c%n", level1, level2, level3);
                }
            }
        }
    }
}
