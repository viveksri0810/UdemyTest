package InnerClass;

public class Main {

    public static void main(String[] args) {

        GearBox gearBox=new GearBox();
        gearBox.changeGear(3);

        GearBox.Gear gear= new GearBox.Gear();
        System.out.println(gear.getGear1());
    }
}
