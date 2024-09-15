public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException{

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount! Deposit amount must be positive.");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        }
        balance = balance - amount;
    }

    public double GetBalance(){
        return balance;
    }

}
