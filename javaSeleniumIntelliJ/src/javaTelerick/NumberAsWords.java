package ConditionalStatements;
/*
Input:converts a number in the range [0…999] to words, corresponding to the English pronunciation
Output:print
 */
import java.util.Scanner;

public class NumberAsWords {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());

        int hundreds = number / 100;
        String hundred = "hundred";
        int tenths;
        if (number > 99) {
            tenths = number % 100;
        } else tenths = number * 1;
        int ones = number % 10;


        if (number == 0) System.out.print("Zero");


        switch (hundreds) {
            case 1:
                System.out.print("one" + " " + hundred);
                break;
            case 2:
                System.out.print("two" + " " + hundred);
                break;
            case 3:
                System.out.print("three" + " " + hundred);
                break;
            case 4:
                System.out.print("four" + " " + hundred);
                break;
            case 5:
                System.out.print("five" + " " + hundred);
                break;
            case 6:
                System.out.print("six" + " " + hundred);
                break;
            case 7:
                System.out.print("seven" + " " + hundred);
                break;
            case 8:
                System.out.print("eight" + " " + hundred);
                break;
            case 9:
                System.out.print("nine" + " " + hundred);
                break;
        }

        if (hundreds >= 1 && tenths >= 1) {
            System.out.print(" and ");
        }



        if (tenths >= 20 && tenths < 30) System.out.print("twenty");
           else if (tenths >= 30 && tenths < 40) System.out.print("thirty");
               else if (tenths >= 40 && tenths < 50) System.out.print("forty");
                  else  if (tenths >= 50 && tenths < 60) System.out.print("fifty");
                       else if (tenths >= 60 && tenths < 70) System.out.print("sixty");
                          else  if (tenths >= 70 && tenths < 80) System.out.print("seventy");
                               else if (tenths >= 80 && tenths < 90) System.out.print("eighty");
                                  else  if (tenths >= 90 && tenths < 100) System.out.print("ninety");

        switch (tenths) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
        }
        if (tenths > 20) {
            switch (ones) {
                case 1:
                    System.out.print(" " + "one");
                    break;
                case 2:
                    System.out.print(" " + "two");
                    break;
                case 3:
                    System.out.print(" " + "three");
                    break;
                case 4:
                    System.out.print(" " + "four");
                    break;
                case 5:
                    System.out.print(" " + "five");
                    break;
                case 6:
                    System.out.print(" " + "six");
                    break;
                case 7:
                    System.out.print(" " + "seven");
                    break;
                case 8:
                    System.out.print(" " + "eight");
                    break;
                case 9:
                    System.out.print(" " + "nine");
                    break;
            }

        }
    }
}