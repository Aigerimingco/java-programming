package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime{
    @Override
    public void buy() {
        System.out.println("Buying items from amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items from amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Free-2 day shipping for prime users");
    }
}
