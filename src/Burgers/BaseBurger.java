package Burgers;

public class BaseBurger {

    private BreadRoll breadRoll;
    private Meat meat;
    private Tomato tomato;
    private Carrot carrot;
    private Onion onion;
    private Beetrt beetrt;
    private double price;

    public BaseBurger(BreadRoll breadRoll, Meat meat, Tomato tomato, Carrot carrot, Onion onion, Beetrt beetrt) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
        this.beetrt = beetrt;
    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public Onion getOnion() {
        return onion;
    }

    public Beetrt getBeetrt() {
        return beetrt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addBreadRoll(){
        this.price+=getBreadRoll().getWhiteBreadRollPrice();
        System.out.println("WhiteBreadRoll added");
    }

    public void addMeat(){
        this.price+=getMeat().getPrice();
        System.out.println("Meat added");
    }

    public void addTomato(){
        this.price+=getTomato().getPrice();
        System.out.println("Tomato added");
    }

    public void addCarrot(){
        this.price+=getCarrot().getPrice();
        System.out.println("Carrot added");
    }

    public void addOnion(){
        this.price+=getOnion().getPrice();
        System.out.println("Onion added");
    }

    public void addBeetrt(){
        this.price+=getBeetrt().getPrice();
        System.out.println("Beetrt added");
    }
}
