public interface AccountOperation {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
