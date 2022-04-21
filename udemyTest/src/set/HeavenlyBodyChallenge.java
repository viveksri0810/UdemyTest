package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBodyChallenge {

    private final String name;
    private final int orbitalTime;
    private final BodyTypes bodyType;
    private final Set<HeavenlyBodyChallenge> satellite;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBodyChallenge(String name, BodyTypes bodyType, int orbitalTime){
        this.name=name;
        this.orbitalTime=orbitalTime;
        this.bodyType=bodyType;
        this.satellite=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public Set<HeavenlyBodyChallenge> getSatellite() {
        return new HashSet<>(satellite);
    }

    public boolean addSatellite(HeavenlyBodyChallenge satellite){
            return this.satellite.add(satellite);
    }



    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavenlyBodyChallenge)) return false;
        HeavenlyBodyChallenge that = (HeavenlyBodyChallenge) o;
        if(Objects.equals(name, that.name) && Objects.equals(bodyType, that.bodyType) ){
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode()+this.bodyType.hashCode();
    }

    @Override
    public String toString(){
        return this.name + " : " + this.bodyType + " : " + this.orbitalTime;
    }


}
