package javaBasicTasks;

import java.util.Scanner;

public class Arithmetics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * The sum of a and b
		 * The difference when a is subtracted from b
		 * The product of a and b
		 * The remainder when a is divided by b
		 * The result of a powered to b

		 */
		
		Scanner sc = new Scanner(System.in);
        int a =  Integer.parseInt(sc.nextLine());
        int b =  Integer.parseInt(sc.nextLine());
        int sum = a+b;
        int dif = a-b;
        int prod = a*b;
        int rem = a%b;
        int pow = (int) Math.pow(a,b);
        System.out.printf("%d%n%d%n%d%n%d%n%d%n",sum,dif,prod,rem,pow);
        Thread.sleep(5000);
		sc.close();
	}

}
