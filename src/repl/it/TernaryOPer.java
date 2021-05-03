package repl.it;
import java.util.Scanner;
public class TernaryOPer {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
     //   System.out.println("Enter number: ");
     //   int x= scan.nextInt();
     //   String display=(x>=5) ? "positive" : "negative";
     //   System.out.println(x);

                //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
                // Variables are already declared and given
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number1:");
                int num1 = scan.nextInt();
                System.out.println("Enter number2:");
                int num2 = scan.nextInt();

                //WRITE YOUR CODE HERE:
                int result= (num1<=num2) ? num2 : num1;
                System.out.println(result);





            }
        }


