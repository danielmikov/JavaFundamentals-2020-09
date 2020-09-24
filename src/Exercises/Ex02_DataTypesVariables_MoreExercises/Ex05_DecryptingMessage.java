package Exercises.Ex02_DataTypesVariables_MoreExercises;

import java.util.Scanner;

public class Ex05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            char input = (scanner.nextLine().charAt(0));
            input += key;
            System.out.print(input);
        }

    }
}
