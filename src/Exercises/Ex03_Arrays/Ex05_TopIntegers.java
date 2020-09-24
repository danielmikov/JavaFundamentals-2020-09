package Exercises.Ex03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < input.length - 1; i++) {
            int currentNumber = input[i];
            boolean isBiggest = true;
            for (int j = i + 1; j < input.length; j++) {
                if (currentNumber <= input[j]) {
                    isBiggest = false;
                    break;
                }
            }
            if (isBiggest) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(input[input.length - 1]);

    }

}
