package Exercises.Ex03_Arrays;

import java.util.Scanner;

public class Ex04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");
        String[] newString = new String[inputString.length];
        int shift = (Integer.parseInt(scanner.nextLine())) % (inputString.length);
        int position = 0;

        if (shift > 0){
            for (int i = shift; i < inputString.length; i++) {
                newString[position] = inputString[i];
                position++;
            }
            for (int i = 0; i < shift; i++) {
                newString[position] = inputString[i];
                position++;
            }
            for (String e : newString) {
                System.out.print(e + " ");
            }
        }else{
            for (String e : inputString) {
                System.out.print(e + " ");
            }
        }
    }
}
