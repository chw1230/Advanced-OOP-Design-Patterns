package AdvancedOOP.BuilderPattern_EffectiveJava.일정관리프로그램실습;

import java.time.LocalDateTime;

public class Event {
    private final String title;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final String location;
    private final String description;
    private final boolean alarm;

    // 빌더에 있는 것들로 자신을 채움
    private Event(Builder builder) {
        this.title = builder.title;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.location = builder.location;
        this.description = builder.description;
        this.alarm = builder.alarm;
    }

    @Override
    public String toString() {
        String result = "제목: " + title + "\n시작: " + startTime + "\n종료: " + endTime;
        if (!location.equals("")) {
            result += "\n장소: " + location;
        }
        if (!description.equals("")) {
            result += "\n설명: " + description;
        }
        result += "\n알림: " + (alarm ? "ON" : "OFF");
        return result;
    }

    public static class Builder {
        // 필수
        private final String title;
        private final LocalDateTime startTime;

        // 선택 - 기본값 넣기
        private LocalDateTime endTime;
        private String location = "";
        private String description = "";
        private boolean alarm = false;

        // 필수 요소 생성자 + endTime 기본값 설정 요수사항 만족하기
        public Builder(String title, LocalDateTime startTime) {
            this.title = title;
            this.startTime = startTime;
            this.endTime = startTime.plusMinutes(30);
        }

        // 선택 요소들 필드 이름과 동일하게 작성하지만 사실상 setter와 같음
        // 자기 자신 객체를 반환 -> 메서드 체이닝 가능
        public Builder endTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder location(String location) {
            this.location = location;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder alarm(boolean alarm) {
            this.alarm = alarm;
            return this;
        }

        // 지금까지 채운 빌더(this)를 넘겨서 완성된 Event를 생성해 반환
        public Event build() {
            return new Event(this);
        }
    }
}
