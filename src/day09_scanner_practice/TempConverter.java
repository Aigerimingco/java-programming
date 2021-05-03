package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("***** F to C Converter *****");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheit=scan.nextDouble();
        double TempInCelsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit +" F in Celsius: " + TempInCelsius);



    }
}
