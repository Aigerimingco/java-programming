package day45_oop;

public class CoffeeObjects {
    public static void main(String[] args) {
        Coffee myCoffee= new Coffee();
        System.out.println("coffee amount = "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("coffee refill = "+myCoffee.getAmount());
        myCoffee.drinksome(10);
        System.out.println("amount after drink 10  = "+myCoffee.getAmount());
        myCoffee.setType("mocha");
        System.out.println("Get type = "+ myCoffee.getType());
        System.out.println(myCoffee.toString());





    }
}
