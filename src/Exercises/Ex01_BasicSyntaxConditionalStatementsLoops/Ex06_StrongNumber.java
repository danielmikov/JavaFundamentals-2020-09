package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int sum = 0;

        if (number == 1) {
            System.out.println("yes");
        } else if (number == 2) {
            System.out.println("no");
        } else {
            for (int i = 0; i < input.length(); i++) {
                int lastDigit = number % 10;
                int sumMini = 1;

                for (int j = 1; j < lastDigit + 1; j++) {
                    sumMini *= j;
                }

                sum += sumMini;
                number /= 10;
            }

            number = Integer.parseInt(input);
            if (number == sum) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
