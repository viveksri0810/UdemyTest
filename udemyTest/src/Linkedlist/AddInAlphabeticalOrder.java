package Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;


public class AddInAlphabeticalOrder {

    LinkedList<String> linkedList=new LinkedList<>();
    ListIterator<String> iterator=linkedList.listIterator();

    public void add(String city){
        if(linkedList.size() !=0){
            while (iterator.hasNext()){
               int num= iterator.next().compareTo(city);
                if(num == 0){
                    System.out.println(city + "already exist in list");
                    return;
                }else if (num > 0){
                    iterator.previous();
                    iterator.add(city);
                    return;
                }
            }
        }
        iterator.add(city);
    }

    public void print(){
        for (String s : linkedList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        AddInAlphabeticalOrder add=new AddInAlphabeticalOrder();
        String city="goa";
        String city1="punjab";
//        String city2="up";
//        String city3="mp";
//      adding city
        add.add(city);
        add.add(city1);
//        add.add(city2);
//        add.add(city3);

//      printing city
        add.print();

    }
}
