package DataTypes;
import java.util.Scanner;

/*
Input:enters 5 numbers (each number will be on a separate/new line)
Output:calculates and prints their sum
 */
public class SumOfFiveNumbers {
    public static void main(String[] arg) {

        double sum = 0;

        Scanner sc = new Scanner(System.in);

        double num1  = Double.parseDouble(sc.nextLine());
        double num2  = Double.parseDouble(sc.nextLine());
        double num3  = Double.parseDouble(sc.nextLine());
        double num4  = Double.parseDouble(sc.nextLine());
        double num5  = Double.parseDouble(sc.nextLine());

        sum +=num1+num2+num3+num4+num5;
        System.out.printf("%.0f", sum);
    }
}
