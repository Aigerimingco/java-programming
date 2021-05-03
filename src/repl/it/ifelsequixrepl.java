package repl.it;
import java.util.Scanner;
public class ifelsequixrepl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        //WRITE YOUR CODE HERE:
        if (a <= b) {
            System.out.println(b + " is greater");
        }else{
            if(a>=b){
                System.out.println(a+" is greater");
            }
    }



    }
}
