package AdvancedOOP.ObserverPattern.실습1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SupplierPrac implements SubjectPrac {
    private List<ObserverPrac>  observers;
    private Random random;


    public SupplierPrac() {
        this.observers = new ArrayList<ObserverPrac>();
        this.random = new  Random();
    }

    @Override
    public void registerObserver(ObserverPrac o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverPrac o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (ObserverPrac o : observers) {
            o.update(arg);
        }
    }

    public void run() {
        int v = random.nextInt(11);
        if (v > 5) {
            notifyObservers(v);
        }
    }
}