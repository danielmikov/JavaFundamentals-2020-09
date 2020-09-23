package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nEntries = Integer.parseInt(scanner.nextLine());
        String kegBiggestName = "";
        double kegBiggestVolume = 0;
        //π * r^2 * h

        for (int i = 0; i < nEntries; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * (radius * radius) * height;

            if (kegBiggestVolume < volume) {
                kegBiggestName = name;
                kegBiggestVolume = volume;
            }
        }
        System.out.println(kegBiggestName);
    }
}
