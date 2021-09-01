package javaTelerick;
import java.util.Scanner;


public class BiggestOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		        Scanner sc = new Scanner(System.in);
		        double a = Double.parseDouble(sc.nextLine());
		        double b = Double.parseDouble(sc.nextLine());
		        double c = Double.parseDouble(sc.nextLine());
		        double d = Double.parseDouble(sc.nextLine());
		        double e = Double.parseDouble(sc.nextLine());
		        
//		        if (a>=-200 && b>=-200 && c>=-200 && d>=-200 & e>=-200 && a<=200 && b<=200 && c<=200 && d<=200 & e<=200) {
//					 sc.close();}

		        if(a > b && a > c && a > d && a > e)  {
		            System.out.printf("%.0f",a);
		        }
		        else if(b > a && b>c && b>d && b>e ) {
		            System.out.printf("%.0f",b);
		        }
		        else if(c > a && c>b && c>d && c>e ) {
		            System.out.printf("%.0f",c);
		        }
		        else if(d > a && d>b && d>c && d>d ) {
		            System.out.printf("%.0f",d);
		        }
		        else{
		            System.out.printf("%.0f",e);
		        }
		    }

	}


