package ua.edu.ucu.apps.flowerstore.paymant;

import java.util.List;

public interface Payment {
    double pay(List<Item> items);
}