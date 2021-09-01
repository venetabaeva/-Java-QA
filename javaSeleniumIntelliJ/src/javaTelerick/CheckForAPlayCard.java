package javaTelerick;
/*
Input:
enters a string
Output:
prints “yes”, if it is a valid card sign or “no” otherwise
 */
import java.util.Scanner;

public class CheckForAPlayCard {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        String string =  sc.next();


        switch (string){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes");
                break;
            default:
                System.out.println("no");
                break;
        }
    }
}