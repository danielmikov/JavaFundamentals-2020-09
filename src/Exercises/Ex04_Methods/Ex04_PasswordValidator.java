package Exercises.Ex04_Methods;

import java.util.Scanner;

public class Ex04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

//"Password must be between 6 and 10 characters"
        boolean passValidation1 = false;
        passValidation1 = doesPassValidation1(inputPassword, passValidation1);

//"Password must consist only of letters and digits"
        boolean passValidation2 = true;
        passValidation2 = doesPassValidation2(inputPassword, passValidation2);

//"Password must have at least 2 digits"
        boolean passValidation3 = false;
        passValidation3 = doesPassValidation3(inputPassword, passValidation3);

//Valid Password
        isValid(passValidation1, passValidation2, passValidation3);
    }

    private static boolean doesPassValidation1(String inputPassword, boolean passValidation1) {
        if (inputPassword.length() >= 6 && inputPassword.length() <= 10) {
            passValidation1 = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return passValidation1;
    }

    private static boolean doesPassValidation2(String inputPassword, boolean passValidation2) {
        for (int i = 0; i < inputPassword.length(); i++) {
            char currentChar = inputPassword.charAt(i);
            if (!isAlphaNumeral(currentChar)) {
                passValidation2 = false;
                break;
            }
        }
        if (!passValidation2) {
            System.out.println("Password must consist only of letters and digits");
        }
        return passValidation2;
    }

    public static boolean isAlphaNumeral(char c) {
        String alphaNumeral = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return alphaNumeral.contains(c + "");
    }

    private static boolean doesPassValidation3(String inputPassword, boolean passValidation3) {
        int sumDigits = 0;
        for (int i = 0; i < inputPassword.length(); i++) {
            char c = inputPassword.charAt(i);
            switch (c) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                    sumDigits++;
                    break;
                default:
                    break;
            }
        }

        if (sumDigits >= 2) {
            passValidation3 = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }
        return passValidation3;
    }

    private static void isValid(boolean passValidation1, boolean passValidation2, boolean passValidation3) {
        if (passValidation1 && passValidation2 && passValidation3) {
            System.out.println("Password is valid");
        }
    }
}
