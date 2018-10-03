import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * Sets the BankAccountType
     */
    public enum BankAccountType {
        /**
         * Checkings Type
         */
        CHECKINGS,
        /**
         * Savings Type
         */
        SAVINGS,
        /**
         * Student Type
         */
        STUDENT,
        /**
         * Work place type
         */
        WORKPLACE
    }

    /**
     * Variables that define bank account state
     */
    private int accountNumber;
    /**
     * Hello
     */
    private BankAccountType accountType;
    /**
     * Darkness
     */
    private double accountBalance;
    /**
     * My
     */
    private String ownerName;
    /**
     * Old
     */
    private double interestRate;
    /**
     * Friend
     */
    private double interestEarned;

    /**
     * Constructor for BankAccount
     * @param name the name of the owner
     * @param accountCategory the type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountType = accountCategory;
        ownerName = name;
    }


    /**
     *
     * @return accontNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param setAccountNumber
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }
    /**
     *
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     *
     * @param setAccountType
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }
    /**
     *
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     * @param setAccountBalance
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }
    /**
     *
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     *
     * @param setOwenerName
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }
    /**
     *
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     *
     * @param setInterestRate
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }
    /**
     *
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     *
     * @param setInterestEarned
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }
}
