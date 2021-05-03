package day13_conditional_statements;

import java.util.Scanner;

public class ATMincodeProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("WELCOME TO US BANK\nEnter 4 digit pin code: ");
        int secretPincode=6787;
        int inputPincode=scan.nextInt();

        if(secretPincode==inputPincode) {
            System.out.println("Welcome to your account.\nYou can withdraw. check balance, deposit");
        }else{
            System.out.println("Incorrect pincode! "+inputPincode+ "\nPlease try again.");
        }

    }
}
