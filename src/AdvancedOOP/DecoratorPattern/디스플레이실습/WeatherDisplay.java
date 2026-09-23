package AdvancedOOP.DecoratorPattern.디스플레이실습;

public class WeatherDisplay extends DisplayDecorator {
    final String s = "섭씨 20도, 미세먼지 좋음";

    public WeatherDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public void show() {
        display.show();
        display.drawHorizontalBorderLine();
        System.out.println("Weather: " + s);
        display.drawHorizontalBorderLine();
    }
}
