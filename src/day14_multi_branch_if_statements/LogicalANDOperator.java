package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        //int apples=3;
        // int oranges=5;
        System.out.println(10 > 5 && 1 == 1);
        System.out.println(12 > 11 && 2 > 20);

        int apples = 1, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);
        if (apples > 6 && oranges > 2) {
            System.out.println("I have enough apples and oranges");
        } else {
            System.out.println("I need to by more");
        }
    }
}
