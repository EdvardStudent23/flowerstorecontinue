package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void testFlowerDefaultConstructor() {
        Flower flower = new Flower();
        assertNull(flower.getFlowerType(), "Default flower type should be null");
        assertEquals(0.0, flower.getPrice(), "Default price should be 0.0");
        assertEquals(0.0, flower.getSepalLength(), "Default sepal length should be 0.0");
    }

    @Test
    void testFlowerParameterizedConstructor() {
        Flower flower = new Flower(FlowerType.ROSE);
        assertEquals(FlowerType.ROSE, flower.getFlowerType(), "Flower type should be ROSE");
    }

    @Test
    void testSetAndGetPrice() {
        Flower flower = new Flower();
        flower.setPrice(10.5);
        assertEquals(10.5, flower.getPrice(), "Price should be set to 10.5");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> flower.setPrice(-5.0));
        assertEquals("Price mustn`t be negative", exception.getMessage(), "Exception message mismatch");
    }

    @Test
    void testSetAndGetSepalLength() {
        Flower flower = new Flower();
        flower.setSepalLength(5.5);
        assertEquals(5.5, flower.getSepalLength(), "Sepal length should be set to 5.5");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> flower.setSepalLength(-1.0));
        assertEquals("Sepal length mustn`t be negative", exception.getMessage(), "Exception message mismatch");
    }

    @Test
    void testSetAndGetFlowerType() {
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.TULIP);
        assertEquals(FlowerType.TULIP, flower.getFlowerType(), "Flower type should be TULIP");
    }

    @Test
    void testSetId() {
        Flower flower = new Flower();
        flower.setId(123L);
        assertEquals(123L, flower.getId(), "ID should be set to 123");
    }
}
