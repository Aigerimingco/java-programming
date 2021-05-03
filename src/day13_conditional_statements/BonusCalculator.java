package day13_conditional_statements;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter sales amount: ");
        double bonus=20;
        double salesAmmount=scan.nextDouble();
        if(salesAmmount<=1000){
            bonus=50;
        }else {
            bonus = 100;
        }
        System.out.println("Great job, you are qualifies for $"+bonus+" bonus");

    }
}
