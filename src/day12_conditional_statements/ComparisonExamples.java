package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit=55;
        boolean isSpeeding=currentSpeed>speedLimit;
        System.out.println("Are you speeding? "+isSpeeding);
        System.out.println("current speed: "+currentSpeed+"mph");
        System.out.println("speed limit: "+speedLimit+"mph");
        //45+20=65
        currentSpeed+=20;
        isSpeeding=currentSpeed>speedLimit;
        System.out.println("Are we speeding? "+isSpeeding);
        System.out.println("current speed: "+currentSpeed+"mph");
        System.out.println("speed limit: "+speedLimit+"mph");

        double accountBalance=250.25;
        double itemPrice=220.25;

        System.out.println("can I afford? - "+(itemPrice<=accountBalance));
boolean canAffortd=accountBalance>=itemPrice;
        System.out.println("Can afford? - "+ canAffortd);
        accountBalance-=itemPrice;
        System.out.println("canAffortd = " + accountBalance);
        boolean isBroke=accountBalance<=0;
        System.out.println("Am I Broke = " + isBroke);
//boolean num1=a<b;
 //       System.out.println(a<b);

    }
}
