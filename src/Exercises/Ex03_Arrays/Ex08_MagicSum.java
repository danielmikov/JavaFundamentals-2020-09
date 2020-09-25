package Exercises.Ex03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberMagic = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == numberMagic) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
