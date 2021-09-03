package part4.bank_transfer;
import part4.bank_transfer.Account;

public class BankTransfer {
    public static void main(String[] args) {
        // Initialize accounts
        Account personalAccount = new Account(3000, "Personal");
        Account joinAccount = new Account(0, "Join");

        transferAmount(personalAccount, joinAccount, 3500);
    }

    public static void transferAmount(Account from, Account to, int amount) {
        from.removeAmount(amount);
        to.addAmount(amount);

        System.out.println("You now have " + from.getBalance() + " in your " + from.getName() + " account.");
        System.out.println("You now have " + to.getBalance() + " in your " + to.getName() + " account.");
    }
}
