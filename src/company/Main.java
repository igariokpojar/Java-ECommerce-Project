package company;

import category.*;
import discount.Discount;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("test");

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();

        DataGenerator.createBalance();
        DataGenerator.createDiscount();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Selects Customer");

        for (int i = 0; i < StaticConstants.COSTUMER_LIST.size(); i++) {
            System.out.println("Type: " + i + " for customer:" + StaticConstants.COSTUMER_LIST.get(i).getUserName());

        }
        Costumer costumer = StaticConstants.COSTUMER_LIST.get(scanner.nextInt());

        while (true) {

            System.out.println("What would you like to do? Just type id for selection");

            for (int i = 0; i < prepareMenuOptions().length; i++) {
                System.out.println(i + "-" + prepareMenuOptions()[i]);

            }

            int menuSelection = scanner.nextInt();

            switch (menuSelection) {
                case 0: // list of category

                    for (Category category : StaticConstants.CATEGORY_LIST) {
                        System.out.println("Category Code:" + category.generateCategoryCode() + " category name" + category.getName());
                    }
                    break;

                case 1: //list products // product name, product category name
                    try {
                        for (Product product : StaticConstants.PRODUCT_LIST) {

                            System.out.println("Product Name: " + product.getName() + "Product Category Name: " + product.getCategoryName());
                        }
                    } catch (Exception e) {
                        System.out.println("Product could not be printed because category not found for product name: "
                                + e.getMessage().split(",")[1]);
                    }

                    break;
                case 2: // list discounts

                    for(Discount discount: StaticConstants.DISCOUNT_LIST){
                        System.out.println("Discount Name: " + discount.getName() + "discount threshold amount:" + discount.getThresholdAmount());
                    }
                    break;
                case 3:



                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;

            }
        }

    }

   /* private static CustomerBalance findCustomerBalance(UUID customerId){

        for (Balance customerBalance : StaticConstants.CUSTOMER_BALACE_LIST){
            if (customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance.getId);
        return customerBalance;
    }
    private static GiftCardBalance findGiftCustomerBalance(UUID customerId) {

        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALACE_LIST) {
            if (gidtCardBalance.getCustomerId().toString().equals(customerId.toString())) {
                return (GiftCardBalance) giftCardBalance;
            }
        }

        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId, 0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
        return giftCardBalance;

    }

*/

        private static String[] prepareMenuOptions () {
            return new String[]{"List Categories", "List Products", "List Discount", "See Balance", "Add Balance",
                    "Place an order", "See Cart", "See order details", "See your address", "Close App"};

        }
    }

