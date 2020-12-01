package ConditionalStatements;

import java.util.Scanner;
/*
Input:
enters 3 real numbers
Output:
prints them sorted in descending order
*/
public class SortThreeNumbersWithNestedIfs {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%.1f %.1f %.1f", a, b, c);
            } else {
                System.out.printf("%.1f %.1f %.1f", a, c, b);
            }
        }
        else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%.1f %.1f %.1f", b, a, c);
            } else {
                System.out.printf("%.1f %.1f %.1f", b, c, a);
            }
        }
        else if (c > a && c > b) {
            if (a > b) {
                System.out.printf("%.1f %.1f %.1f", c, a, b);
            } else {
                System.out.printf("%.1f %.1f %.1f", c, b, a);
            }
        }
    }
}
