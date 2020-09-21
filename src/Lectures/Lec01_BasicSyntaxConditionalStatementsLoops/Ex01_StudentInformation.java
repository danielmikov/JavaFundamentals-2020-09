// %n - new line
// %c – formats char
// %C – formats char in CAPS
// %s – formats strings
// %S – formats strings in CAPS
// %d – formats decimal integers
// %f – formats the floating-point numbers
// %.2f - formats the floating-point numbers and specify 2decimals

package Lectures.Lec01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Ex01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade );
    }
}
