import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankCustomer bankCustomer1 = bank.createCustomer("Иван", "Москва");
        BankCustomer bankCustomer2 = bank.createCustomer("Елена", "Сибирь");
        BankAccount bankAccount1 = bank.createAccount(bankCustomer1, 1000);
        BankAccount bankAccount2 = bank.createAccount(bankCustomer2, 500);
        System.out.println("Владалец аккаунта: " + bankAccount1.getOwnerAccount());
        System.out.println("Баланс счета: " + bankAccount1.getBalanceAccount());
        System.out.println("Номер вашего аккаунта: " + bankAccount1.getNumberAccount());
        bankAccount1.depositAccount(1000);
        bankAccount2.depositAccount(500);
        System.out.println("Первый, Актуальный баланс: " + bankAccount1.getBalanceAccount());
        System.out.println("Второй, Актуальный баланс: " + bankAccount2.getBalanceAccount());
        bankAccount1.withdraw(300);
        System.out.println("Ваш баланс после перевода: " + bankAccount1.getBalanceAccount());
    }
}
