package Burgers;

public class Main {

    public static void main(String[] args) {


        BreadRoll breadRoll = new BreadRoll(20, 40);
        Meat meat = new Meat(30);
        Tomato tomato = new Tomato(5);
        Carrot carrot = new Carrot(5);
        Onion onion = new Onion(5);
        Beetrt beetrt = new Beetrt(5);
        Olive olive = new Olive(10);
        Garlic garlic = new Garlic(5);
        Chips chips = new Chips(10);
        Drinks drinks = new Drinks(20);

        System.out.println("*****************Base Burger******************");
        BaseBurger baseBurger = new BaseBurger(breadRoll, meat, tomato, carrot, onion, beetrt);
        baseBurger.addBreadRoll();
        System.out.println(baseBurger.getPrice());
        baseBurger.addMeat();
        System.out.println(baseBurger.getPrice());
        baseBurger.addCarrot();
        System.out.println(baseBurger.getPrice());
        baseBurger.addOnion();
        System.out.println(baseBurger.getPrice());
        baseBurger.addBeetrt();
        System.out.println(baseBurger.getPrice());


        System.out.println("*****************Healthy Burger******************");
        HealthyBurger healthyBurger = new HealthyBurger(breadRoll, meat, tomato, carrot, onion, beetrt, olive, garlic);
        healthyBurger.addBreadRoll();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addMeat();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addCarrot();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addOnion();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addBeetrt();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addOlive();
        System.out.println(healthyBurger.getPrice());
        healthyBurger.addGarlic();
        System.out.println(healthyBurger.getPrice());


        System.out.println("*****************Delux Burger******************");
        DeluxBurger deluxBurger = new DeluxBurger(breadRoll, meat, tomato, carrot, onion, beetrt, chips, drinks);
        deluxBurger.addBreadRoll();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addMeat();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addCarrot();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addOnion();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addBeetrt();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addChips();
        System.out.println(deluxBurger.getPrice());
        deluxBurger.addDrinks();
        System.out.println(deluxBurger.getPrice());
    }
}
