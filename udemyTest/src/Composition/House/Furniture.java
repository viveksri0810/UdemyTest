package Composition.House;

public class Furniture {

    private String manufacturer;
    private String Model;
    private String Color;

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
