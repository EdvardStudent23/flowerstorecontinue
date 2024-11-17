package ua.edu.ucu.apps.flowerstore.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table
public class Flower extends Item { 
    @Id
    private long id;
    private double sepalLength;
    private FlowerType type;
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower() {
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price mustn`t be negative");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSepalLength(double sepalLength) {
        if (sepalLength <= 0) {
            throw new IllegalArgumentException("Sepal length mustn`t be negative");
        }
        this.sepalLength = sepalLength;
    }
}
