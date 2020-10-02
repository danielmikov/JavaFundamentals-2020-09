package Exercises.Ex04_Methods;

import java.util.Scanner;

public class Ex01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 2; i++) {
            smallest = getSmallest(scanner, smallest);
        }

        print(smallest);
    }

    private static int getSmallest(Scanner scanner, int smallest) {
        int newInt = Integer.parseInt(scanner.nextLine());
        if (smallest >newInt){
            smallest = newInt;
        }
        return smallest;
    }

    private static void print(int smallest) {
        System.out.println(smallest);
    }
}
