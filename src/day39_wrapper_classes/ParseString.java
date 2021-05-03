package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "342";
        int num = Integer.parseInt(total);
        System.out.println("String into int " + num);

        String str = "126.7";
        double num1 = Double.parseDouble(str);
        System.out.println("String into double " + num1);

        String word ="java";
        boolean bl=Boolean.parseBoolean(word);
        System.out.println(bl);

        String strPrice="123.5";
        double price=Double.parseDouble(strPrice);
        if(price>100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 500 lines of code";
        String[] str1=sentence.split(" ");
        int lineOfCode= Integer.parseInt(str1[2]);
        System.out.println(lineOfCode);
    }
}
