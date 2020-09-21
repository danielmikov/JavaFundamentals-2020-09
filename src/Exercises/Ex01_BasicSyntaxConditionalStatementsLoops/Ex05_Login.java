package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder sb = new StringBuilder(username);
        sb.reverse();
        String password = sb.toString();

        int loginAttempts = 0;

        while (loginAttempts <= 3) {

            String passwordInput = scanner.nextLine();

            if (password.equals(passwordInput)) {
                System.out.printf("User %s logged in.", username);
                loginAttempts = 100;
            } else {
                System.out.println("Incorrect password. Try again.");
                loginAttempts++;
            }

            if (loginAttempts == 3) {
                System.out.println("User " + username + " blocked!");
                loginAttempts = 100;
            }
        }
    }
}
