package ua.edu.ucu.apps.flowerstore.order;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.paymant.Payment;

public class Order {
    public List<Item> items;
    public Payment payment;
    public Delivery delivery;
}
