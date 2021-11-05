package ArrayList1;

import java.util.ArrayList;

public class GroceryList {

    private  ArrayList<String> list;

    public GroceryList() {
        this.list =new ArrayList<>();
    }



    public  String addItem(String str ){

        list.add(str);
        String returnText = "item "+ str + " has been added in the list";
        return returnText;
    }

    public String removeItem(String str){
        int i=list.indexOf(str);
        System.out.println(i);
        list.remove(i);
  //       list.remove(str);
        String returnText ="item " + str +" has been removed from the list";
        return returnText;
    }

    public String editItem(String str,String str1){
        int i=list.indexOf(str);
        list.set(i,str1);
        String returnText ="item " + str +" has been replaced with " + str1 + " from the list";
        return returnText;
    }

    public void printItem(){
        System.out.println("Printing item from list .....");
        for (String ary : list ) {
            System.out.println(ary);
        }
    }


}
