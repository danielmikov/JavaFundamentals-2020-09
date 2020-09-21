package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0;

        if (groupType.equalsIgnoreCase("Students")) {
            if (day.equalsIgnoreCase("Friday")) {
                totalPrice = groupSize * 8.45;
            } else if (day.equalsIgnoreCase("Saturday")) {
                totalPrice = groupSize * 9.8;
            } else if (day.equalsIgnoreCase("Sunday")) {
                totalPrice = groupSize * 10.46;
            }
            if (groupSize > 29) {
                totalPrice = totalPrice - (totalPrice * .15);
            }
        }

        if (groupType.equalsIgnoreCase("Business")) {
            if (groupSize >= 100) {
                groupSize = groupSize - 10;
            }
            if (day.equalsIgnoreCase("Friday")) {
                totalPrice = groupSize * 10.9;
            } else if (day.equalsIgnoreCase("Saturday")) {
                totalPrice = groupSize * 15.6;
            } else if (day.equalsIgnoreCase("Sunday")) {
                totalPrice = groupSize * 16;
            }
        }

        if (groupType.equalsIgnoreCase("Regular")) {
            if (day.equalsIgnoreCase("Friday")) {
                totalPrice = groupSize * 15;
            } else if (day.equalsIgnoreCase("Saturday")) {
                totalPrice = groupSize * 20;
            } else if (day.equalsIgnoreCase("Sunday")) {
                totalPrice = groupSize * 22.5;
            }
            if (groupSize>= 10 && groupSize<=20) {
                totalPrice = totalPrice - (totalPrice+0.05);
            }
        }

        System.out.printf("Total price: %.2f%n", totalPrice);
    }

}
