package ConditionalStatements;

import java.util.Scanner;
/*
Input:
depending on the user’s choice, inputs an int, double or string variable
If the variable is int or double, the program increases it by one
If the variable is a string, the program appends * at the end
Output:print
 */
public class PlayWithIntDoubleAndString {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a type: ");
        String string =  sc.next();

        switch (string){
            case "1":
                System.out.println("Please enter an integer:");
                int caseOne =  Integer.parseInt(sc.next());
                caseOne++;
                System.out.println(caseOne);
                break;
            case "2":
                System.out.println("Please enter a double:");
                double caseTwo =  Double.parseDouble(sc.next());
                caseTwo++;
                System.out.println(caseTwo);
                break;
            case "3":
                System.out.println("Please enter a string:");
                String caseThree = sc.next();
                System.out.println(caseThree +"*");
                break;
        }

    }
}
