package AdvancedOOP.FactoryMethodPattern.팩토리실습무기;

import java.util.HashMap;
import java.util.Map;

// 무기 타입 이름과 공장을 짝지어 주는 역할
public class WeaponFactoryRegistry {
    private static final Map<String, Factory> map = new HashMap<>();

    // 정적 초기화 블럭
    static {
        map.put("sword", new SwordFactory());
        map.put("bow", new BowFactory());
        map.put("gun", new GunFactory());
    }

    public static Factory getFactory(String type) {

        return map.get(type.toLowerCase());
    }
}