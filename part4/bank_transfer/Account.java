package part4.bank_transfer;

public class Account {
    private int balance;
    private String name;

    public Account(int initialBalance, String name) {
        this.balance = initialBalance;
        this.name = name;
    }

    public void removeAmount(int amount) {
        if (amount > this.balance) {
            System.out.println("You don't have enough balance!");
            return;
        }
        this.balance -= amount;
    }

    public void addAmount(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}
