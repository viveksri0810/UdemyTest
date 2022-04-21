package MapChallenge1;

import java.util.HashMap;
import java.util.Map;

public class StockBucket {

    private final String name;
    private final Map<String, StockItem> bucketList;

    public StockBucket(String name) {
        this.name = name;
        this.bucketList = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, StockItem> getBucketList() {
        return bucketList;
    }

    public int modifyItemInBucket(StockItem stockItem) {

        if (stockItem != null) {
            StockItem stockItem1=bucketList.getOrDefault(stockItem.getName(),stockItem);
            if (stockItem!=stockItem1){
                stockItem.modifyQuantity(stockItem1.getQuantity());
            }
            if(stockItem.getQuantity()==0){
                bucketList.remove(stockItem.getName());

            }else {
                bucketList.put(stockItem.getName(), stockItem);
            }
            return 1;
        }
        System.out.println("Item not in list");
        return 0;
    }



    @Override
    public String toString() {
        return "StockBucket{" +
                "name='" + name + '\'' +
                ", bucketList=" + bucketList +
                '}';
    }
}
