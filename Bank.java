import java.util.List;
import java.util.ArrayList;
public class Bank {
    private List < BankCustomer > customers;
    private List<BankAccount>accounts;
    private int customerNumber = 1;
    private int accountNumber = 1;
    public Bank(){
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }
    public void addCustomer(BankCustomer customer){
        customers.add(customer);
    }
    public void removeCustomer(BankCustomer customer){
        customers.remove(customer);
    }
    public BankCustomer foundCustomer(int customerNumber){
        for(BankCustomer customer: customers){
            if(customer.getcustomerNumber() ==  customerNumber){
                return customer;
            }
        }
        return null;
    }
    public BankCustomer createCustomer(String name, String address){
        BankCustomer bankCustomer = new BankCustomer(name, address, customerNumber);
        customers.add(bankCustomer);
        customerNumber++;
        return bankCustomer;
    }
    public BankAccount createAccount(BankCustomer ownerAccount, double balanceAccount){
        BankAccount bankAccount = new BankAccount(ownerAccount, balanceAccount, accountNumber);
        accounts.add(bankAccount);
        accountNumber++;
        return bankAccount;
    }

    public void printTransaction(BankAccount bankAccount){
        List<String>history = bankAccount.getTransactionHistory();
        for(String transaction: history){
            System.out.println(transaction);
        }
    }
    
}
