package javaTelerick;

import java.util.Scanner;
/*
 * Input: 
Write a program that displays the name of the season associated with a given date and month. 
Spring	March 20
Summer	June 21
Autumn	September 22
Winter	December 21
On the first line, you will receive the month as a string
On the second line, you will receive the date as a number
 * Output: 
On the only line of output, print the name of the season in pascal case
 */

public class GuessTheSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		int d = Integer.parseInt(sc.nextLine());
		

		switch (m) {
		case "January":
			if (d <= 31 || d >= 1) {
				System.out.println("Winter");
			}
			break;
		case "February":
			if (d <= 28 || d >= 1) {
				System.out.println("Winter");
			}
			break;
		case "March":
			if (d < 20 && d >= 1) {
				System.out.println("Winter");
			} else if (d <= 31 && d >= 20){
				System.out.println("Spring");
			}
			break;
		case "April":
			if (d <= 30 || d >= 1) {
				System.out.println("Spring");
			}
			break;
		case "May":
			if (d <= 31 || d >= 1) {
				System.out.println("Spring");
			}
			break;
		case "June":
			if (d < 21 && d >=1) {
				System.out.println("Spring");
			} else if (d <= 30 && d >=21){
				System.out.println("Summer");
			}
			break;
		case "July":
		case "August":
			if (d <= 31 || d >= 1) {
				System.out.println("Summer");
			}
			break;
		case "September":
			if (d < 22 && d >= 1) {
				System.out.println("Summer");
			} else if (d <= 30 && d >= 22) {
				System.out.println("Autumn");
			}
			break;
		case "October":
			if (d <= 31 || d >= 1) {
				System.out.println("Autumn");
			}
			break;
		case "November":
			if (d <= 30 || d >= 1) {
				System.out.println("Autumn");
			}
			break;
		case "December":
			if (d < 21 && d >= 1) {
				System.out.println("Autumn");
			} else if (d <= 31 && d >= 21){
				System.out.println("Winter");
			}
			break;
		}

	}

}
