package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);
        for (String each : wordsArray) {

            System.out.println(each);
            String sentence = "today I am coding java arrays";

            String[] wordsInSentence = sentence.split(" ");
            System.out.println("first word= " + wordsInSentence[0]);
            System.out.println(Arrays.toString(wordsInSentence));
            System.out.println("number of words in sentence= " + wordsInSentence.length);
            for (String any : wordsInSentence)
                System.out.println(any);
            break;
        }
    }
}