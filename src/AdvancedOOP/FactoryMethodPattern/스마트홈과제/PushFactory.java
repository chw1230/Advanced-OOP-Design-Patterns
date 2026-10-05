package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// ConcreteFactory
public class PushFactory implements NotiFactory {
    @Override
    public AbstractNotifier create() {
        return new PushNotifier();
    }
}
