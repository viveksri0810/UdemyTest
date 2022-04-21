package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private Map<Integer, String> location;

    public MapExample() {
        location=new HashMap<>();
    }

    public void addLocation(Integer key,String value){
        location.put(key,value);
//        System.out.println("----- added -----");
    }

    public void getDescription(int key){
        System.out.println(location.get(key));
    }

    public void printKey(){
        for(Integer key: location.keySet()){
            System.out.println(key);
        }
    }

    public boolean containsKey(int key){
       if( location.containsKey(key)){
           return true;
       }else {
           System.out.println("You can not got to that direction");
           return false;

       }

    }
}
