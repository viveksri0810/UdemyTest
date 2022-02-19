package Autoboxing_Unboxing;

import java.util.ArrayList;

public class Customer {

    private final String name;
    private ArrayList<Double> doubleArrayList;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, double amt) {
        this.name = name;
        doubleArrayList = new ArrayList<>();
        this.doubleArrayList.add(amt);

    }

    public String getName() {
        return name;
    }


    public ArrayList<Double> getDoubleArrayList() {
        return doubleArrayList;
    }

    public void setDoubleArrayList(double amt) {
        this.doubleArrayList.add(amt);
    }

    @Override
    public String toString() {
        return '\n' + "Customer{" +
                "name='" + name + '\'' +
                ", doubleArrayList=" + doubleArrayList +
                '}';

    }
}
