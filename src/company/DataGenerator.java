package company;

import balance.Balance;
import balance.CustomerBalance;
import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;
import discount.AmountBasedDiscount;
import discount.Discount;
import discount.RateBaseDiscount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){

        Address address1Customer1 = new Address("7925","Jones Branch Dr","Suite 3300","22102","VA");
        Address address2Customer1 = new Address("825","GeorgeTown Pky","Suite 5355","22036","VA");
        Address address1Customer2 = new Address("5924","Lee Hwy","House","22044","VA");


        List<Address>customer1AddressList = new ArrayList<>();

        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Costumer customer1 = new Costumer(UUID.randomUUID(),"Igor","igariokpojar@yahoo.com");
        Costumer costumer2 = new Costumer(UUID.randomUUID(),"Alla", "pojarigariok@gmail.com");

        StaticConstants.COSTUMER_LIST.add(customer1);
        StaticConstants.COSTUMER_LIST.add(costumer2);


    }

    public static void createCategory(){

        Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
        Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(),"SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);
    }

    public static void createProduct(){
        Product product1 = new Product(UUID.randomUUID(),"iPhone",1450.33,8,8,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(),"XBOX",1230.33,5,9,StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(),"Table",123.33,2,5,StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(),"Milk",1.33,12,25,UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);

    }

    public static void createBalance(){
        Balance customerBalance = new CustomerBalance(StaticConstants.COSTUMER_LIST.get(0).getId(),450.00);
        Balance giftCardBalance = new CustomerBalance(StaticConstants.COSTUMER_LIST.get(0).getId(),300.23);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
    }

    public static void createDiscount(){

        Discount amountBaseDiscount = new AmountBasedDiscount(UUID.randomUUID(),"Buy 250 free 50 ",250.00,50.00);
        Discount rateBaseDiscount = new RateBaseDiscount(UUID.randomUUID(),"Buy 500 free %15 ",500.00,10.0);

        StaticConstants.DISCOUNT_LIST.add(amountBaseDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBaseDiscount);
    }
}
