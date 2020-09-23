package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex09_SpiceMustFlow_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int harvest = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int harvestTotal = 0;
        boolean keepHarvesting = true;

        while (keepHarvesting) {
            if (harvest >= 100) {
                harvestTotal += harvest - 26;
                harvest -= 10;
                days++;

                if (harvest < 100) {
                    keepHarvesting = false;
                    break;
                }
            } else {
                keepHarvesting = false;
                break;
            }
        }
        harvestTotal -= 26;
        System.out.println(days);
        if (harvestTotal < 0) {
            System.out.println(0);
        } else {
            System.out.println(harvestTotal);
        }
    }
}
