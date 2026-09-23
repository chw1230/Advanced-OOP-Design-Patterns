package AdvancedOOP.DecoratorPattern.디스플레이실습;

public abstract class Display {
    private int height;
    private int width;

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void drawHorizontalBorderLine() {
        System.out.print("+");
        for (int i = 0; i < getWidth() - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public abstract void show();
}
