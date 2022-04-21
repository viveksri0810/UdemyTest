package set;

import java.util.*;

public class HeavenlyBodyChallengeMain {

    private static Map<String,HeavenlyBodyChallenge> solarSystem =new HashMap<>();
    private static Set<HeavenlyBodyChallenge> planets=new HashSet<>();
    public static void main(String[] args) {


        HeavenlyBodyChallenge temp=new Planet("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new Planet("Venus",95);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new Planet("Earth",100);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new Planet("Mars",105);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp=new Planet("Jupiter",110);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new Moon("Moon",24);
        solarSystem.put(temp.getName(),temp);
        solarSystem.get("Earth").addSatellite(temp);

        temp=new Moon("Titan",25);
        solarSystem.put(temp.getName(),temp);
        solarSystem.get("Mars").addSatellite(temp);

        temp=new Moon("Europa",24);
        solarSystem.put(temp.getName(),temp);
        solarSystem.get("Mars").addSatellite(temp);

        temp=new Moon("Phobos",24);
        solarSystem.put(temp.getName(),temp);
        solarSystem.get("Jupiter").addSatellite(temp);

        temp=new Moon("Triton",24);
        solarSystem.put(temp.getName(),temp);
        solarSystem.get("Jupiter").addSatellite(temp);


         System.out.println(planets);

         for(String s:solarSystem.keySet()){
             System.out.println(solarSystem.get(s));
         }


    }
}
