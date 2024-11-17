package ua.edu.ucu.apps.flowerstore.flower;
import ua.edu.ucu.apps.flowerstore.flower.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    static class TestItem extends Item {
        @Override
        public double getPrice() {
            return 10.0;
        }
    }

    @Test
    void testGetPrice() {
        Item item = new TestItem();
        double price = item.getPrice();
        assertEquals(10.0, price, "Price should be 10.0");
    }

    @Test
    void testSetAndGetDescription() {
        Item item = new TestItem();
        String description = "This is a test item.";
        item.setDescription(description);
        String retrievedDescription = item.getDescription();
        assertEquals(description, retrievedDescription, "Description should match the set value.");
    }
}