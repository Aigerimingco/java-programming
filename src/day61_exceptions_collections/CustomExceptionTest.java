package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 50;
        System.out.println("class is going on for " + minutes + " minutes");
        if (minutes > 50) {
            throw new BreakTimeException("it is break time!");
        }
        System.out.println("lets continue the class");

        double balance = 400;
        double itemPrice = 500;
        System.out.println("I have $" + balance + " and purchasing item for $" + itemPrice);
        if (itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds");
            //System.out.println();
        }
        System.out.println("Item successfully purchased");
    }
}
