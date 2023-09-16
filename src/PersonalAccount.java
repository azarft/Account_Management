import java.util.ArrayList;

/**
 * The PersonalAccount class represents a bank account owned by an individual.
 */
public class PersonalAccount {
    private int accountNumber; // The unique account number.
    private String accountHolder; // The name of the account holder.
    private double balance; // The current account balance.
    private ArrayList<Amount> transactions; // A list of transactions associated with this account.

    /**
     * Constructs a new PersonalAccount object.
     *
     * @param accNumb     The account number for this account.
     * @param accHolder   The name of the account holder.
     */
    public PersonalAccount(int accNumb, String accHolder) {
        accountNumber = accNumb;
        accountHolder = accHolder;
        balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits a specified amount of money into the account.
     *
     * @param amount The amount to be deposited.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(new Amount(amount, "Deposit"));
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    /**
     * Withdraws a specified amount of money from the account.
     *
     * @param amount The amount to be withdrawn.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            transactions.add(new Amount(amount, "Withdrawal"));
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    /**
     * Prints the transaction history for the account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber + " (" + accountHolder + "):");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    /**
     * Gets the current balance of the account.
     *
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the account number.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the name of the account holder.
     *
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}