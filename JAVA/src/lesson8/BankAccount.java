package lesson8;

public class BankAccount {
    String accountNumber;
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }
    public void cashDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("You don't have enough balance, current balance: " + balance);
        }
    }
}
