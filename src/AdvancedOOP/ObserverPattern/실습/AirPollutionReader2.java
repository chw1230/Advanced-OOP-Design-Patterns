package AdvancedOOP.ObserverPattern.실습;

public class AirPollutionReader2 implements AirPollutionObserver {
    @Override
    public void onPollutionChanged(int pollution) {
        // 미세먼지 농도가 갱신될 때마다 자동으로 실행됨
        System.out.printf("-> Client Reader Received: pollution = %d\n", pollution);
    }
}
