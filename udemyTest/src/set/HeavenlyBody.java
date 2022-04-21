package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {

    private final String name;
    private final int orbitalTime;
    private final Set<String> satellite;

    public HeavenlyBody(String name,int orbitalTime){
        this.name=name;
        this.orbitalTime=orbitalTime;
        this.satellite=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getOrbitalTime() {
        return orbitalTime;
    }

    public Set<String> getSatellite() {
        return new HashSet<>(satellite);
    }

    public void addSatellite(String satellite){
        this.satellite.add(satellite);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof HeavenlyBody)) return false;
//        HeavenlyBody that = (HeavenlyBody) o;
//        return Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


}
