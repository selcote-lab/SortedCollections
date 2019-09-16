package com.tonasolution;

import java.util.Map;

public class Main {
    private static final StockList  stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.5, 10);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 5);
        stockList.addStock(temp);

        System.out.println(stockList);

    }
}
