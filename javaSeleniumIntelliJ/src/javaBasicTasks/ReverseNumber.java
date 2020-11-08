package javaBasicTasks;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * a method that reverses the digits of a given decimal number
		 */
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int i = Integer.parseInt(s);
//		int iiR = 0;
//		
//		while(i != 0) {
//            int ii = i % 10;
//            iiR = iiR * 10 + ii;
//            i /= 10;
//        }
//
//        System.out.println(iiR);
        
        //String Mirroring 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss = s.toString();
		String ssR = new StringBuffer(ss).reverse().toString();

		System.out.println(ssR);   
	}
	

}
