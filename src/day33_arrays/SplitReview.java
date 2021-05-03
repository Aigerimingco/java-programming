package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "janar";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length - 1;
        System.out.println("countOfA = " + countOfA);


        System.out.println("Split with empty String");
        String word1 = "java";
        String[] array1 = word1.split("");
        System.out.println("split method = " + Arrays.toString(array1));

        String word2 = "java1html2sql3ml5";
        String[] strArr = word2.split("\\d");
        System.out.println(Arrays.toString(strArr));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("strArr = " + word2);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        }
    }
