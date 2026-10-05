package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// Product의 역할
public abstract class AbstractNotifier {
    // 탬플릿 메서드를 사용해야겠는디?
    // 템플릿 메서드: 순서를 고정 - notiUser()가 순서 고정
    public final void notiUser() {
        prepareMessage(); // 공통 1
        send(); // 따로 - 하위 클래스가 구현
        logNotification(); // 공통 2
    }

    // 공통 1 이니까 여기에서 구현
    private void prepareMessage() {
        System.out.println("메시지 준비");
    }

    // 따로 - 하위에서 구현
    protected abstract void send();

    // 공통 2 이니까 여기에서 구현
    private void logNotification() {
        System.out.println("로그에 기록");
    }
}
