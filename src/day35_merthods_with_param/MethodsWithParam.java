package day35_merthods_with_param;

public class MethodsWithParam {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(5+75);
        int count=98;
        displayValue(count);
        String word="Selenium";
        diffvalue(word);
        diffvalue("Java");
        greetbyname("Aigerim");
        greetbyname("Sabina");

    }

    public static void displayValue(int num) {
        System.out.println("value is: " + num);
    }

    public static void diffvalue(String num) {
        System.out.println("value is: " + num);
    }
    public static void greetbyname(String name){
        System.out.println("hello "+ name+". How are you today?");
    }


}
