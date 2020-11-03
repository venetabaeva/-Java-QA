package javaBasicTasks;

import java.util.Scanner;

public class CompareNumbersNestedIfs {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
			
			
		 int n1 = Integer.parseInt(sc.nextLine());
		 int n2 = Integer.parseInt(sc.nextLine());
		 int n3 = Integer.parseInt(sc.nextLine());
//		 int l=0,s=0,m=0; 2nd option 
		 
		 
		 
		 final int l = n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3;
		 final int s = n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3;
		 final int m = n1 != l && n1 != s ? n1 : n2 != l && n2 != s ? n2 : n3;
		 System.out.printf("%d %d %d", l, m, s);
		 }
		 

//	part of 2nd option 	 
//		 if ((n1>=n2)&&(n1>=n3))
//		        l=n1;
//		 if((n2>=n1)&&(n2>=n3))
//		        l=n2;
//		 if((n3>=n1)&&(n3>=n2))
//		        l=n3;
//		 
//		 
//		 if ((n1<=n2)&&(n1<=n3))
//		        s=n1;
//		 if ((n2<=n1)&&(n2<=n3))
//		        s=n2;
//		 if((n3<=n1)&&(n3<=n2))
//		        s=n3;
//		        m=(n1+n2+n3)-(l+s);
//		        
//		        System.out.printf("%d %d %d",l,m,s);
		
	}


