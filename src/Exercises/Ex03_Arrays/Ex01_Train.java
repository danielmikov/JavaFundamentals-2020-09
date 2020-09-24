package Exercises.Ex03_Arrays;

import java.util.Scanner;

public class Ex01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainLength = Integer.parseInt(scanner.nextLine());
        int[] train = new int[trainLength];
        int passengersTotal = 0;

        for (int i = 0; i < train.length; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            passengersTotal += passengers;
            train[i] = passengers;
        }
        for (int wagon: train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(passengersTotal);

    }
}
