package ua.edu.ucu.apps.item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public int getPrice() {
        final int PRICE = 30;
        return PRICE + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Decorated with basket.";
    }
}
