package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

public class Ex09_PadawanEquipment_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //lightsabers belts robes
        //10% more lightsabres, rounded up to the next integer
        //every sixth belt is free
        //The money is enough - it would cost {the cost of the equipment}lv.
        //Ivan Cho will need {neededMoney}lv more.

        // sabresPrice*(studentsCount + 10%) + robesPrice * (studentsCount) + beltsPrice*(studentsCount-freeBelts)
        //1*(3) + 2*(2) + 3*(2) = 13.00

        double budget = Double.parseDouble(scanner.nextLine());
        int groupSize = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double lightsabresNeeded = groupSize + Math.ceil(groupSize * .1);
        int beltsFree = groupSize / 6;

        double balance = budget - (lightsabresNeeded * priceLightsabers) - (groupSize * priceRobes) - ((groupSize - beltsFree) * priceBelts);

        if (budget >= Math.abs(balance)) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", (budget - balance));
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.%n", Math.abs(balance));
        }

    }
}
