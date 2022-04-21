package MapChallenge1;

import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final String name;
    private final Map<String, StockItem> stockItemList;
    private final Map<String, StockItem> stockItemInBucketList;

    public StockList(String name) {
        this.name = name;
        this.stockItemList = new HashMap<>();
        this.stockItemInBucketList=new HashMap<>();
    }

    public int modifyItem(StockItem stockItem) {
        if (stockItem != null) {
            StockItem stockItem1 = stockItemList.getOrDefault(stockItem.getName(), stockItem);
            if (stockItem != stockItem1) {
                stockItem.modifyQuantity(stockItem1.getQuantity());
            }
            if (stockItem.getQuantity() >= 0) {
                stockItemList.put(stockItem.getName(), stockItem);
            } else return 0;

            return 1;
        }
        return 0;
    }


    public StockItem itemAddedToCart(String name, int quantity) {
        StockItem a=stockItemList.get(name);
        int b=a.getQuantity();
        int c=((stockItemInBucketList.get(name)==null)?0:stockItemInBucketList.get(name).getQuantity());
        if (a != null && b-
                 c>= quantity && c+quantity>=0) {
            StockItem stockItem = stockItemList.get(name);
//            stockItem.modifyQuantity(-quantity);
            StockItem stockItemAddedInBucket=new StockItem(stockItem.getName(), stockItem.getPrice(), quantity);
            StockItem checkItemInBucket=stockItemInBucketList.get(stockItemAddedInBucket.getName());
            if(checkItemInBucket!=null ){
                stockItemAddedInBucket.modifyQuantity(checkItemInBucket.getQuantity());
            }
            stockItemInBucketList.put(stockItemAddedInBucket.getName(),stockItemAddedInBucket);
            return new StockItem(stockItem.getName(), stockItem.getPrice(), quantity);
        }
        return null;
    }

    public int chekOut(StockBucket bucket){
        if(bucket!=null){
            Map<String,StockItem> chekOutMap = bucket.getBucketList();
            for(String str:chekOutMap.keySet()){
                stockItemInBucketList.get(str).modifyQuantity(-(chekOutMap.get(str).getQuantity()));
                if(stockItemInBucketList.get(str).getQuantity()==0){
                    stockItemInBucketList.remove(str);
                }
                stockItemList.get(str).modifyQuantity(-(chekOutMap.get(str).getQuantity()));
            }
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "StockList{" +
                "name='" + name + '\'' +
                ", stockItemList=" + stockItemList + ",StockItemInBucket=" + stockItemInBucketList +
                '}';
    }
}
