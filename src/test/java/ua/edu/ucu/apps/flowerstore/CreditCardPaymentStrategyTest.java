package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.paymant.CreditCardPaymentStrategy;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    private CreditCardPaymentStrategy CCPS;

    @BeforeEach
    void setUp() {
        CCPS = new CreditCardPaymentStrategy();
    }

    @Test
    void testDescription() {
        assertEquals("Paid with credit card", CCPS.getDescription());
    }
    @Test
    void testPayWithMultipleItems() {
        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        when(item1.getPrice()).thenReturn(10.0);
        when(item2.getPrice()).thenReturn(20.0);

        List<Item> items = List.of(item1, item2);
        double expectedTotal = 30.0;

        CCPS.pay(items);
    }

    @Test
    void testPayWithEmptyList() {
        
        List<Item> items = List.of();
        CCPS.pay(items);
       }

    @Test
    void testPayWithSingleItem() {
        
        Item item = mock(Item.class);
        when(item.getPrice()).thenReturn(50.0);
        List<Item> items = List.of(item);

        CCPS.pay(items);
    }
}
