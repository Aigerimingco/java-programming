package Practivce_04_14_2021;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoon, plates, cups, forks,pan, pot, trash can, dish washer";
        String[] arrWords = words.split(", ");
        System.out.println(Arrays.toString(arrWords));

        for(String eachWord: arrWords){
            if(eachWord.contains(" "))
            System.out.println(eachWord);
        }
    }
}
