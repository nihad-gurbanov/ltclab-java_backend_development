package lesson11;

public class BankAccount {
    public static int totalAccounts = 0;
    public String name;
    public String surname;

    public BankAccount (String name, String surname) {
        this.name = name;
        this.surname = surname;
        totalAccounts++;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John", "Packard");
        BankAccount acc2 = new BankAccount("Ava", "Adams");

        System.out.println(BankAccount.totalAccounts);
        }
}
