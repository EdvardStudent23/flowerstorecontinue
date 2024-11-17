package ua.edu.ucu.apps.flowerstore.delivery;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import lombok.Getter;
import java.util.List;

@Getter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        this.name = "PostDelivery";
        this.description = "After payment deliver";
    }

    public void deliver(List<Item> items) {
        if (items.isEmpty()) {
            System.out.println("There isnt any item to deliver");
        } else {
            StringBuilder output = new StringBuilder("Delivered using PostDelivery:");
            for (Item item : items) {
                output.append("\n").append(item.getDescription());
            }
            System.out.println(output);
        }
    }
}