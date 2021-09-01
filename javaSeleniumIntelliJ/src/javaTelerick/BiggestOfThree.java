package javaTelerick;
import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	
		 Scanner sc = new Scanner(System.in);
				 
				 
				 float n1 = Float.parseFloat(sc.nextLine());
				 float n2 = Float.parseFloat(sc.nextLine());
				 float n3 = Float.parseFloat(sc.nextLine());
				
				 

				 if (n1>=-200 && n2>=-200 && n3>=-200 && n1<=200 && n2<=200 && n3<=200) {
					 sc.close();}
				 
				 if(n1 >=n2 && n1 >= n3 )
			        {
					 
			            System.out.printf("%.0f",n1);
			        }
			        else if(n2 >= n1 && n2>= n3 )
			        {
			        
			        	System.out.printf("%.0f",n2);
			        }
			        else 
			        {
			     
			            System.out.printf("%.0f",n3);
			            
			        }
				 
				 }
				
			}





