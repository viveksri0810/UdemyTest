package setChallenge;

import java.util.*;

public class HeavenlyBodyMain {

    public static void main(String[] args) {

        Map<String,HeavenlyBody> solarSystem = new HashMap<>();
        Set<HeavenlyBody> planet=new HashSet<>();



        HeavenlyBody  earth;

        earth=new Planet("Earth", 365);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);
        earth=new Planet("Mercury", 88);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);
        earth=new Planet("Venus", 255);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);
        earth=new Planet("Mars", 687);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);
        earth=new Planet("Jupiter", 842);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);
        earth=new Planet("Jupiter", 922);
        solarSystem.put(earth.getName(),earth);
        planet.add(earth);

        for (HeavenlyBody heavenlyBody:planet){
            System.out.println(heavenlyBody);
        }

        System.out.println("==================================================");

        for (String s:solarSystem.keySet()){
            System.out.println(solarSystem.get(s));
        }

        System.out.println("==================================================");

        System.out.println(solarSystem);




    }
}
