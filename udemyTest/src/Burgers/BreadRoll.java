package Burgers;

public class BreadRoll {
    private final double whiteBreadRollPrice;
    private final double brownBreadRollPrice;


    public BreadRoll(double whiteBreadRollPrice, double brownBreadRollPrice) {
        this.whiteBreadRollPrice = whiteBreadRollPrice;
        this.brownBreadRollPrice = brownBreadRollPrice;
    }


    public double getWhiteBreadRollPrice() {
        return whiteBreadRollPrice;
    }

    public double getBrownBreadRollPrice() {
        return brownBreadRollPrice;
    }
}
