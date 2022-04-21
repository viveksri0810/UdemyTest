package mapChallenge;

import java.util.HashMap;
import java.util.Map;

public  class Location {

    private final int locationId;
    private final String description;
    private final Map<String,Integer> exits;

    public Location(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        exits=new HashMap<>();
        exits.put("Q",0);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExits(String str,int locationId){
        exits.put(str,locationId);
    }
}
