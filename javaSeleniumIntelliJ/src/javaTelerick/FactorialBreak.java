package javaTelerick;

import java.util.Scanner;

public class FactorialBreak {
	
	static Scanner sc;
	
		public static void main(String[] args) {
			
        sc = new Scanner(System.in);

        System.out.println("n = ");
        int n = sc.nextInt();

        System.out.print("n! = ");

        long factorial = 1;

        // Perform an infinite loop
        while (true) {
            System.out.print(n);
            if (n == 1) {
                break;
            }

            System.out.print(" * ");
            factorial = factorial * n;
            n--;
        }
        System.out.printf(" = %s", factorial);
    }
}
