package repl.it;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String number1 = scan.nextLine();
        double score1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String number2 = scan.nextLine();
        double score2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String number3 = scan.nextLine();
        double score3 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String number4 = scan.nextLine();
        double score4 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String number5 = scan.nextLine();
        double score5 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Summary: " + number1 + " - " + score1 + ", " + number2 + " - " + score2 + ", " + number3 + " - " + score3 + ", " + number4 + " - " + score4 + ", " + number5 + " - " + score5 + ", ");
        Double totalscore = (score1 + score2 + score3 + score4 + score5) / 5;
        System.out.println("Your average score is: " + totalscore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
    }
}


