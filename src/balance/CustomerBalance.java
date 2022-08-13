package balance;

import java.util.UUID;

public class CustomerBalance extends Balance {

    @Override
    public Double addBalance(Double additionalBalance) {
        return null;
    }

    public class CustomerBalance extends Balance{

        public CustomerBalance(UUID customerId,Double balance) {
            super(customerID, balance);
        }


        public Double addBalance(Double additionalBalance){
            setBalance(getbalance() + additionalBalance);
            return getBalance();
        }
    }
}
