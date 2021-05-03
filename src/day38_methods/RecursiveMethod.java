package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
printNums(1);
Count(100);

    }
    public static void printNums(int num){
        System.out.print(" " + num);
        num++;
        if(num<=100){
           printNums(num);
        }

    }
    public static void Count(int num1){
        System.out.println(num1);
        num1++;
        if(num1<=100){
            Count(num1);
        }
    }
}
