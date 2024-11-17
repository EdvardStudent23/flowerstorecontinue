package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.paymant.PayPalPaymentStrategy;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    private PayPalPaymentStrategy PPS;

    @BeforeEach
    void setUp() {
        PPS = new PayPalPaymentStrategy();
    }

    @Test
    void testDescription() {
        // Test that the description is correctly set
        assertEquals("Paid with PayPal", PPS.getDescription());
    }

    @Test
    void testPayWithMultipleItems() {
        // Mocking the Item class
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getPrice()).thenReturn(10.0);
        when(item2.getPrice()).thenReturn(20.0);
        List<Item> items = List.of(item1, item2);
        double expectedTotal = 30.0;
        PPS.pay(items);
    }

    @Test
    void testPayWithEmptyList() {
        // Mocking an empty list of items
        List<Item> items = List.of();

        // Calling the pay method, which should print 0.0
        PPS.pay(items);
    }

    @Test
    void testPayWithSingleItem() {
        // Mocking a single item
        Item item = mock(Item.class);
        when(item.getPrice()).thenReturn(50.0);

        // Add item to the list
        List<Item> items = List.of(item);

        // Calling the pay method, which should print the total price
        PPS.pay(items);
    }
}
