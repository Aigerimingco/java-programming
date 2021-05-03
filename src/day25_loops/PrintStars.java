package day25_loops;

public class PrintStars {
    public static void main(String[] args) {


        for (int s = 0; s <= 15; s++) {
            System.out.print(" ⭐ *");
        }

        System.out.println();
        String myStars = "";
        for (int s = 0; s <= 13; s++) {
            myStars+="⭐ * ";

        }
        System.out.println("my stars= " + myStars);
    }

}