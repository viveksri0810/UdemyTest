package ArrayList1;

public class User {
    public static void main(String[] args) {
        GroceryList gslst = new GroceryList();

        gslst.printItem();
        gslst.addItem("potato");
        gslst.addItem("tomato");
        gslst.printItem();
        gslst.editItem("potato", "potatoes");
        gslst.printItem();
        gslst.removeItem("potatoes");
        gslst.printItem();


    }
}
