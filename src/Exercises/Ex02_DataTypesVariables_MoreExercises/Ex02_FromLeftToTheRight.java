package Exercises.Ex02_DataTypesVariables_MoreExercises;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nInputs; i++) {
            long leftInt = Long.parseLong(scanner.next());
            int leftSum = 0;
            int leftLength = String.valueOf(leftInt).length();

            long rightInt = Long.parseLong(scanner.next());
            int rightSum = 0;
            int rightLength = String.valueOf(rightInt).length();

            if (leftInt > rightInt) {
                for (int j = 0; j < leftLength; j++) {
                    leftSum += leftInt % 10;
                    leftInt /= 10;
                }

                System.out.println(Math.abs(leftSum));
            } else {
                for (int j = 0; j < rightLength; j++) {
                    rightSum += rightInt % 10;
                    rightInt /= 10;
                }

                System.out.println(Math.abs(rightSum));
            }
            //PrintStream printf = System.out.printf("%d%n", Math.max(leftSum, rightSum));
        }
    }
}
