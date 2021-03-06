package Interface;

import java.util.ArrayList;

public class Player implements ISavable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hotPoints, int strength) {
        this.name = name;
        this.hitPoints = hotPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHotPoints() {
        return hitPoints;
    }

    public void setHotPoints(int hotPoints) {
        this.hitPoints = hotPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hotPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }


    @Override
    public ArrayList<String> write() {

        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null & savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }

    }
}
