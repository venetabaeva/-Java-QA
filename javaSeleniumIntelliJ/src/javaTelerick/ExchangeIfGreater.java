package ConditionalStatements;

import java.util.Scanner;

/*
Input:
two double variables a and b
exchanges their values, if the first one is greater than the second one
Output:
print the values a and b, separated by a space.

 */
public class ExchangeIfGreater {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double temp = a;

        if(a>b){
            a=b;
            b=temp;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
