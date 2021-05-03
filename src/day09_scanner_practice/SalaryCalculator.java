package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyrate= scan.nextDouble();
        double weeklypay=hourlyrate*40;
        double monthlypay=weeklypay*52/12;
        double annualpay=monthlypay*12;
        System.out.println("Weekly pay: $" + weeklypay);
        System.out.println("Monthly pay: $"+ monthlypay);
        System.out.println("Annual pay: $"+ annualpay);


    }
}
