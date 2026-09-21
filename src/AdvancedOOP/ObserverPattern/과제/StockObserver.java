package AdvancedOOP.ObserverPattern.과제;

public interface StockObserver {
    void update(Object stockName, Object oldPrice, Object newPrice);
}
