package company.checkout;

import company.Costumer;
import company.StaticConstants;
import company.balance.Balance;
import company.balance.CustomerBalance;
import company.balance.GiftCardBalance;

import java.util.UUID;

public class MixPaymentCheckoutServiceImpl implements CheckoutService{
    @Override
    public boolean checkout(Costumer costumer, Double totalAmount) {

        try {
            GiftCardBalance giftCardBalance = findGiftCardBalance(costumer.getId());

            final double giftBalance = giftCardBalance.getBalance()-totalAmount;

            if (giftBalance>0){
                giftCardBalance.setBalance(giftBalance);
            }else {
                CustomerBalance customerBalance = findCustomerBalance(costumer.getId());
                final double mixBalance = giftCardBalance.getBalance() + customerBalance.getBalance() - totalAmount;
                if (mixBalance > 0) {
                    giftCardBalance.setBalance(0d);
                    customerBalance.setBalance(mixBalance);

                    return true;
                }
            }
        }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return false;
        }
        private static GiftCardBalance findGiftCardBalance(UUID customerId){
        for(Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST){
            if (giftCardBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance) giftCardBalance;
            }
        }
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
        return giftCardBalance;
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

