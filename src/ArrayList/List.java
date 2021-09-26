package ArrayList;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList(new ArrayList<String>());
//        groceryList.getGroceryList()=new ArrayList<String>();
        groceryList.printGroceryItems();
        groceryList.addItem("potato");
        groceryList.addItem("tomato");
        groceryList.addItem("chilli");
        groceryList.printGroceryItems();
        groceryList.modifyGroceryItem("chilli","green chilli");
        groceryList.printGroceryItems();
    }
}
