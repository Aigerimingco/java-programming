package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size="tall";
        double price=0;
        int calories=0;

        switch(size){
            case "tall":
                System.out.println("Tall Cappuccino please");
                 price=3.69;
                 calories=90;
            break;
            case"grande":
                System.out.println("Grande Cappuccino please");
                price=3.99;
                calories=120;
            break;
            case"venti":
                price=4.29;
                calories=150;
                System.out.println("venti Cappucino please");
                break;
            default:
                System.out.println("We dont serve that"+ size+" of Cappuccino");
        }
        System.out.println("Total price: $"+price+"\nYou will consume "+calories+" calories of energy");
    }
}
