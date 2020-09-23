package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int additions = Integer.parseInt(scanner.nextLine());
        int waterTankCapacity = 255;
        int waterTotal = 0;

        for (int i = 0; i < additions; i++) {
            int waterAdded = Integer.parseInt(scanner.nextLine());

            if ((waterTotal + waterAdded) <= waterTankCapacity ){
                waterTotal += waterAdded;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(waterTotal);


    }
}
