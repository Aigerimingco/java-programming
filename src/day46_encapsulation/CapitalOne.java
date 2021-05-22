package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account= new CheckingAccount();
        account.setType("checking");
        System.out.println(account.getType());
        account.setAccountHolder("Aigerim Ingco");
        System.out.println(account.getAccountHolder());
        account.setBalance(2300);
        System.out.println(account.getBalance());
        account.setAccountNumber(12345678999l);
        System.out.println(account.getAccountNumber());

        account.setAccountInfo(1234567, "Aigerim Ingco",2300, "Cheking");
       


        System.out.println(account);
    }
}
