package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("MAX INT " + Integer.MAX_VALUE);
        System.out.println("min int " + Integer.MIN_VALUE);

        System.out.println(Double.max(234.4, 234.5));
        System.out.println("max value " + Double.MAX_VALUE);
        System.out.println("min value " + Double.MIN_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('b'));
        System.out.println(Character.isAlphabetic('3'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));

        char letter='A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word="JaVa iS Fun";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }
    }
}
