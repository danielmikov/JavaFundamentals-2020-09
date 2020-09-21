package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex10_RageExpenses_Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //headset, mouse, keyboard, display
        //Every second -> headset
        //Every third -> mouse.
        //mouse & headset -> keyboard
        //2nd Keyboard -> display

        //"Rage expenses: {expenses} lv."

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());
        int lostHeadsets = 0;
        int lostMouse = 0;
        int lostKeyboards = 0;
        int lostDisplay = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                lostHeadsets++;
            }
            if (i % 3 == 0) {
                lostMouse++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                lostKeyboards++;

                if (lostKeyboards % 2 == 0) {
                    lostDisplay++;
                }
            }
        }
        Double cost = (lostDisplay * priceDisplay) + (lostHeadsets * priceHeadset) + (lostKeyboards * priceKeyboard) + (lostMouse * priceMouse);
        System.out.printf("Rage expenses: %.2f lv.", cost);
    }
}
