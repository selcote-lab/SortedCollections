package com.tonasolution;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            StockItem stockItem = this.list.getOrDefault(item.getName(), item);

            if(stockItem != item){
                item.adjustStock(stockItem.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);
        if((inStock != null) && (inStock.quantityInStock() > quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return inStock.quantityInStock();
        }
        return 0;
    }

    public Map<String, StockItem> getList() {
        return Collections.unmodifiableMap(this.list);
    }

    public StockItem get(String key){
        return this.list.get(key);
    }

    @Override
    public String toString() {
       String s = "\n Stock List \n";
       double totalCost = 0.0;

       for(Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s  = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
       }

       return s + " Total stock value " + totalCost;
    }
}
