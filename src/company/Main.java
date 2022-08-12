package company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("test");

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();

       // createBalance();
      //  createDiscount();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Selects Customer");

        for (int i = 0; i < StaticConstants.COSTUMER_LIST.size(); i++) {
            System.out.println("Type: " + i + " for customer:"+StaticConstants.COSTUMER_LIST.get(i).getUserName());

        }
        Costumer costumer = StaticConstants.COSTUMER_LIST.get(scanner.nextInt());

        while (true){

            System.out.println("What would you like to do? Just type id for selection");

            for (int i = 0; i < prepareMenuOptions().length; i++) {
                System.out.println(i+"-"+prepareMenuOptions()[i]);

            }

            int menuSelection = scanner.nextInt();

            switch (menuSelection){
                case 0:


                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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

            prepareMenuOptions();
        }

    }

    private static String[] prepareMenuOptions(){
        return new String[]{"List Categories","List Products","List Discount","See Balance","Add Balance",
                "Place an order","See Cart","See order details","See your address","Close App"};

    }


}
