package AdvancedOOP.DecoratorPattern.디스플레이실습;

import java.time.LocalDateTime;

public class TimeDisplay extends DisplayDecorator {

    public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public void show() {
        display.show();
        display.drawHorizontalBorderLine();
        System.out.println("Date: " + LocalDateTime.now());
        display.drawHorizontalBorderLine();
    }
}
