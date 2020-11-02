package javaBasicTasks;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*Bottle Deposit
		 * Half liter bottles have $0.1 deposit 
		 * One liter bottles have $0.25 deposit
		 * Print the total sum you will earn
		 */
		
		  	Scanner sc = new Scanner(System.in);
	        double b1 = Double.parseDouble(sc.nextLine());
	        double t1 = 10.0/100.0;
	        int r = (int) (t1*b1+b1);

	        System.out.print(r);

	        Thread.sleep(5000);
			sc.close();
	}

}
