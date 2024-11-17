package ua.edu.ucu.apps.flowerstore.paymant;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flower.Item;

@Getter
public class PayPalPaymentStrategy implements Payment {
    private String description;

    public PayPalPaymentStrategy() {
        description = "Paid with PayPal";
    }

    @Override
    public void pay(List<Item> items) {
        double price = 0;
        for (Item item:items) {
            price += item.getPrice();
        }
        System.out.println("Total price paid via PayPal: " + price);
    }
}
