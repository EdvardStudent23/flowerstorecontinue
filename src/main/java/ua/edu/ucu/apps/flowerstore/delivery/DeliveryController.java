package ua.edu.ucu.apps.flowerstore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.Item;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeliveryController {
    @Setter
    private Delivery delivery;

    public DeliveryController() {
        this.delivery = new DHLDeliveryStrategy();
    }

    @GetMapping("/delivery")
    public String getDelivery() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower());
        items.add(new Flower());
        delivery.deliver(items);
        return "The delivery is completed";
    }
}