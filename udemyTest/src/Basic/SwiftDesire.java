package Basic;

public class SwiftDesire extends Car {

    private double price;


    public SwiftDesire( String color, boolean music, double price) {
        super( 5,color, music);
        this.price=price;

    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        SwiftDesire swiftDesire=new SwiftDesire("blue",true,850000);
        System.out.println(swiftDesire.getPrice() +" "+ swiftDesire.getNoOfSeat() + " " + swiftDesire.getNoOfTire() + swiftDesire.getSteering());


    }

}
