package Composition.PC;

public class Case {

    private String model;
    private String manufacturer;
    private String supply;
    private Dimension dimension;


    public void pressPowerButton(){
        System.out.println("power button is pressed");
    }

    public Case(String model, String manufacturer, String supply, Dimension dimension1) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.supply = supply;
        this.dimension = dimension1;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSupply() {
        return supply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
