package ua.edu.ucu.apps.decorator;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.item.Item;
import ua.edu.ucu.apps.item.PaperDecorator;

class PaperDecoratorTest {
    private Item item;

    @BeforeEach
    void setUp() {
        final int PRICEONE = 100;
        item = new Item() {
            @Override
            public int getPrice() {
                return PRICEONE;
            }

            @Override
            public String getDescription() {
                return "Basic item";
            }
        };
    }

    @Test
    void testGetPrice() {
        Item decoratedItem = new PaperDecorator(item);
        final int PRICE = 115;
        Assertions.assertEquals(PRICE, decoratedItem.getPrice(),
                "Price should include paper decoration cost");
    }

    @Test
    void testGetDescription() {
        Item decoratedItem = new PaperDecorator(item);
        Assertions.assertEquals("Decorated with paper.", decoratedItem.getDescription(),
                "Description should reflect paper decoration");
    }
}
