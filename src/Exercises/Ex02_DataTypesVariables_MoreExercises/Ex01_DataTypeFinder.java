package Exercises.Ex02_DataTypesVariables_MoreExercises;

import java.util.Scanner;

public class Ex01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean keepWorking = true;

        while (keepWorking) {

            String input = scanner.nextLine();

            if (input.equals("END")) {
                keepWorking = false;
                break;
            } else {
                boolean isInt = true;
                try {
                    int integer = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    isInt = false;
                }

                boolean isDouble = true;
                try {
                    double doubl = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    isDouble = false;
                }

                if (isInt) {
                    System.out.printf("%s is integer type%n", input);
                } else if (isDouble) {
                    System.out.printf("%s is floating point type%n", input);
                } else if (input.length() == 1) {
                    System.out.printf("%s is character type%n", input);
                } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
                    System.out.printf("%s is boolean type%n", input);
                } else {
                    System.out.printf("%s is string type%n", input);
                }
            }

        }
    }
}
