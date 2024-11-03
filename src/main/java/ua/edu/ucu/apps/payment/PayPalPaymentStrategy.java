package ua.edu.ucu.apps.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(Integer price) {
        return "Payed " + price + " by PayPal";
    }

}
