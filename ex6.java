interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double balanceEnquiry();
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class SavingsAccount implements BankAccount {
    private double balance;
    public SavingsAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero."
            );
        }
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance: " + balance
            );
        }

        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }
    public double balanceEnquiry() {
        return balance;
    }
}
public class BankApplication {
    public static void main(String[] args) {
        try {
            BankAccount account = new SavingsAccount(5000);
            account.deposit(2000);
            System.out.println("Current balance: " +
                               account.balanceEnquiry());
            account.withdraw(1500);
            System.out.println("Current balance: " +
                               account.balanceEnquiry());
            account.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}