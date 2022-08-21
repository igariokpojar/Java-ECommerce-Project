package company.checkout;

import company.Costumer;
import company.StaticConstants;
import company.balance.Balance;
import company.balance.CustomerBalance;

import java.util.UUID;



public class CostumerBalanceCheckoutServiceImp implements CheckoutService{
    @Override
    public boolean checkout(Costumer customer, Double totalAmount) {
        CustomerBalance customerBalance= findCustomerBalance(customer.getId());
            double finalBalance= customerBalance.getBalance() -totalAmount;
            if(finalBalance>0){
                customerBalance.setBalance(finalBalance);
                return true;
            }
            return false;
        }

    private static CustomerBalance findCustomerBalance(UUID customerId){
        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST){
            if (customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }
        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        return customerBalance;

    }
}
