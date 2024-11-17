package ua.edu.ucu.apps.flowerstore.paymant;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flower.Item;

@Getter
public class CreditCardPaymentStrategy implements Payment {
    private String description;

    public CreditCardPaymentStrategy() {
        description = "Paid with credit card";
    }
    
    @Override
    public void pay(List<Item> items) {
        double price = 0;
        for (Item item:items) {
            price += item.getPrice();
        }
        System.out.println(price);
    }
}
