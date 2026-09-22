package AdvancedOOP.ObserverPattern.실습1;

public class Main {
    public static void main(String[] args) {
        SupplierPrac sp = new SupplierPrac();
        ConsumerPrac cp1 = new ConsumerPrac(1);
        ConsumerPrac cp2 = new ConsumerPrac(2);

        sp.registerObserver(cp1);
        sp.registerObserver(cp2);
        for (int i = 0; i < 5; i++) {
            System.out.println("run cnt: " + i);
            sp.run();
        }

    }
}
