package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("pass- case is correct");
        }else{
            System.out.println("fail-case is incorrect");
        }
        String word="Java";
        String uWord=word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);
    }
}