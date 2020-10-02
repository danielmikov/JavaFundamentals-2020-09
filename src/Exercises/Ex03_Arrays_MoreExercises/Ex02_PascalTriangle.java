package Exercises.Ex03_Arrays_MoreExercises;

import java.util.Scanner;

public class Ex02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int triangleSize = input * 2 + 3;
        int midpoint = triangleSize / 2 + 1;

        int[] first = new int[triangleSize];
        first[midpoint - 1] = 1;

        int[] second = new int[triangleSize];
        System.out.println(1);

        for (int h = 0; h < input-1; h++) {
            for (int i = 1; i < triangleSize - 1; i++) {
                second[i] = first[i - 1] + first[i + 1];
            }
            for (int j : second) {
                if (j != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            System.arraycopy(second, 0, first, 0, triangleSize);
        }
    }
}
