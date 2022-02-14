package Basic;

public class Vehicle {
    private String steering;
    private int noOfSeat;
    private String color;

    public Vehicle(String steering, int noOfSeat, String color) {
        this.steering = steering;
        this.noOfSeat = noOfSeat;
        this.color = color;
    }

    public String getSteering() {
        return steering;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public String getColor() {
        return color;
    }
}
