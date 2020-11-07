package javaBasicTasks;

import java.util.Scanner;

public class PrintDeckCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  reads a card sign(as a string) 
 *  generates and prints all possible cards from a standard deck of 52 cards up to the card with the given sign(without the jokers)
 *  card faces should start from 2 to A(10 is 10)
 *  clubs, diamonds, hearts and spades.
 */
		
		
		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
         int number = 0;;
         
           switch(s) {
             case "J": number = 11; break;
             case "Q": number = 12; break;
             case "K": number = 13; break;
             case "A": number = 14; break;
             default: number = Integer.parseInt(s); 
             break;
           }
         for (int i =2; i <=number; i++)
          {
              String ss = "";
             switch(i) {
                 case 11: ss = "J"; break;
                 case 12: ss = "Q"; break;
                 case 13: ss = "K"; break;
                 case 14: ss = "A"; break;
             default: ss = Integer.toString(i); break;
             }

             System.out.println((ss  + " of spades" + " "+ ss  + " of clubs" + " "+ ss  +" of hearts" + " "+ ss +" of diamonds"));
          }
       }
}


