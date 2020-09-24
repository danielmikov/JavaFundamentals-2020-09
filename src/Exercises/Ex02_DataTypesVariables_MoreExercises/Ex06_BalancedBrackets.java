package Exercises.Ex02_DataTypesVariables_MoreExercises;

import java.util.Scanner;

public class Ex06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areOpened = 0;
        int areClosed = 0;
        boolean isBalanced = false;
        boolean firstwrong = false;
        int inputSize = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputSize; i++) {
            String input = scanner.nextLine();

            if (input.equals(")") && areOpened == 0) {
                firstwrong = true;
                break;
            } else if (input.equals("(")) {
                areOpened++;
            } else if (input.equals(")") && areOpened > 0) {
                areClosed++;
            }
        }

        if (areOpened == areClosed && !firstwrong) {
            isBalanced = true;
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
