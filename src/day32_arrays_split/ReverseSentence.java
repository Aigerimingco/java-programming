package day32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String[] reverse = word.split(" ");
        System.out.println(Arrays.toString(reverse));
        String reversed = "";
        for (int i = reverse.length - 1; i >= 0; i--) {
            // System.out.print(reverse[i]+" ");
            reversed += reverse[i] + " ";
        }
        System.out.println("word =" + word);
        System.out.println("reversed = " + reversed.trim());
        String word1 = "java";
        String[] letters = word1.split("");
        System.out.println(Arrays.toString(letters));
        
    }
}
