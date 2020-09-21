package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(scanner.nextLine());

        if (age <= 2) {
            System.out.println("baby");
        } else if (age <= 13) {
            System.out.println("child");
        } else if (age <= 19) {
            System.out.println("teenager");
        } else if (age <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
