package javaTelerick;
/*
Input:
applies bonus score to given score in the range [1…9]
Output:
Print score
 */
import java.util.Scanner;

public class BonusScore {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());


        if(1<=a && a<=3){
            double bonus =10;
            double aBonus = a*bonus;
            System.out.print(aBonus);
        }else if(4<=a && a<=6){
            double bonus =100;
            double aBonus = a*bonus;
            System.out.print(aBonus);
        }else if(7<=a && a<=9){
            double bonus =1000;
            double aBonus = a*bonus;
            System.out.print(aBonus);
        }else if(a<=0 || a>9){
            String noBonus= "invalid score";
            System.out.print(noBonus);
        }


    }
}
