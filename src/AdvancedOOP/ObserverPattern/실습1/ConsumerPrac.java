package AdvancedOOP.ObserverPattern.실습1;

public class ConsumerPrac implements ObserverPrac {
    private int num;

    public ConsumerPrac(int num) {
        this.num = num;
    }

    @Override
    public void update(Object arg) {
        System.out.println("num: " + num + " | ConsumerPrac update : " + arg);
    }
}
