package day24_loops;

public class Alphabet {
    public static void main(String[] args) {


        char letter = 'z';

        while (letter >= 'a') {
            System.out.print(letter + " ➡️ ");
            letter--;
        }

        System.out.println();
        char letter1 = 'a';

        while (letter1 >= 'z') {
            System.out.print(letter + " ➡️ ");
            letter++;

        }

    }
}