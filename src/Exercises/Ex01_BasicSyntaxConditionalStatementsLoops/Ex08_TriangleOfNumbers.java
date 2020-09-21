package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < input + 1; i++) {

            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}
