package company;

import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;

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
}
