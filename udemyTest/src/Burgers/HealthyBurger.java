package Burgers;

public class HealthyBurger extends BaseBurger {

    private final Olive olive;
    private final Garlic garlic;


    public HealthyBurger(BreadRoll breadRoll, Meat meat, Tomato tomato, Carrot carrot, Onion onion, Beetrt beetrt, Olive olive, Garlic garlic) {
        super(breadRoll, meat, tomato, carrot, onion, beetrt);
        this.olive = olive;
        this.garlic = garlic;
    }

    public Olive getOlive() {
        return olive;
    }

    public Garlic getGarlic() {
        return garlic;
    }

    @Override
    public void addBreadRoll() {
        setPrice(getPrice() + getBreadRoll().getBrownBreadRollPrice());
        System.out.println("BrownBreadRoll added");
    }


    public void addOlive() {
        setPrice(getPrice() + getOlive().getPrice());
        System.out.println("Olive  added");
    }

    public void addGarlic() {
        setPrice(getPrice() + getGarlic().getPrice());
        System.out.println("Garlic  added");
    }
}
