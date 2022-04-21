package set;

public class Planet extends HeavenlyBodyChallenge{
    public Planet(String name, int orbitalTime) {
        super(name,BodyTypes.PLANET, orbitalTime);
    }

    @Override
    public boolean addSatellite(HeavenlyBodyChallenge satellite){
        if(satellite.getBodyType()==BodyTypes.MOON){
            return super.addSatellite(satellite);
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        return this.getName() + " : " + this.getBodyType() + " : " + this.getOrbitalTime() + " : "+this.getSatellite() +"\n";
    }
}
