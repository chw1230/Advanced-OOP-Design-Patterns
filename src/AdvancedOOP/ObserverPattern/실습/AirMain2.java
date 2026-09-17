package AdvancedOOP.ObserverPattern.실습;

public class AirMain2 {
    public static void main(String[] args) {
        final int duration = 5;
        // 미세 먼지 농도 변경 스레드 실행
        AirPollutionServer2 server = new AirPollutionServer2(duration);
        Thread serverThread = new Thread(server);
        serverThread.start();

        // 2. 리더(Observer) 생성 후 서버에 등록
        AirPollutionReader2 reader = new AirPollutionReader2();
        server.addObserver(reader);

        // 3. 메인 스레드는 일정 시간 대기 후 서버 종료 요청
        try {
            Thread.sleep(duration * 1000 * 5); // 5번 주기만큼 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. 미세먼지 농도 변경 스레드 종료
        server.stopThread();

        try {
            serverThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main program terminated.");
    }
}
