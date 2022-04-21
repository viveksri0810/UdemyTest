package setChallenge;

public class Moon extends HeavenlyBody{
    public Moon(String name, int orbitalTime) {
        super(name, BodyTypes.Moon, orbitalTime);
    }

    @Override
    public void addSatellite(HeavenlyBody satellite) {
        System.out.println("Can not add satellite for Moon");
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getBodyTypes() + " " + this.getOrbitalTime();
    }
}
