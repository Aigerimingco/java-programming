package practice_04_19_2021;

public class MethodClass {

    public static void methodOne(){
        System.out.println("one");
    }
    public static String methodTwo(){
        return "two";
    }
    public static int methodThree(String word){
        return word.length();
    }
    public static boolean login(String username, String password){
        return true;
    }
}
