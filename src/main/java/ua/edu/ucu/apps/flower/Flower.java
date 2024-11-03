package ua.edu.ucu.apps.flower;

import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.NoArgsConstructor;


import ua.edu.ucu.apps.item.Item;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "flowers")
@NoArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double sepalLength;
    private FlowerColor color;
    private int price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        flowerType = flower.flowerType;
        sepalLength = flower.sepalLength;
        price = flower.price;
        color = flower.color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean match(Flower f) {
        return this.price == f.getPrice() && this.flowerType.equals(f.getFlowerType())
                && this.getSepalLength() == f.getSepalLength();
    }
}
