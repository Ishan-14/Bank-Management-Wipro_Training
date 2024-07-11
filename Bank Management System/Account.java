public class Account implements AccountOperation {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    @Override
    public double checkBalance(){
        return balance;
    }
    
}
