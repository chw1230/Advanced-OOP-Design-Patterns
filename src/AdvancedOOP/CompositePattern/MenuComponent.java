package AdvancedOOP.CompositePattern;

// Component - 공통 인터페이스 => Menu와 MenuItem이 함께 쓰는 메서드를 전부 선언함
public interface MenuComponent {
    public default void add(MenuComponent comp) {
        throw new UnsupportedOperationException();
    }

    public default void remove(MenuComponent comp) {
        throw new UnsupportedOperationException();
    }

    public default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public default String getName() {
        throw new UnsupportedOperationException();
    }

    public default String getDescription() {
        throw new UnsupportedOperationException();
    }

    public default double getPrice() {
        throw new UnsupportedOperationException();
    }

    public default boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public default void print() {
        throw new UnsupportedOperationException();
    }
}

/*
MenuItem과 Menu를 같은 MenuComponent로 다룬다면 인터페이스에 양쪽의 메서드를 모두 선언해야 하는데
이때 기본 구현을 예외 발생으로 해두면, 각 클래스에서는 자기 역할에 맞는 메서드만 선택해서 오버라이드하면 되고,
지원하지 않는 동작을 시도하는 경우에는 명확히 예외를 던지도록 한다.
 */
