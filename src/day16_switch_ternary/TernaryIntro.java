package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {


        String action="blue";
        boolean isGreen = true;
        action = (isGreen) ? "Can drive" : "Can not drive";
        System.out.println(action);
    }
}