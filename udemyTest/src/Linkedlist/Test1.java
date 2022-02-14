package Linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {


        LinkedList<String> cityVisiting=new LinkedList<String>();
        cityVisiting.add("Goa");
        cityVisiting.add("Spiti");
        cityVisiting.add("Coorg");
        cityVisiting.add("gangtok");
        cityVisiting.add(1,"Darjeeling");

        printList(cityVisiting);

        System.out.println("=========================");

        ArrayList<String> cityVisiting1=new ArrayList<String>();
        cityVisiting1.add("Goa");
        cityVisiting1.add("Spiti");
        cityVisiting1.add("Coorg");
        cityVisiting1.add("gangtok");
        cityVisiting1.add("Darjeeling");

        printList(cityVisiting1);
    }

//    public static void printList(LinkedList<String> list){
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
////        Iterator<String> iterator=list.iterator();
//////        System.out.println(iterator.next());
//////        System.out.println(iterator.next());
//////        System.out.println(iterator.next());
////
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
////        }
//    }

    public static void printList(List<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }


}
