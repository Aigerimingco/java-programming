package day12_conditional_statements;

import javax.lang.model.SourceVersion;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 >= letter2);
        System.out.println(letter1 <= letter2);
        System.out.println(letter1 != letter2);

        char grade = 'E';
        boolean isPass = grade <= 'D';
        System.out.println("did I pass the exam ? " + isPass);
    }
}