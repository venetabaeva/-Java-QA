package javaBasicTasks;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a program that finds the prime factors of a given non-prime number list the
		 * factors in ascending order
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				System.out.println(i + " ");
				n = n / i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}
}