package AdvancedOOP.FactoryMethodPattern.스마트홈과제;

// ConcreteFactory
public class EmailFactory implements NotiFactory {
    @Override
    public AbstractNotifier create() {
        return new EmailNotifier();
    }
}
