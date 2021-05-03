package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number=106789;
        if(number %  3==0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(number%3==0){
            System.out.println(number + " is Fizz");
        }else if( number % 5 ==0){
            System.out.println(number + "  is Buzz");
        }else{
            System.out.println(number);
        }
    }
}
