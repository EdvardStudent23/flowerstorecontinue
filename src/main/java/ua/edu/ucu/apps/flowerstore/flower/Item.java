package ua.edu.ucu.apps.flowerstore.flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }
    
    public abstract double getPrice();
}
