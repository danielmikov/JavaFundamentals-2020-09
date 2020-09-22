package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops_MoreExercies;

import java.util.Scanner;

public class Ex04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();
        System.out.println(reversed);
    }
}
