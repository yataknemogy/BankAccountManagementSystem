import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private int customerNumber;


    public BankCustomer(String name, String address, int customerNumber){
        this.name = name;
        this.address = address;
        this.customerNumber = customerNumber;
    }


    public int getcustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


}
