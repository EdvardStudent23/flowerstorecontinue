package ua.edu.ucu.apps.flowerstore.paymant;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import java.util.List;

public interface Payment {
    public void pay(List<Item> items);
}
