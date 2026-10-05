package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// ConcreteProduct
public class SMSNotifier extends AbstractNotifier {
    final String s = "SMS 발송";

    @Override
    protected void send() {
        System.out.println(s);
    }
}
