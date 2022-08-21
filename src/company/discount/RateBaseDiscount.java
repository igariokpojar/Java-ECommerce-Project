package company.discount;

import java.util.UUID;

public class RateBaseDiscount extends Discount{

    private Double rateAmount;

    public RateBaseDiscount(UUID id, String name, Double thresholdAmount, Double rateAmount) {
        super(id, name, thresholdAmount);
        this.rateAmount = rateAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return amount-(amount*rateAmount/100);
    }

    public Double getRateAmount() {
        return rateAmount;
    }
}
