package Exercises.Ex03_Arrays;

import java.util.Scanner;

public class Ex02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String[] array1 = input1.split(" ");
        String[] array2 = input2.split(" ");

        for (String element2: array2) {
            for (String element1: array1) {
                if (element1.equals(element2)){
                    System.out.print(element1 + " ");
                }
            }
        }

    }
}
