package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsere Instrumente:");

        StringInstrument violin = new StringInstrument();
        violin.brand = "Harley Benton";
        violin.price = 100.00;
        violin.numberOfStrings = 4;

        StringInstrument guitar = new StringInstrument();
        guitar.brand = "Tylor";
        guitar.price = 700.00;
        violin.numberOfStrings = 6;

        Instrument epiano = new Instrument();
        epiano.brand = "Yamaha";
        epiano.price = 600.00;

        Instrument myFavoriteInstrument = violin;

        print(violin);
        print(guitar);
        print(epiano);
        System.out.println("Mein Lieblingsinstrument:");
        print(myFavoriteInstrument);
    }

    public static void print(Instrument instrument) {
        System.out.println(instrument);
    }

}