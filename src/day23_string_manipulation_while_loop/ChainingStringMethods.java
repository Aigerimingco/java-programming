package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word="woo   den spo   on";
        System.out.println(word.toUpperCase().toLowerCase().length());


        System.out.println(word.replace(" ","").toUpperCase());
       // System.out.println(word);

        String city="chicago";
        System.out.println(city.substring(0,1).toUpperCase()+ city.substring(1));
    }
}
