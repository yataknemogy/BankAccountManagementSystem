import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private List<String>transactionHistory;
    private BankCustomer ownerAccount;
    private double balanceAccount;
    private int numberAccount;


     public BankAccount(BankCustomer ownerAccount, double balanceAccount, int numberAccount){
        this.ownerAccount = ownerAccount;
        this.balanceAccount = balanceAccount;
        this.numberAccount = numberAccount;
        transactionHistory = new ArrayList<>();
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public BankCustomer getOwnerAccount() {
        return ownerAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void depositAccount(double amount){
        balanceAccount += amount;
        transactionHistory.add("deposit: " + amount);
    }
    public void withdraw(double amount){
        if(balanceAccount < amount){
            System.err.println("Недостаточно средств!");
        }
        else{
            balanceAccount -= amount;
            transactionHistory.add("withDraw: " + amount);
        }
    }



}
