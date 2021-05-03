package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        System.out.println("Enter a number to count until");
        Scanner scan =new Scanner(System.in);
        int numberToStop= scan.nextInt();
       int  start=1;
        while(start<=numberToStop){
            System.out.print(start+" ");
            start++;
        }
      //  System.out.println(" ");
    }
}
