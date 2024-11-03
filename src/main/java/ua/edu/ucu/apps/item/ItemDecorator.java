package ua.edu.ucu.apps.item;

public class ItemDecorator extends Item {

    private Item item;

    ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public int getPrice() {
        return item.getPrice();
    }
}
