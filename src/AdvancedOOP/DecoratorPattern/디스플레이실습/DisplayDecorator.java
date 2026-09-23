package AdvancedOOP.DecoratorPattern.디스플레이실습;

public abstract class DisplayDecorator extends Display {
    // protected : 같은 패키지 + 다른 패키지의 자식 클래스에서도 접근 가능
    protected Display display;

    public DisplayDecorator(Display display, int width, int height) {
        super(width, height);
        this.display = display;
    }
}
