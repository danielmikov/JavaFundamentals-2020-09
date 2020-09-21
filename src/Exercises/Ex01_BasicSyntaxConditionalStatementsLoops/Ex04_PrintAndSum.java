package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum = sum+i;

        }
        System.out.println();

        System.out.println("Sum: " + sum);
    }
}
