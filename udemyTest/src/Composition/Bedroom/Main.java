package Composition.Bedroom;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");

        Ceiling ceiling = new Ceiling(22, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Vivek", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
