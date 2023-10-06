package Entities;

public class Account {

    private final double TAX_WITHDRAW = 5;

    private final int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);
    }
    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double balance(){
        return balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
            balance -= (withdraw + TAX_WITHDRAW);
    }

    @Override
    public String toString() {
        return  "Account "+ accountNumber +
                ", Holder: " + holderName +
                ", Balance: $ "+ String.format("%.2f", balance);
    }
}
