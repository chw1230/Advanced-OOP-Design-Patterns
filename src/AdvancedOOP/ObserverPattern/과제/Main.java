package AdvancedOOP.ObserverPattern.과제;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<StockSubjectServer> stocks = List.of(new StockSubjectServer("삼성전자"), new StockSubjectServer("하이닉스"), new StockSubjectServer("현대자동차"));

        PriceLogger logger = new PriceLogger();
        ThresholdAlert alert = new ThresholdAlert(60, 120);

        List<Thread> threads = new ArrayList<>();
        for (StockSubjectServer s : stocks) {
            s.registerObserver(logger);   // 스레드 시작 전에 등록
            s.registerObserver(alert);
            Thread t = new Thread(s);
            t.start();
            threads.add(t);
        }

        Thread.sleep(10_000);
        stocks.get(0).removeObserver(logger);      // 삼성전자 로그만 끊기는지 확인
        Thread.sleep(5_000);
        stocks.get(0).registerObserver(logger);    // 다시 등록
        Thread.sleep(5_000);

        for (StockSubjectServer s : stocks) {
            s.stopThread();
        }
        for (Thread t : threads) {
            t.interrupt();
        }
    }
}
