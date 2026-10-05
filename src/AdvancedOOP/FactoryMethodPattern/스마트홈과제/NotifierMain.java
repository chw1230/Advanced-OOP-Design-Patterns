package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// Client
public class NotifierMain {
    public static void main(String[] args) {
        // 어떤 Notifier를 만들지는 공장이 결정 - Main은 NotiFactory와 AbstractNotifier 타입만 알면 됨!
        // 일단 이것도 DIP 위반이기는 함 수업에서 배웃 것 처럼 정적 초기화 블럭 사용하는 코드로 하면 DIP 피할 수는 있겠따!
        NotiFactory[] factories = {new EmailFactory(), new SMSFactory(), new PushFactory()};

        for (NotiFactory factory : factories) {
            AbstractNotifier notifier = factory.create();
            notifier.notiUser(); // 준비 -> 전송 -> 로그
            System.out.println("---------------------------------------");
        }
    }
}
