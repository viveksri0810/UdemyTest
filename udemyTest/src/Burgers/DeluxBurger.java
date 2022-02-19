package Burgers;

public class DeluxBurger extends BaseBurger {

    private final Chips chips;
    private final Drinks drinks;

    public DeluxBurger(BreadRoll breadRoll, Meat meat, Tomato tomato, Carrot carrot, Onion onion, Beetrt beetrt, Chips chips, Drinks drinks) {
        super(breadRoll, meat, tomato, carrot, onion, beetrt);
        this.chips = chips;
        this.drinks = drinks;
    }

    public Chips getChips() {
        return chips;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void addChips() {
        setPrice(getPrice() + getChips().getPrice());
        System.out.println("Chips added");

    }

    public void addDrinks() {
        setPrice(getPrice() + getDrinks().getPrice());
        System.out.println("Drinks added");
    }
}
