package org.example;

public class StringInstrument extends Instrument {

    int numberOfStrings;

    @Override
    public String toString() {
        return "StringInstrument{" +
                "numberOfStrings=" + numberOfStrings +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
