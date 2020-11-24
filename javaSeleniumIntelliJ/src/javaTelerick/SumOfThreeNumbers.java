package DataTypes;

import java.util.Scanner;
/*
Input: reads 3 int numbers
Output: prints their sum
 */
public class SumOfThreeNumbers {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double num1  = Double.parseDouble(sc.next());
        double num2  = Double.parseDouble(sc.next());
        double num3  = Double.parseDouble(sc.next());
        double result = num1 + num2 + num3;

        System.out.printf("%.0f", result);
    }
}