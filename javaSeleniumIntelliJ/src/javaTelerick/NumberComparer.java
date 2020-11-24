package DataTypes;

import java.util.Scanner;
/*
Input:gets two numbers from the console
Output:prints the greater of them without if statements
 */

public class NumberComparer {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double firstNumber = Double.parseDouble(sc.next());
        double secondNumber = Double.parseDouble(sc.next());
        double compareNumbers = Math.max(firstNumber,secondNumber);

        System.out.printf("%.0f",compareNumbers);

    }

}
