package company;

import java.util.Map;
import java.util.UUID;

public class Cart {

    private Costumer customer;
    private UUID discount;
    private Map<Product,Integer> productMap;

    public Cart(UUID discount, Map<Product, Integer> productMap) {
        this.discount = discount;
        this.productMap = productMap;
    }

    public Cart(Costumer customer) {
        this.customer = customer;
    }

    public Costumer getCustomer() {
        return customer;
    }

    public void setCustomer(Costumer customer) {
        this.customer = customer;
    }

    public UUID getDiscount() {
        return discount;
    }

    public void setDiscount(UUID discount) {
        this.discount = discount;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
}
