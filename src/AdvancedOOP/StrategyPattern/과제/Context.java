package AdvancedOOP.StrategyPattern.과제;

public class Context {
    private FlightStrategy strategy = new SunnyDayStrategy(); // SunnyDayStrategy로 초기화

    public void setStrategy(FlightStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliver(String destination) {
        strategy.fly(destination);
    }
}
