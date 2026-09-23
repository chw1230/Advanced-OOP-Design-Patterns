package AdvancedOOP.DecoratorPattern.디스플레이실습;

public class SpeedometerDisplay extends DisplayDecorator {
    final String speed = "50km/h";

    public SpeedometerDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public void show() {
        display.show();
        display.drawHorizontalBorderLine();
        System.out.println("Speed: " + speed);
        display.drawHorizontalBorderLine();
    }
}
