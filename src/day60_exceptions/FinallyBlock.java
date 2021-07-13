package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scann= new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num = scann.nextInt();
            System.out.println("you entered " + num);
        }catch (InputMismatchException e){
            System.out.println("you entered invalid number");
        }finally {


            scann.close();
            System.out.println("Finally block - runs always");
        }
    }
}
