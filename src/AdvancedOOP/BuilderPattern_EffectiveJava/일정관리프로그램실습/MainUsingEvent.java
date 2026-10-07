package AdvancedOOP.BuilderPattern_EffectiveJava.일정관리프로그램실습;

import java.time.LocalDateTime;

public class MainUsingEvent {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // 필수만
        // new Event.Builder() -> Builder가 static inner class라서 이렇게 사용 가능
        Event event1 = new Event.Builder("기상📢⏰", now)
                .build();
        System.out.println(event1 + "\n");

        // 옵션 추가해보기
        // 옵션 메서드 체이닝 과정에서 순서 지키지 않아도 괜찮음
        // 비우고 싶은 것은 메서드 입력하지 않고 넘어가면 됨
        Event event2 = new Event.Builder("기상📢⏰", now)
                .description("일어날 시간")
                .endTime(now.plusHours(1))
                .location("우리 집")
                .alarm(true)
                .build();
        System.out.println(event2 + "\n");
    }
}
