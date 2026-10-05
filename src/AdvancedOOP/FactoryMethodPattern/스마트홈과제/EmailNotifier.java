package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// ConcreteProduct
public class EmailNotifier extends AbstractNotifier {
    final String s = "email 발송";

    @Override
    protected void send() {
        System.out.println(s);
    }
}
