/**
 * The Amount class represents an amount of money associated with a transaction type.
 */
public class Amount {
    private double amount; // The amount of money.
    private String transactionType; // The type of transaction (e.g., "Deposit" or "Withdrawal").

    /**
     * Constructs a new Amount object.
     *
     * @param theAmount          The amount of money.
     * @param theTransactionType The type of transaction.
     */
    public Amount(double theAmount, String theTransactionType) {
        amount = theAmount;
        transactionType = theTransactionType;
    }

    /**
     * Gets the amount of money.
     *
     * @return The amount of money.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the transaction type.
     *
     * @return The transaction type.
     */
    public String getTransactionType() {
        return transactionType;
    }
}