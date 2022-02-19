package ArrayList;

import java.util.ArrayList;

public class GroceryList {

    private final ArrayList<String> groceryList;

    public GroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    public static void main() {
        System.out.println("this is main method");
    }

    public static void main(String[] args) {
        System.out.println("this is main method wit string args ");
    }

    public void printGroceryItems() {
        System.out.println("Printing item from grocery List .....");
        for (String s : groceryList) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }

    public void addItem(String item) {
        //     System.out.println("adding item");
        groceryList.add(item);
        System.out.println(item + " added.");
    }

    public void modifyGroceryItem(String name, String name1) {
        int i = groceryList.indexOf(name);
        if (i < 0) {
            System.out.println(name + " not present in list, adding it ");
            addItem(name1);
        } else {
            groceryList.set(i, name1);
            System.out.println(name + " has been modified as " + name1);
        }
    }
}
