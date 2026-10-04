package AdvancedOOP.FactoryMethodPattern.도형넓이실습;

import java.util.HashMap;
import java.util.Map;

// 이름과 공장을 짝지어 주는 역할
public class ShapeFactory2 {
    private static final Map<String, ShapeFactory1> map = new HashMap<>();

    // 정적 초기화 블럭
    static {
        map.put("rectangle", new RectangleFactory1());
        map.put("ellipse", new EllipseFactory1());
    }

    public static ShapeFactory1 getFactory(String name) {
        return map.get(name.toLowerCase());
    }
}
