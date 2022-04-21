package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listInteger=new ArrayList();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.add(2);
        listInteger.add(9);
        Iterator iterator=listInteger.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
        System.out.println("==========================================");
        Collections.sort(listInteger);
        iterator=listInteger.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
