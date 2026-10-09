package AdvancedOOP.FactoryMethodPattern.팩토리실습무기;

public class GunFactory implements  Factory{
    @Override
    public Weapon create() {
        return new Gun();
    }
}
