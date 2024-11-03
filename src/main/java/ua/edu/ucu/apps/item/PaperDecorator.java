package ua.edu.ucu.apps.item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public int getPrice() {
        final int PRICE = 15;
        return PRICE + super.getPrice();
    }

    @Override
    public String getDescription() {
        return "Decorated with paper.";
    }
}
