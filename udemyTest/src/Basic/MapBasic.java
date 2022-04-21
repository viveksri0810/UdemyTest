package Basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasic {

    private static Map<Integer,String> map;
    private static List<Integer> arrayList;

    public static void main(String[] args) {

        map=new HashMap<>();
        map.put(1,"my");
        map.put(2,"name");
        map.put(3,"is");
        map.put(4,"Vivek");

        System.out.println(map);

        arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);




    }
}
