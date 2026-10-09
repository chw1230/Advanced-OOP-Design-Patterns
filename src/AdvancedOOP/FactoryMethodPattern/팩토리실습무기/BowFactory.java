package AdvancedOOP.FactoryMethodPattern.팩토리실습무기;

public class BowFactory implements Factory{
    @Override
    public Weapon create() {
        return new Bow();
    }
}
