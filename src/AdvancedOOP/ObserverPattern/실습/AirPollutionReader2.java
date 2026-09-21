package AdvancedOOP.ObserverPattern.실습;

public class AirPollutionReader2 implements AirPollutionObserver {
    private int num;

    public AirPollutionReader2(int num) {
        this.num = num;
    }

    @Override
    public void onPollutionChanged(Object pollution) {
        // 미세먼지 농도가 갱신될 때마다 자동으로 실행됨
        System.out.printf("-> Client Reader(%d) Received: pollution = %d\n", num, (int) pollution);
    }
}
