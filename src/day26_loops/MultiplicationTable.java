package day26_loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("ERROR: Invalid input");
            return;
        }
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + i * num);
            }

        }

    }
