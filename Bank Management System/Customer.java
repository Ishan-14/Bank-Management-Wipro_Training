import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerOperation {
    private String customerId;
    private String name;
     private List<Account> accounts;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts=new ArrayList<>();
    }
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public void openAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);
    }
    @Override
    public List<Account> getAccounts() {
        return accounts;
    }

    public static void main(String[] args) {
        Account obj=new Account("1", 10000);
        System.out.println("My accout number is="+obj.getAccountNumber());
        System.out.println("My accout balance is="+obj.getBalance());

        obj.deposit(100);
        System.out.println("My accout balance is="+obj.getBalance());

        obj.withdraw(100);
        System.out.println("My accout balance is="+obj.getBalance());


        Customer obj1=new Customer("1", "Ishan");
        System.out.println("My customer id is = "+obj1.getCustomerId());

        System.out.println("My name is = "+obj1.getName());
        obj1.openAccount(obj);

        System.out.println("My account is = "+obj1.getAccounts());




    }
    
}
