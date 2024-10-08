public class Test {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 100.0);

        try {
            account.deposit(10.0);
            account.withdraw(200.0);
            account.withdraw(50.0);
            account.deposit(10.0);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The new balance is : " + account.GetBalance());
        }
    }
}
