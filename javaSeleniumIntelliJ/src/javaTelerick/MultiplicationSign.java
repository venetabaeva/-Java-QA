package javaTelerick;

import java.util.Scanner;
/*
Input:
write a program
a sequence of if operators
Output:
shows the sign (+, - or 0) of the product of three real numbers
 */

public class MultiplicationSign {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if (a>0 && b>0 && c>0) {
            System.out.print("+");
        } else if (a<0 && b<0 && c>0) {
            System.out.print("+");
        } else if (a==0 || b==0 || c==0) {
            System.out.print("0");
        } else {
            System.out.print("-");
        }
    }
}
