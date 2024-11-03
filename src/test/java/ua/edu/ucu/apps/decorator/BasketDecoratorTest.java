package ua.edu.ucu.apps.decorator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.item.BasketDecorator;
import ua.edu.ucu.apps.item.Item;

class BasketDecoratorTest {

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
        final int PRICE = 110;
        Item decoratedItem = new BasketDecorator(item);
        Assertions.assertEquals(PRICE, decoratedItem.getPrice());
    }

    @Test
    void testGetDescription() {
        Item decoratedItem = new BasketDecorator(item);
        Assertions.assertEquals("Decorated with basket.", decoratedItem.getDescription());
    }
}