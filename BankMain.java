public class BankMain {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        account.deposit(250);
        account.withdraw(75);
        account.deposit(13);
        account.printBalance(0);
        
    }

}
