package AdvancedOOP.DecoratorPattern.디스플레이실습;

public class TitleDisplay extends Display {
    private String title;

    TitleDisplay(String title, int width, int height) {
        super(width, height);
        this.title = title;
    }

    @Override
    public void show() {
        drawHorizontalBorderLine();
        System.out.println(title);
        drawHorizontalBorderLine();
    }
}