package day58_polymorphism;

public class Etsy extends OnlineShop implements HandMade{
    @Override
    public void buy() {
        System.out.println("Buying items from etsy.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items from etsy.com");
    }
}
