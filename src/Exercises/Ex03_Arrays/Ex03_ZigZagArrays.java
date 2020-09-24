package Exercises.Ex03_Arrays;

import java.util.Scanner;

public class Ex03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nInputs = Integer.parseInt(scanner.nextLine());
        int[] numbers1 = new int[nInputs];
        int[] numbers2 = new int[nInputs];
        int position = 0;
        int switchBetween = 1;

        for (int i = 0; i < numbers1.length; i++) {
            int e1 = scanner.nextInt();
            int e2 = scanner.nextInt();


            if (switchBetween == 1) {
                numbers1[position] = e1;
                numbers2[position] = e2;
                switchBetween++;
            } else {
                numbers1[position] = e2;
                numbers2[position] = e1;
                switchBetween--;
            }
            position++;

        }
        for (int element1 : numbers1) {
            System.out.print(element1 + " ");
        }
        System.out.println();
        for (int element2 : numbers2) {
            System.out.print(element2 + " ");
        }
    }
}
