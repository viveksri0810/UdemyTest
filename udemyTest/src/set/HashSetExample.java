package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample extends HeavenlyBody{

    Set<String> hashSet=new HashSet<>();

    public HashSetExample(String name, int orbitalTime) {
        super(name, orbitalTime);
    }


    public Set<String> getHashSet() {
        return hashSet;
    }

    public void addValues(){
        hashSet.add("a");
    }


}
