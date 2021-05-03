package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1=75;
        String result= (score1>60) ? "pass" : "fail";
        System.out.println("result "+result);
        String quality="good";
         int x=(quality.equals("good")) ? 100 : 0;
        System.out.println("quality = " + quality);
        
        int score2=88;
        char grade=(score2>90) ? 'A': 'B';
        System.out.println("grade = " + grade);

        int score3=10;
        String evenOdd=(score3%2==0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);


    }
}
