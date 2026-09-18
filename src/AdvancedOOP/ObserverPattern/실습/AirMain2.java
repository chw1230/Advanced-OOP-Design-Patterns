package AdvancedOOP.ObserverPattern.실습;

public class AirMain2 {
    public static void main(String[] args) {
        final int duration = 5;
        // 미세 먼지 농도 변경 스레드 실행
        AirPollutionServer2 server = new AirPollutionServer2(duration);
        Thread serverThread = new Thread(server);
        serverThread.start();

        // 2. 리더(Observer) 1과 2를 생성 후 서버에 등록
        AirPollutionReader2 reader1 = new AirPollutionReader2(1);
        server.addObserver(reader1);
        AirPollutionReader2 reader2 = new AirPollutionReader2(2);
        server.addObserver(reader2);

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("rm observer1");
                server.removeObserver(reader1);
            } else if (i == 4) {
                System.out.println("register observer1 again");
                server.addObserver(reader1);
            }
            try {
                Thread.sleep(duration * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        serverThread.interrupt();
    }
}
