package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance=1230.55;
        System.out.println("balance= "+balance);

        double baklava=22.50;
 balance=balance-baklava;
        System.out.println("baklava= "+baklava);
        double kenafa=44.50;
        balance=balance-kenafa;
        System.out.println("kenafa= "+kenafa);
        //2nd kenafe is 50% off. lets buy it.
        kenafa=kenafa/2;
        System.out.println("kenafa "+kenafa);
        balance=balance-kenafa;
        System.out.println("balance after second kenafa "+balance);
        double icedTea=3.0;
        System.out.println("iced tea: "+icedTea);
        balance=balance-icedTea*4;
        System.out.println("balance after 4 iced teas: $"+balance);




    }
}
