package Composition.House;

public class House {

    private final int length;
    private final int height;
    private final String color;
    private final Furniture furniture;
    private final Bed bed;
    private final Wall wall;
    private final Telivision telivision;


    public House(int length, int height, String color, Furniture furniture, Bed bed, Wall wall, Telivision telivision) {
        this.length = length;
        this.height = height;
        this.color = color;
        this.furniture = furniture;
        this.bed = bed;
        this.wall = wall;
        this.telivision = telivision;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Bed getBed() {
        return bed;
    }

    public Wall getWall() {
        return wall;
    }

    public Telivision getTelivision() {
        return telivision;
    }
}
