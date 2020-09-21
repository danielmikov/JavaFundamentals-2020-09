package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //accept money until "Start"
        //coins accepted: 0.1, 0.2, 0.5, 1, and 2
        //Cannot accept {money} %.2f
        //"Nuts", "Water", "Crisps", "Soda", "Coke"
        // 2.0,     0.7,      1.5,    0.8,    1.0
        //“Invalid product”.
        //"Sorry, not enough money"
        //"Purchased {product name}"
        //"End"
        // after end "Change: {money left}"
        boolean started = false;
        double sum = 0;
        while (!started) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("start")) {
                started = true;
            } else {
                double coinInput = Double.parseDouble(input);
                if (coinInput == 0.1 || coinInput == 0.2 || coinInput == 0.5 || coinInput == 1 || coinInput == 2) {
                    sum += Double.parseDouble(input);
                } else {
                    System.out.println(String.format("Cannot accept %.2f", coinInput));
                }
            }
        }
        boolean endTransaction = false;
        while (!endTransaction) {
            String inputProduct = scanner.nextLine();
            switch (inputProduct) {
                case "Nuts":
                    if (sum >= 2) {
                        System.out.println("Purchased Nuts");
                        sum -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.println("Purchased Water");
                        sum -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.println("Purchased Crisps");
                        sum -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.println("Purchased Soda");
                        sum -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        System.out.println("Purchased Coke");
                        sum -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "End":
                    endTransaction = true;
                    System.out.printf("Change: %.2f", sum);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
    }
}
