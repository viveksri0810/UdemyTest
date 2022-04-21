package MapChallenge1;

public class StockItem implements Comparable {

    private final String name;
    private Double price;
    private int quantity;

    public StockItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public StockItem(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changePrice(Double price) {
        this.price = price;
    }

    public void modifyQuantity(int quantity) {
        if (this.quantity + quantity >= 0) {
            this.quantity = this.quantity + quantity;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return getName().equalsIgnoreCase(stockItem.getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + 20;
    }

    @Override
    public int compareTo(Object o) {
        StockItem stockItem = (StockItem) o;
        return this.getName().compareToIgnoreCase(stockItem.getName());
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + quantity;
    }

//    @Override
//    public int compareTo(Object o) {
//        StockItem stockItem=(StockItem) o;
//        return this.getPrice().compareTo(stockItem.getPrice());
//    }
}
