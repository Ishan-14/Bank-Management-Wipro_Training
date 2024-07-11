import java.util.List;

public interface CustomerOperation {
    void openAccount(Account account);
    void closeAccount(Account account);
    List<Account> getAccounts();
}
