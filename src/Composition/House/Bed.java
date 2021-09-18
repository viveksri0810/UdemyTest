package Composition.House;

public class Bed {

    private String Size;
    private String type;
    private int length;
    private int width;
    private int height;

    public Bed(String size, String type, int length, int width, int height) {
        Size = size;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getSize() {
        return Size;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
