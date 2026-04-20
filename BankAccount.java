public class BankAccount {

    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        // System.out.println("You deposited " + amount);

    }
    
    public void withdraw(double amount) {
        balance = balance - amount;
        // System.out.println("You withdrew " + amount);
    }
    
    public void printBalance(double amount) {
        System.out.printf("Balance: $%.2f\n", balance);
    }
    
    

    
}
