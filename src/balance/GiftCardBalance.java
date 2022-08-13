package balance;

import java.util.UUID;

public class GiftCardBalance extends Balance {

    public GiftCardBalance(UUID customerID, double balance) {
        super(customerID, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionAmount = additionalBalance * 10 / 100;
        setBalance(getBalance() + additionalBalance + promotionAmount);
        return getBalance();
    }

    }
