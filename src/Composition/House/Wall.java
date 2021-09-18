package Composition.House;

public class Wall {

    private int lenght;
    private int height;
    private String Color;
    private String direction;

    public Wall(int lenght, int height, String color, String direction) {
        this.lenght = lenght;
        this.height = height;
        Color = color;
        this.direction = direction;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return Color;
    }

    public String getDirection() {
        return direction;
    }
}
