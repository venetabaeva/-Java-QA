package javaTelerick;

/*
 * Input:
 * dogs reach adulthood in approximately 2 human years
 * count the first two HY as 10 DY each and then count the remaining HY as 4 DY each.
 * a program that correctly converts human years (HY) to dog years (DY)
 * On the first line, you will receive ~HY~ - the number of human years.

 * Output:
 * On the only line of output, print ~DY~ - the number of dog years.
 */
import java.util.Scanner;

public class DogYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    int humanYears = Integer.parseInt(input);
	    int dogYears = 0;

	    if(humanYears<=2){
	        dogYears = humanYears*10;
	    }else{
	        dogYears = 20 + (humanYears - 2)*4;
	    }
	    System.out.print(dogYears);


	}

}
