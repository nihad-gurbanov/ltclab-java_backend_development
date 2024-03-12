package lesson8;

public class BankAcc {
    String accountNumber;
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }
    public void cashDraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("You don't have enough balance, current balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAcc new_acc = new BankAcc();

        System.out.println("Initial balance: " + new_acc.balance);
        System.out.println("Trying to withdraw from 0 balance...");
        new_acc.cashDraw(5);
        System.out.println("Add 100 to balance");
        new_acc.deposit(100);
        System.out.println(new_acc.balance);
        System.out.println("Withdrawing 63 from balance");
        new_acc.cashDraw(63);
        System.out.println(new_acc.balance);
    }
}
