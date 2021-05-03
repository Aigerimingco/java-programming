package repl.it;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.lastIndexOf(word.charAt(0)));
        }

    }




