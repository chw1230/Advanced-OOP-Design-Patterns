package AdvancedOOP.ObserverPattern.실습;

public interface AirPollutionServer {
    void addObserver(AirPollutionObserver observer);
    void removeObserver(AirPollutionObserver observer);
    void notifyObservers(Object arg);
    void stopThread();
}
