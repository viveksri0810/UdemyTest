package Generics;


import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);


        printDouble(arrayList);

    }

    public static void printDouble(ArrayList<Integer> arr) {
        for (Integer a : arr) {
            System.out.println(a * 2);
        }

    }


}
