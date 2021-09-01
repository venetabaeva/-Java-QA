package javaTelerick;

import java.util.Scanner;

/*
 * Input:
Write a program that determines the color of a chessboard square based on its Label and Rank
Labels have values from a to h
Ranks have values from 1 to 8
On the first line, you will receive L - the label
On the second line, you will receive R - the rank
 * Output:
On the only line of output, print light or dark, based on your calculations
 */

public class ChessSquareColor {

	static Scanner sc;
	static String input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				sc = new Scanner(System.in);
				String l = sc.nextLine();
				int r = Integer.parseInt(sc.nextLine());


				switch (l) {
				case "a":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("dark");
					} else {
						System.out.println("light");
					}
					break;
				case "b":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("light");
					} else {
						System.out.println("dark");
					}
					break;
				case "c":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("dark");
					} else {
						System.out.println("light");
					}
					break;
				case "d":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("light");
					} else {
						System.out.println("dark");
					}
					break;
				case "e":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("dark");
					} else {
						System.out.println("light");
					}
					break;	
				case "f":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("light");
					} else {
						System.out.println("dark");
					}
					break;
				case "g":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("dark");
					} else {
						System.out.println("light");
					}
					break;
				case "h":
					if (r == 1 || r == 3 || r == 5 || r == 7) {
						System.out.println("light");
					} else {
						System.out.println("dark");
					}
					break;
				}

		
		
	}

}
