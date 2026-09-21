package AdvancedOOP.ObserverPattern.과제;

public class ThresholdAlert implements StockObserver {
    private final int lower;
    private final int upper;

    public ThresholdAlert(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void update(Object stockName, Object oldPrice, Object newPrice) {
        int price = (int) newPrice;
        if (price >= upper) {
            System.out.printf("[%s] : %d (상한 %d 이상)%n", stockName, price, upper);
        } else if (price <= lower) {
            System.out.printf("[%s] : %d (하한 %d 이하)%n", stockName, price, upper);
        }
    }
}
