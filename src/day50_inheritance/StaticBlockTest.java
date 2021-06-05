package day50_inheritance;

import com.sun.tools.javac.code.Attribute;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();
        StaticBlockDemo st2 = new StaticBlockDemo();
        StaticBlockDemo st3 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);

        StaticBlockDemo ST4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);

    }
}
