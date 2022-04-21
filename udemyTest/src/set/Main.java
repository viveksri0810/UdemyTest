package set;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Map<String,HeavenlyBody> planet = new HashMap<>();

        HeavenlyBody heavenlyBody=new HeavenlyBody("Mercury",20);
        planet.put(heavenlyBody.getName(),heavenlyBody);

        heavenlyBody=new HeavenlyBody("Venus",40);
        planet.put(heavenlyBody.getName(),heavenlyBody);

        heavenlyBody=new HeavenlyBody("Earth",20);
        planet.put(heavenlyBody.getName(),heavenlyBody);

        heavenlyBody=new HeavenlyBody("Mars",20);
        planet.put(heavenlyBody.getName(),heavenlyBody);

        heavenlyBody=new HeavenlyBody("Jupiter",20);
        planet.put(heavenlyBody.getName(),heavenlyBody);


        planet.get("Earth").addSatellite("Moon");

        planet.get("Mars").addSatellite("phobos");
        planet.get("Mars").addSatellite("deimos");

        planet.get("Jupiter").addSatellite("europa");
        planet.get("Jupiter").addSatellite("ganymede");
        planet.get("Jupiter").addSatellite("lo");
        planet.get("Jupiter").addSatellite("callisto");

        for (String s1: planet.keySet()){
            System.out.println(planet.get(s1));
        }
    }
}
