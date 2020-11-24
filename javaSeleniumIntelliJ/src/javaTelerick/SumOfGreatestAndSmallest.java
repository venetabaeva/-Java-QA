package DataTypes;
import java.util.Scanner;
/*
Input:enters 3 numbers (each number will be on a separate/new line)
Output:calculates and prints the sum of the greatest and smallest of them
 */
public class SumOfGreatestAndSmallest {
    public static void main(String[] arg) {

        double sum = 0;

        Scanner sc = new Scanner(System.in);

        double num1  = Double.parseDouble(sc.nextLine());
        double num2  = Double.parseDouble(sc.nextLine());
        double num3  = Double.parseDouble(sc.nextLine());

        double compareNumbersMax = Math.max(Math.max(num1,num2),num3);
        double compareNumbersMin = Math.min(Math.min(num1,num2),num3);

        sum +=compareNumbersMax+compareNumbersMin;
        System.out.printf("%.0f", sum);
    }
}