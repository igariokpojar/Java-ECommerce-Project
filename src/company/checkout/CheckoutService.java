package company.checkout;

import company.Costumer;

public interface CheckoutService {

    boolean checkout(Costumer costumer,Double totalAmount);
}
