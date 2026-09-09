package AdvancedOOP.StrategyPattern.과제;

public class SunnyDayStrategy implements FlightStrategy {
    @Override
    public void fly(String destination) {
        System.out.println("맑은 날: 직선 경로로 빠르게 " + destination + "까지 이동");
    }
}
