package AdvancedOOP.ObserverPattern.과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockSubjectssss implements Runnable, StockSubject {
    private final List<StockObserver> observers = new ArrayList<>();
    private final String name;
    private final Random rand = new Random();
    private int price; // 가격
    private boolean stop = false;

    public StockSubjectssss(String name) {
        this.name = name; // 주식 이름
        this.price = rand.nextInt(30, 151); //  가격
    }

    @Override
    public void run() {
        while (!stop) {
            int oldPrice = price; // 가격이 변하기 전꺼 저장해두기!
            int plusMinus = rand.nextInt(10, 21);
            int num = rand.nextInt(0, 2);
            if (num == 0) { // 감소 증가 중 감소하는 로직
                plusMinus *= -1;
                // 증가는 그냥 두면 됨!
            }
            price = Math.max(price + plusMinus, 0); // 가격 음수 방지
            notifyObservers(name, oldPrice, price);

            try {
                Thread.sleep(1000);              // 1초 간격
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stopThread() {
        stop = true;
    }

    @Override
    public void registerObserver(StockObserver o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(StockObserver o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers(Object name, Object oldValue, Object newValue) {
        for (StockObserver ob : observers) {
            ob.update(name, oldValue, newValue);
        }
    }
}
