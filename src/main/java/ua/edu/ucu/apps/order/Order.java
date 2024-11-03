package ua.edu.ucu.apps.order;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.delivery.Delivery;
import ua.edu.ucu.apps.item.Item;
import ua.edu.ucu.apps.payment.Payment;


@Getter
@Setter
public class Order {

    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }

    public void setItems(List<Item> newItems) {
        items = newItems;
    }

    public Integer calculateTotalPrice() {
        int res = 0;
        for (Item item : items) {
            res += item.getPrice();
        }
        return res;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        int size = items.size();
        for (int i = 0; i < size; i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                break;
            }
        }
    }

    public String processOrder() {
        return delivery.getDeliveryNotification() + payment.pay(calculateTotalPrice());
    }
}
