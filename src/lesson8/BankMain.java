package lesson8;

public class BankMain {
    public static void main(String[] args) {
        BankAccount new_acc = new BankAccount();

        System.out.println("Initial balance: " + new_acc.balance);
        System.out.println("Trying to withdraw 5000 from 0 balance...");
        new_acc.cashDraw(5000);
        System.out.println("Add 15000 to balance");
        new_acc.deposit(15000);
        System.out.println("Updated balance: " + new_acc.balance);
        System.out.println("Withdrawing 950 from balance");
        new_acc.cashDraw(950);
        System.out.println("Updated balance: " + new_acc.balance);
    }
}
