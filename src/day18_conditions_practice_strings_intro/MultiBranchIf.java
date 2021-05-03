package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scan =new Scanner(System.in);
        int number= scan.nextInt();
        if(number>=0){
            System.out.println(number+ " is positive");
        }else if(number<0){
            System.out.println(number+ " is negative");
        }else{
            System.out.println(number+" is zero");
        }
    }
}
