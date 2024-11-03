package ua.edu.ucu.apps.item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public int getPrice() {
        final int PRICE = 10;
        return PRICE + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Decorated with basket.";
    }
}
