package lesson16.BankingSystem;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdrawAmount(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
        }
    }

    public void transferFunds(BankAccount recipient, double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            withdrawAmount(amount);
            recipient.depositAmount(amount);
            System.out.println("Transfer of $" + amount + " to account " + recipient.getAccountNumber() + " successful.");
        } else {
            throw new InsufficientFundsException("Insufficient funds to transfer $" + amount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}