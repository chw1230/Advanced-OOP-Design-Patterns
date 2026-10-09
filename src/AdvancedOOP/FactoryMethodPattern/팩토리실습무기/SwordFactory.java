package AdvancedOOP.FactoryMethodPattern.팩토리실습무기;

public class SwordFactory implements Factory{
    @Override
    public Weapon create() {
        return new Sword();
    }
}
