package day09_scanner_practice;
import  java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How old are you?");
        String age=scan.next();

        System.out.println(age+" Thats great age!");

    }
}
