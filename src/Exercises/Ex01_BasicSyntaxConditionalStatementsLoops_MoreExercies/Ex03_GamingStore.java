package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops_MoreExercies;

import java.util.Scanner;

public class Ex03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //OutFall 4//$39.99
        //CS: OG//$15.99
        //Zplinter Zell//$19.99
        //Honored 2//$59.99
        //RoverWatch//$29.99
        //RoverWatch Origins Edition//$39.99
        //keep bying games until "Game Time" + "Total spent: $89.98. Remaining: $30.02"
        //Invalid selection = "Not Found"
        //Whenever 0$ end program + "Out of money!"
        //when not enough, "Too Expensive"

        double availableFunds = Double.parseDouble(scanner.nextLine());
        double balance = availableFunds;
        boolean isGameTime = false;

        while (!isGameTime) {

            String input = scanner.nextLine();

            switch (input) {
                case "Game Time":
                    System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (availableFunds - balance), balance);
                    isGameTime = true;
                    break;
                case "OutFall 4":
                    if (balance >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        balance -= 39.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        System.out.println("Bought CS: OG");
                        balance -= 15.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        balance -= 19.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (balance >= 59.99) {
                        System.out.println("Bought Honored 2");
                        balance -= 59.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        balance -= 29.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        balance -= 39.99;
                        if (balance == 0){
                            System.out.println("Out of money!");
                            isGameTime = true;
                            break;
                        }
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
        }
    }
}
