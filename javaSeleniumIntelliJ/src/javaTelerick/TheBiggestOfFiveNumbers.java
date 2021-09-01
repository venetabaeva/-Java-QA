package javaTelerick;

import java.util.Scanner;

/*
Input:
enters 5 numbers (each number will be on a separate/new line)
Output:
calculates and prints their sum
 */

public class TheBiggestOfFiveNumbers {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        double e = Double.parseDouble(sc.nextLine());

        if(a > b && a > c && a > d && a > e)
        {
            System.out.printf("%.1f",a);
        }
        else if(b > a && b>c && b>d && b>e )
        {
            System.out.printf("%.1f",b);
        }else if(c > a && c>b && c>d && c>e )
        {
            System.out.printf("%.1f",c);
        }else if(d > a && d>b && d>c && d>d )
        {
            System.out.printf("%.1f",d);
        }
        else
        {
            System.out.printf("%.1f",e);
        }
    }

}
