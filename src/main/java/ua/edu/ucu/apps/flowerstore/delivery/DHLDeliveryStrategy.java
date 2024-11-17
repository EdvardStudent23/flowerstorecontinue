package ua.edu.ucu.apps.flowerstore.delivery;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import lombok.Getter;
import java.util.List;

@Getter
public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public DHLDeliveryStrategy() {
        this.name = "DHLDelivery";
        this.description = "Before payment deliver";
    }

    public void deliver(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("There isnt any item to deliver");
        } else {
            StringBuilder output = new StringBuilder("Delivered using DHLDelivery:");
            for (Item item : items) {
                output.append("\n").append(item.getDescription());
            }
            System.out.println(output);
        }
    }
}