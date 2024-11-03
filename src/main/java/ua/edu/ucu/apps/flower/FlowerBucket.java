package ua.edu.ucu.apps.flower;

import java.util.List;
import ua.edu.ucu.apps.item.Item;
import java.util.ArrayList;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public int getPrice() {
        int price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
