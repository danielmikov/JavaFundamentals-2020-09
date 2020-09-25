package Exercises.Ex03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sequenceLength = 0;
        int sequenceLengthMax = 0;
        int sequenceDigit = 0;

        for (int i = 0; i < numbersInput.length - 1; i++) {
            if (numbersInput[i] == numbersInput[i + 1]) {
                sequenceLength++;
                if (sequenceLength > sequenceLengthMax) {
                    sequenceLengthMax = sequenceLength;
                    sequenceDigit = numbersInput[i];
                }

            } else {
                sequenceLength = 0;
            }
        }
        for (int i = 0; i < sequenceLengthMax + 1; i++) {
            System.out.print(sequenceDigit + " ");
        }
    }
}
