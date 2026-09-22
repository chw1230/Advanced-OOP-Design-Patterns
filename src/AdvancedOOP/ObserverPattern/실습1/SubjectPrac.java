package AdvancedOOP.ObserverPattern.실습1;


public interface SubjectPrac {
    void registerObserver(ObserverPrac o);
    void removeObserver(ObserverPrac o);
    void notifyObservers(Object arg);
}
