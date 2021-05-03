package day09_scanner_practice;
public class SpeedCheckV1 {
    public static void main(String[] args) {
       int speedlimit=55;
        int currentSpeed=75;
       int overthelimit=currentSpeed-speedlimit;
        System.out.println("You are driving "+overthelimit+" mph over the limit. Slow Down!");
    }
}
