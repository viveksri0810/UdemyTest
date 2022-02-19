package Basic;

public class Car extends Vehicle {
    private final int noOfTire = 4;
    private final boolean music;


    public Car(int noOfSeat, String color, boolean music) {
        super("round", noOfSeat, color);
        this.music = music;
    }

    public int getNoOfTire() {
        return noOfTire;
    }

    public boolean isMusic() {
        return music;
    }
}
