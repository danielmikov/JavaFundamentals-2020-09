package Exercises.Ex03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_SumOfEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumLeft = 0;
        int sumRight = 0;
        boolean hasNoBiddle = true;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                sumLeft += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                hasNoBiddle = false;
                break;
            }
            sumLeft = 0;
            sumRight = 0;
        }
        if (hasNoBiddle) {
            System.out.println("no");
        }
    }
}
