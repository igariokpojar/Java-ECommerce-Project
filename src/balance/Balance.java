package balance;

import java.util.UUID;

public abstract class Balance {

    private UUID customerID;
    private double balance;

    public Balance(UUID customerID, double balance) {
        this.customerID = customerID;
        this.balance = balance;
    }

    public abstract Double addBalance(Double additionalBalance);

    public UUID getCustomerID() {
        return customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}