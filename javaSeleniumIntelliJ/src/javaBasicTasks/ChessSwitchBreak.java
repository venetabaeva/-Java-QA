package javaBasicTasks;

import java.util.Scanner;

public class ChessSwitchBreak {
	static Scanner sc;
	static String input;

/*
 * determines the color of a chessboard square based on its Label and Rank
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		String l = sc.nextLine();
		int r = Integer.parseInt(sc.nextLine());

		switch (l) {
		case "a":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("black");
			} else {
				System.out.println("white");
			}
			break;
		case "b":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("white");
			} else {
				System.out.println("black");
			}
			break;
		case "c":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("black");
			} else {
				System.out.println("white");
			}
			break;
		case "d":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("white");
			} else {
				System.out.println("black");
			}
			break;
		case "e":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("black");
			} else {
				System.out.println("white");
			}
			break;	
		case "f":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("white");
			} else {
				System.out.println("black");
			}
			break;
		case "g":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("black");
			} else {
				System.out.println("white");
			}
			break;
		case "h":
			if (r == 1 || r == 3 || r == 5 || r == 7) {
				System.out.println("white");
			} else {
				System.out.println("black");
			}
			break;
		}

	}

}
