package InnerClass;

public class GearBox {

    public void changeGear(int gear){
        Gear setGear=new Gear();

        switch (gear) {
            case 1:
                int currentGear = setGear.getGear1();
                System.out.println("Current Gear : " + currentGear);
                break;

            case 2:
                currentGear =setGear.getGear2();
                System.out.println("Current Gear : " + currentGear);
                break;

            case 3:
                currentGear = setGear.getGear3();
                System.out.println("Current Gear : " + currentGear);
                break;

            case 4:
                currentGear = setGear.getGear4();
                System.out.println("Current Gear : " + currentGear);
                break;

            case 5:
                currentGear =setGear.getGear5();
                System.out.println("Current Gear : " + currentGear);
                break;

            case 0:
                currentGear = setGear.getReverse();
                System.out.println("Current Gear : " + currentGear);
                break;
        }

    }



    public static class Gear {

        final int gear1=1;
        final int gear2=2;
        final int gear3=3;
        final int gear4=4;
        final int gear5=5;
        final int reverse=0;

        public int getGear1() {
            return gear1;
        }

        public int getGear2() {
            return gear2;
        }

        public int getGear3() {
            return gear3;
        }

        public int getGear4() {
            return gear4;
        }

        public int getGear5() {
            return gear5;
        }

        public int getReverse() {
            return reverse;
        }
    }
}
