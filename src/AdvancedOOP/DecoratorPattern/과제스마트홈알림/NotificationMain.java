package AdvancedOOP.DecoratorPattern.과제스마트홈알림;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class NotificationMain {
    public static void main(String[] args) {
        // 가장 먼저 기본 알림 띄우기
        Notification noti = new BasicNotification();

        // 데코레이터를 배열(리스트)에 저장하기
        // 데코레이터는 생성자에 "감쌀 객체"가 있어야 만들 수 있는데,
        // 무엇을 감쌀지는 랜덤으로 뽑은 뒤에야 정해지므로 객체를 미리 만들어 둘 수 없음!!
        // 그래서 객체 대신 "데코레이터를 만드는 방법(람다식)"을 저장해두기!!
        //
        // Function<Notification, Notification>은  Notification을 받아서 Notification을 돌려주는 함수 타입을 의미한다!!
        // n -> new TemperatureNotification(n) : n을 받으면 n을 감싼 온도 알림을 만들어 돌려준다
        //   - 이 줄에서는 new가 실행되지 않고 방법만을 저장!!!!
        //   - 실제 생성은 나중에 apply(noti)를 호출하는 순간 일어남!!!
        // apply는 n에 noti를 넣고, 그 n을 감싼 새 데코레이터 객체를 결과로 돌려주는 메서드임!
        List<Function<Notification, Notification>> decorators = new ArrayList<>();
        decorators.add(n -> new TemperatureNotification(n));
        decorators.add(n -> new HumidityNotification(n));
        decorators.add(n -> new SecurityNotification(n));
        decorators.add(n -> new PowerUsageNotification(n));

        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            int pick = r.nextInt(decorators.size());

            noti = decorators.get(pick).apply(noti);
        }
        noti.show();
    }
}
