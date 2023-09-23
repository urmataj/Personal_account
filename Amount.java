/**
 * Represents a transaction.
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 2023-09-23
 */
public class Amount {
    private double amount;
    private String transactionType; //"Deposit","Withdraw"

    /**
     * Initializes a transaction with amount and transaction type.
     * @param amount
     * @param transactionType
     */
    public Amount(double amount, String transactionType) {
        this.amount=amount;
        this.transactionType=transactionType;
    }

    /**
     * Returns a string representation of the object.
     * @return A String containing transaction and its properties.
     */
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}


