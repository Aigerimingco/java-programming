package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Fist word = " + words[0]);
        System.out.println("Second word = " + words[1]);
        System.out.println("Third word = " + words[2]);


        System.out.println(Arrays.toString(words));

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] number = googleResult.split(" ");
        System.out.println("Count = "+ number[1]);
        System.out.println("Seconds = "+number[3].replace("(",""));
        System.out.println("Seconds = "+number[3].substring(1));
    }
}
