package javaBasicTasks;
import java.util.Scanner;
public class RecatangleArea {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*Rectangle Area
		 * read a width and a height from the console
		 * calculate the area of the rectangle 
		 * print it on the console
		 */
		
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();//input1
		String line2 = sc.nextLine();//input2

		int w = Integer.parseInt(line1);
		int h = Integer.parseInt(line2);

		int r = w*h;

		System.out.print(r);
		
		Thread.sleep(5000);
		sc.close();
		
		
	}

}
