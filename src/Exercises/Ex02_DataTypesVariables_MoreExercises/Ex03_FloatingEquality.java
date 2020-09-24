package Exercises.Ex02_DataTypesVariables_MoreExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.nextLine());
        BigDecimal b = new BigDecimal(scanner.nextLine());
        BigDecimal eps = new BigDecimal(1000000);
        BigDecimal aRounded = a.multiply(eps);
        BigDecimal bRounded = b.multiply(eps);
        int aInteger = aRounded.intValue();
        int bInteger = bRounded.intValue();

        if (aInteger == bInteger) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
