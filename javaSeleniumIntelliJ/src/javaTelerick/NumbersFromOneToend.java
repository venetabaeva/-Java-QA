package javaTelerick;

/*
 * Input:prints all the numbers from 1 to N inclusive
 * Output:a single line, separated by a whitespace.
 */
import java.util.Scanner;

public class NumbersFromOneToend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner sc = new Scanner(System.in);
		  int N = Integer.parseInt(sc.nextLine());
		  
		  for (int i = 1;i <= N; i++) {
				System.out.printf(" %d ",i);
		  
	}

	}
}
