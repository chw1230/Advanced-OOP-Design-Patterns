package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// ConcreteProduct
public class PushNotifier extends AbstractNotifier {
    final String s = "App Push";

    @Override
    protected void send() {
        System.out.println(s);
    }
}
