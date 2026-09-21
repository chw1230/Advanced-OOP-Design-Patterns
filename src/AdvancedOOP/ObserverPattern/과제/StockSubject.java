package AdvancedOOP.ObserverPattern.과제;

public interface StockSubject {
    void registerObserver(StockObserver o);

    void removeObserver(StockObserver o);

    void notifyObservers(Object name, Object oldValue, Object newValue);
}
