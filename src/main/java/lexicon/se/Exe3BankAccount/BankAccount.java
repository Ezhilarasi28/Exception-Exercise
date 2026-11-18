package lexicon.se.Exe3BankAccount;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposited amount must be positive");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }
        if (amount > this.balance) {
            throw new InsufficientBalanceException(
                    "Not enough money in your account"
            );

        }
        this.balance -= amount;
        System.out.println("Withdrawn " + amount);
    }

    public void showBalance() {
        System.out.println("Your balance is " + this.balance);
    }
}

