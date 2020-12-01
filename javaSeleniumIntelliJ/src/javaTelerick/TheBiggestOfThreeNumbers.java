package ConditionalStatements;

import java.util.Scanner;
/*
Input:finds the biggest of three numbers
Output:print  the biggest of three numbers
 */
public class TheBiggestOfThreeNumbers {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if(a > b && a > c)
        {
            System.out.printf("%.1f",a);
        }
        else if(b > a && b>c)
        {
            System.out.printf("%.1f",b);
        }
        else
        {
            System.out.printf("%.1f",c);
        }
    }
}
