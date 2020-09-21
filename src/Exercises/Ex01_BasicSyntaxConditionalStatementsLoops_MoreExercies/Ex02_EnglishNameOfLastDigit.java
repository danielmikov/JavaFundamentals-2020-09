package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops_MoreExercies;

import java.util.Scanner;

public class Ex02_EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = (Integer.parseInt(scanner.nextLine())) % 10;

        switch (numberInput){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }
}
