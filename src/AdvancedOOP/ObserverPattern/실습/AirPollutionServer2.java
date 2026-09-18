package AdvancedOOP.ObserverPattern.실습;

import java.util.ArrayList;
import java.util.List;

public class AirPollutionServer2 implements Runnable, AirPollutionServer {

    // 옵저버들을 관리하는 리스트
    private final List<AirPollutionObserver> observers = new ArrayList<>();
    private int pollution = 50; // 초기 미세 먼지
    private boolean stop = false; // 미세 먼저 변경 여부 신호
    private int sleepDuration;

    public AirPollutionServer2(int duration) {
        this.sleepDuration = duration * 1000;
    }

    // 옵저버 등록 메서드
    @Override
    public void addObserver(AirPollutionObserver observer) {
        observers.add(observer);
    }

    // 옵저버 삭제 메서드
    @Override
    public void removeObserver(AirPollutionObserver observer) {
        observers.remove(observer);
    }

    // 상태 변경 시 모든 옵저버에게 알림
    @Override
    public void notifyObservers() {
        for (AirPollutionObserver observer : observers) {
            observer.onPollutionChanged(pollution);
        }
    }

    @Override
    public void run() {
        while (!stop) {
            int plusMinus = RandIntInRange.nextInt(0, 1); // 증감 표시
            int pollutionDiff = RandIntInRange.nextInt(1, 10);

            if (plusMinus == 1) { // 증가
                pollution += pollutionDiff; // 적용
            } else { // 감소
                pollution -= pollutionDiff; // 적용
                if (pollution < 0) { // 미세먼지 음수 불가능
                    pollution = 0;
                }
            }

            System.out.printf("Server: pollution = %d\n", pollution);

            // 값이 바뀔 때마다 옵저버들에게 통보
            notifyObservers();

            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    @Override
    public void stopThread() {
        this.stop = true;
    }
}
