package AdvancedOOP.StrategyPattern.과제;

public class WindyDayStrategy implements FlightStrategy {
    @Override
    public void fly(String destination) {
        System.out.println("바람 심한 날: 저고도에서 안정적으로  " + destination + "까지 이동");
    }
}
