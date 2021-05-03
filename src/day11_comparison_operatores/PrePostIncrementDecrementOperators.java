package day11_comparison_operatores;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //pre increment
        int num1=10;
        int num2= ++num1;
        System.out.println("num1 ="+num1);
        System.out.println("num2 ="+num2);

        //post increment
        int num3=8;
        int num4=num3++;
        System.out.println("num3 ="+num3);
        System.out.println("num4 ="+num4);

         int apples=5;
         int basket=++apples;
        System.out.println("apples  ="+apples);
        System.out.println("basket "+basket);

        int apples1=5;
        int basket1=apples1++;
        System.out.println("apples  ="+apples1);
        System.out.println("basket "+basket1);
        System.out.println("basket "+basket1);
        int a=50;
        int b=22;
        int c=a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
