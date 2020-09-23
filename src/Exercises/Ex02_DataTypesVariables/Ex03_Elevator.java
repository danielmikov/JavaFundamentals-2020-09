package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nPeople = Double.parseDouble(scanner.nextLine());
        double nCapacity = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", Math.ceil(nPeople/nCapacity));

    }
}
