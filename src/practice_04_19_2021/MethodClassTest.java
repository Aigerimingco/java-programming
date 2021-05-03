package practice_04_19_2021;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne();
        System.out.println(MethodClass.methodTwo());
        String s=MethodClass.methodTwo();
        System.out.println(s);
        String s2="words";

        System.out.println(MethodClass.methodThree("word"));
        System.out.println(MethodClass.methodThree(s2));
        System.out.println(MethodClass.login("aigerim", "abc123"));

    }
}
