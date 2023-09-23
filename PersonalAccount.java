import java.util.ArrayList;

/**
 * Represents a personal account.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 2023-09-23
 */
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<>();

    /**
     * Initializes a personal account with account number and account holder.
     * @param accountNumber
     * @param accountHolder
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    /**
     * Deposits amount to the balance.
     * Add amount and transaction to the transactions.
     * @param amount
     */
    public void deposit(double amount) {
        this.balance += amount;
        Amount transaction = new Amount(amount, "deposit");
        this.transactions.add(transaction);
    }

    /**
     * Withdraws amount from the balance.
     * Adds amount and transaction to the transactions.
     * @param amount
     */
    public void withdraw(double amount) {
        this.balance -= amount;
        Amount transaction = new Amount(amount, "withdraw");
        this.transactions.add(transaction);
    }

    /**
     * Prints out the transaction history.
     */
    public void printTransactionHistory() {
        System.out.println(transactions);
    }

    /**
     * Gets the account's number.
     * @return An integer representing account's number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account's number.
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the account holder's name.
     * @return A String representing account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the account holder's name.
     * @param accountHolder
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * Gets the account's balance.
     * @return A double representing account's balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the account's balance.
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
