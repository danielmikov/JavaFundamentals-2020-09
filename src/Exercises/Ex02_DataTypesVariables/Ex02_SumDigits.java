package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int number = Integer.parseInt(inputString);
        int lastDigit = 0;

        for (int i = 0; i < inputString.length(); i++) {
            lastDigit += number % 10;
            number /= 10;
        }

        System.out.println(lastDigit);

    }
}
