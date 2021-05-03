package repl.it;

import java.util.Scanner;

public class patientPortal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstname = scan.next();
        scan.nextLine();
        System.out.println("Enter you last name");
String lastName=scan.next();
scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
         scan.nextLine();//to capture Enter key press
         System.out.println("Enter your street");
         String street = scan.nextLine();
         //continue for city
        System.out.println("Enter your city");
        String city=scan.next();
        scan.nextLine();
        System.out.println("Enter your state");
        String state=scan.next();
        scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        long phonenumber=scan.nextLong();
        scan.nextLine();
        System.out.println("Enter yout personal phone number");
        long personalnumber=scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your height");
        double height=scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        scan.nextLine();
        System.out.println("Are you married?");
        boolean married=scan.nextBoolean();
        scan.nextLine();

    }
}