package lesson16.BankingSystem;

public class VirtualBankingSystem {
    public static void main(String[] args) {
        // Create accounts
        BankAccount account1 = new BankAccount("123456", "Alice", 1000);
        BankAccount account2 = new BankAccount("789012", "Bob", 500);

        // Perform transactions
        try {
            account1.depositAmount(200);
            account1.withdrawAmount(300);
            account1.transferFunds(account2, 400);
        } catch (InsufficientFundsException e) {
            System.err.println("Transaction failed: " + e.getMessage());
        }

        // Display account details
        displayAccountDetails(account1);
        displayAccountDetails(account2);
    }

    public static void displayAccountDetails(BankAccount account) {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
    }
}
