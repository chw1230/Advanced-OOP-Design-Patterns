package AdvancedOOP.ObserverPattern.과제;

public class PriceLogger implements StockObserver {
    @Override
    public void update(Object stockName, Object oldPrice, Object newPrice) {
        System.out.println( stockName + " : " + oldPrice + " ->  " + newPrice);
    }
}
