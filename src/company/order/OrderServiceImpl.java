package company.order;

import company.Cart;
import company.discount.Discount;
import static company.StaticConstants.DISCOUNT_LIST;

import java.util.Scanner;
import java.util.UUID;

public class OrderServiceImpl implements OrderService{


    @Override
    public String placeOrder(Cart cart) {
        double amountAfterDiscount = cart.calculateCartTotalAmount();

        if (cart.getDiscountId()!=null){
            try {
                Discount discount = findDiscountById(cart.getDiscountId());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which payment option would like to choose?" +
                "Type 1: costumer company.balance"
                + "Type 2: Mixed (Gift card and customer company.balance");

        int paymentType = scanner.nextInt();
        boolean checkoutResult = false;

        switch (paymentType){

            case 1:
        }
    }
    private Discount findDiscountById(UUID discountId) throws Exception{
        for (Discount discount : DISCOUNT_LIST){
            if (discount.getId().toString().equals(discountId.toString())){
                return discount;
            }
        }
        throw new Exception("Discount couldn't be found");
    }
}
