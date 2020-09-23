package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i < end; i++) {
            char print = (char) i;
            System.out.print(print + " ");
        }
        char print = (char) end;
        System.out.println(print);
    }
}