package AdvancedOOP.StrategyPattern.과제;

public class RainyDayStrategy implements FlightStrategy {
    @Override
    public void fly(String destination) {
        System.out.println("비 오는 날: 건물 사이로 우회하며 " + destination + "까지 이동");
    }
}
