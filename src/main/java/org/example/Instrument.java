package org.example;

public class Instrument {

    String brand;
    double price;

    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
