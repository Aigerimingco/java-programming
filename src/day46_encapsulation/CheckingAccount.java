package day46_encapsulation;

public class CheckingAccount {
    private String type, accountHolder;
    private double balance;
    private long accountNumber;


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountInfo(long accountNumber, String accountHolder, double balance, String type){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
        setType(type);
    }



    @Override
    public String toString() {
        return "CheckingAccount{" +
                "type='" + type + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}