package Composition.PC;

public class Monitor {

    private String model;
    private String Manufacturer;
    private int size;
    private Resolution native_resolution;

    public Monitor(String model, String manufacturer, int size, Resolution native_resolution) {
        this.model = model;
        Manufacturer = manufacturer;
        this.size = size;
        this.native_resolution = native_resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNative_resolution() {
        return native_resolution;
    }

    public void drawPixelAt(int x, int y,String color){
        System.out.println("drawing pixel at "+x+","+y+ " in color "+ color);
    }
}
