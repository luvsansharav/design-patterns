package factory_method;

public class MasterCard implements ICard {

    @Override
    public String processPayment() {
        System.out.println("Payment processed with MasterCard");
        return "success";
    }
}
