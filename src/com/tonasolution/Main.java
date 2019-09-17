package com.tonasolution;

import java.util.Map;

public class Main {
    private static final StockList  stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 1);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.5, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.5, 10);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 5);
        stockList.addStock(temp);

        System.out.println(stockList);


        Basket zouBasket = new Basket("Zouhaire");
//        sellItem(zouBasket, "Cup", 3);
//        System.out.println(zouBasket);

        sellItem(zouBasket, "Door", 3);
        System.out.println(zouBasket);
//
//        sellItem(zouBasket, "Door", 1);
//        System.out.println(zouBasket);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        System.out.println("stockItem ----" + stockItem);
        if(stockItem == null){
            System.out.println(" We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0){
            System.out.println("stockItem quantity----" + stockItem);
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
