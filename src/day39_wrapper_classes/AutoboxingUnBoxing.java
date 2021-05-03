package day39_wrapper_classes;

public class AutoboxingUnBoxing {
    public static void main(String[] args) {
        //Integer n1=new Integer(432);
        //int n2=n1;
       // System.out.println("n2 = " + n2);

        int num1=500;
        Integer num2=num1;
        Integer num3=234;
        System.out.println("num2 = " + num2);

        //unboxing

        Double d1= new Double(100.5);
        double d2=d1;
        double d3=new Double(345.3);
    }
}
