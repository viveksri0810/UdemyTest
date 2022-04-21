package setChallenge;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class HeavenlyBody {

    private final String name;
    private final BodyTypes bodyTypes;
    private final int orbitalTime;
    private final Set<HeavenlyBody> satellite;

    public enum BodyTypes{
        Moon,
        Planet,
        DwarfPlanet
    }

    public HeavenlyBody(String name, BodyTypes bodyTypes, int orbitalTime){
        this.name=name;
        this.bodyTypes=bodyTypes;
        this.orbitalTime=orbitalTime;
        this.satellite=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyTypes() { return bodyTypes; }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public Set<HeavenlyBody> getSatellite() {
        return new HashSet<>(satellite);
    }

    public void addSatellite(HeavenlyBody satellite){
        this.satellite.add(satellite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavenlyBody)) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return Objects.equals(getName(), that.getName()) && getBodyTypes() == that.getBodyTypes();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBodyTypes());
    }
}
