package Exercises.Ex02_DataTypesVariables;

import java.util.Scanner;

public class Ex11_Snowballs_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sampleSize = Integer.parseInt(scanner.nextLine());
        int snowballValueMax = 0;
        String snowballBestFormula = "";

            for (int j = 0; j < sampleSize; j++) {
                int snowballSnow = Integer.parseInt(scanner.nextLine());
                int snowballTime = Integer.parseInt(scanner.nextLine());
                int snowballQuality = Integer.parseInt(scanner.nextLine());
                int snowballValue = (int)Math.pow(((double)snowballSnow / (double)snowballTime), (snowballQuality));

                if (snowballValue > snowballValueMax){
                    snowballValueMax = snowballValue;
                    snowballBestFormula = String.format("%d : %d = %d (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
                }
            }

        System.out.println(snowballBestFormula);
    }
}
