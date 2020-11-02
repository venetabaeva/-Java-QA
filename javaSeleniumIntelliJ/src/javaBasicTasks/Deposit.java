package javaBasicTasks;
import java.util.Scanner;
public class Deposit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Bottle Deposit
		 * Half liter bottles have $0.1 deposit 
		 * One liter bottles have $0.25 deposit
		 * Print the total sum you will earn
		 */

		Scanner sc = new Scanner(System.in);
        int b1 = Integer.parseInt(sc.nextLine());
        int b2 = Integer.parseInt(sc.nextLine());
       

        float r = (float) (b1*0.1 +b2*0.25);
      
        System.out.printf("%.2f",r);
        
        Thread.sleep(5000);
		sc.close();
	}

}
