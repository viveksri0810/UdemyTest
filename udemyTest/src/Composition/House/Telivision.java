package Composition.House;

public class Telivision {

    private final String Manufacturer;
    private final String color;
    private final int YearOfManufacturing;
    private final int size;

    public Telivision(String manufacturer, String color, int yearOfManufacturing, int size) {
        Manufacturer = manufacturer;
        this.color = color;
        YearOfManufacturing = yearOfManufacturing;
        this.size = size;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacturing() {
        return YearOfManufacturing;
    }

    public int getSize() {
        return size;
    }

    public void turnOnTv() {
        System.out.println("TV is switched ON");
    }

    public void turnOffTv() {
        System.out.println("Turned off TV");
    }

    public void changeChannel() {
        System.out.println("Changing channel");
    }
}
