package Basic;

public class Cubodial extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public Cubodial(double width, double length, double height) {
        super(width, length);
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public  double getVolume(){
        return getArea()*getHeight();
    }
}
