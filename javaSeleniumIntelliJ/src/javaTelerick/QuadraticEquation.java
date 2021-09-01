package javaTelerick;
import java.util.Scanner;
/*
Input:reads the coefficients a, b and c of a quadratic equation ax2 + bx + c = 0
Output:  solves it (prints its real roots x1 = (-b - sqrt(D)) / 2a, x2 = (-b + sqrt(D)) / 2a)
Assumed: there always will be one or two real roots (D = b2 - 4ac >= 0)

 */
public class QuadraticEquation {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double firstNumber = Double.parseDouble(sc.next());
        double secondNumber = Double.parseDouble(sc.next());
        double thirdNumber = Double.parseDouble(sc.next());
        double x1, x2;
        double determinant = secondNumber * secondNumber - 4 * firstNumber * thirdNumber;
        x1 = (-secondNumber - Math.sqrt(determinant)) / (2 * firstNumber);
        x2 = (-secondNumber + Math.sqrt(determinant)) / (2 * firstNumber);


        System.out.format("root1 = %.2f and root2 = %.2f", x2 , x1);


    }
}