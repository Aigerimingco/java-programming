package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count= 3;
        System.out.println(count);
        count=count+2;
        System.out.println(count);

        int apples=5;
        apples=apples+10;
        System.out.println(apples);
        apples=apples-3;
        System.out.println(apples);

        int pizzaSlices=8;
        System.out.println("Pizza Slices: "+ pizzaSlices);
        pizzaSlices=pizzaSlices/2;
        System.out.println("Pizza Slices: "+pizzaSlices);
        pizzaSlices=pizzaSlices+6;
        System.out.println("Pizza Slices: "+pizzaSlices);

        int players=10;
        System.out.println(players);
        players=players*2;
        System.out.println(players);

        int cents=244;
        System.out.println(cents);
        cents=cents%100;
        System.out.println(cents);
    }
}
