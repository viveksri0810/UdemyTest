package setChallenge;

public class Planet extends HeavenlyBody{
    public Planet(String name, int orbitalTime) {
        super(name, BodyTypes.Planet, orbitalTime);
    }

    @Override
    public void addSatellite(HeavenlyBody satellite) {
        if(satellite.getBodyTypes()==BodyTypes.Moon){
            super.addSatellite(satellite);
            System.out.println(satellite + "Added....");
        } else {
            System.out.println("Can not add satellite other than Moon");
        }
    }


    @Override
    public String toString() {
        return this.getName() + " " + this.getBodyTypes() + " " + this.getOrbitalTime() + " " + this.getSatellite();
    }
}
