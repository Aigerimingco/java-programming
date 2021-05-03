package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int apples = 5;
        System.out.println(!(apples > 2));
        System.out.println(!(apples < 3));

        int age = 9;
        if (!(age >= 7)) {
            System.out.println(" Child need to be in car seat. age = " + age);
        } else {
            System.out.println("No car seat needed. age = " + age);
        }


        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed == false) {
            System.out.println("Smoking is not allowed here. Exit");
        } else {
            System.out.println("You may smoke here");

        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect Password");
        }
    }

        }


