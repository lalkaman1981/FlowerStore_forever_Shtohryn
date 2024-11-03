package ua.edu.ucu.apps.delivery;

public class PostDeliveryStrategy implements Delivery {
    public String getDeliveryNotification() {
        return "Delivery with simple Post";
    }

}
