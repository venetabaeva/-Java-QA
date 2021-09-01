package javaTelerick;
import java.util.Scanner;
/*
Input:  reads  information
Output: prints it back on the console
 */
public class PrintCompanyInformation {
    public static void main(String[] arg) {


        System.out.println("Company name: ");
        Scanner sc = new Scanner(System.in);
        String companyName = sc.nextLine();
        if(companyName.isEmpty()){
            companyName = "(no Company Name)";
        }
        System.out.println("Company address: ");
        String companyAddress = sc.nextLine();
        if(companyAddress.isEmpty()){
            companyAddress = "(no Company Address)";
        }
        System.out.println("Phone number: ");
        String phoneNumber = sc.nextLine();
        if(phoneNumber.isEmpty()){
            phoneNumber = "(no Phone Number)";
        }
        System.out.println("Fax number: ");
        String faxNumber = sc.nextLine();
        if(faxNumber.isEmpty()){
            faxNumber = "(no fax )";
        }
        System.out.println("Web site: ");
        String webSite = sc.nextLine();
        if(webSite.isEmpty()){
            webSite = "(no Web Site)";
        }
        System.out.println("Manager first name : ");
        String managerFirstName = sc.nextLine();
        if(managerFirstName.isEmpty()){
            managerFirstName = "(no Manager first name)";
        }
        System.out.println("Manager last name: ");
        String managerLastName = sc.nextLine();
        if(managerLastName.isEmpty()){
            managerLastName = "(no Manager last name)";
        }
        System.out.println("Manager age: ");
        String managerAge = sc.nextLine();
        if(managerAge.isEmpty()){
            managerAge = "(no Manager age)";
        }
        System.out.println("Manager Phone: ");
        String managerPhone = sc.nextLine();
        if(managerPhone.isEmpty()){
            managerPhone = "(no Manager Phone)";
        }

        System.out.println(companyName+"\n"+"Address: "+companyAddress+"\n"+"Tel. "+phoneNumber+"\n"+"Fax: "+faxNumber+"\n"+"Web site: "+webSite+"\n"+"Manager: "+managerFirstName+""+managerLastName+""+"(age: "+managerAge+", tel. "+managerPhone+")");


    }
}