package MapChallenge1;

public class StockMain {

    public static void main(String[] args) {
        StockList stockList = new StockList("Vivek");
        StockItem stockItem = new StockItem("Bread", 10.00, 10);
        stockList.modifyItem(stockItem);
        stockItem = new StockItem("Butter", 50.00, 2);
        stockList.modifyItem(stockItem);
        stockItem = new StockItem("Butter", 52.00, 2);
        stockList.modifyItem(stockItem);
        stockItem = new StockItem("Butter", 50.00, -5);
        stockList.modifyItem(stockItem);
        System.out.println(stockList);

        StockBucket stockBucket = new StockBucket("my cart");
        stockBucket.modifyItemInBucket(stockList.itemAddedToCart("Butter", 1));
        stockBucket.modifyItemInBucket(stockList.itemAddedToCart("Bread", 10));
        stockBucket.modifyItemInBucket(stockList.itemAddedToCart("Bread", -11));
        System.out.println(stockBucket);
        System.out.println(stockList);

        StockBucket stockBucket1 = new StockBucket("my cart 1");
        stockBucket1.modifyItemInBucket(stockList.itemAddedToCart("Butter", 1));
        stockBucket1.modifyItemInBucket(stockList.itemAddedToCart("Bread", 5));
        stockBucket1.modifyItemInBucket(stockList.itemAddedToCart("Bread", 5));
        stockBucket1.modifyItemInBucket(stockList.itemAddedToCart("Bread", -11));
        System.out.println(stockBucket1);
        System.out.println(stockList);

        stockList.chekOut(stockBucket);
        System.out.println(stockList);






    }
}
