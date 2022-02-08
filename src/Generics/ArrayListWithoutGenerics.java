package Generics;


import java.util.ArrayList;

public class ArrayListWithoutGenerics {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("abc");
        arrayList.add(2);
        arrayList.add("efg");
        arrayList.add(true);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getClass().getName());
        }

        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(3);

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i).getClass().getName());
        }


    }
}
