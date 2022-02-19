package Composition.House;

public class Furniture {

    private final String manufacturer;
    private final String Model;
    private final String Color;

    public Furniture(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        Model = model;
        Color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }
}
