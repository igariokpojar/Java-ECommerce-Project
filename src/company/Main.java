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
        System.out.println(costumer.getUserName());



    }
}
