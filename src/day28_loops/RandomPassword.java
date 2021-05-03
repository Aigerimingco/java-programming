package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!!@$%^&*";
String password= "";
        Random random = new Random();
        for (int i = 1; i <= 8; i++) {
            int index= random.nextInt(71);
            password+=source.charAt(index);
            System.out.print(source.substring(index, index+1));
           // System.out.println(random.nextInt(source.length()));
        }

        System.out.println("\nYour password = " +password);
    }
}