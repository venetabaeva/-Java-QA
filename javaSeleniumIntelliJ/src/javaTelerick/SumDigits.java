package javaTelerick;
import java.util.Scanner;
/*
Input:On the first line, you will receive the four-digit number N
Output:On the only line of output, print the sum of digits
Constraints: 1000 <= N <= 9999
 */
public class SumDigits {
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        char firstNumber = str1.charAt(0);
        char secondNumber = str1.charAt(1);
        char thirdNumber = str1.charAt(2);
        char forthNumber = str1.charAt(3);


        int firstDigit = Integer.parseInt(String.valueOf(firstNumber));
        int secondDigit = Integer.parseInt(String.valueOf(secondNumber));
        int thirdDigit = Integer.parseInt(String.valueOf(thirdNumber));
        int forthDigit = Integer.parseInt(String.valueOf(forthNumber));

        int sumDigits = firstDigit + secondDigit +thirdDigit+forthDigit;

        System.out.println(sumDigits);

    }
}
