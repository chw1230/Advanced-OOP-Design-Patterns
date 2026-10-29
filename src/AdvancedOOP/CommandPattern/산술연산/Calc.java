package AdvancedOOP.CommandPattern.산술연산;

// Receiver
public class Calc {
    public void plus(int x, int y ){
        System.out.println(x + y);
    }

    public void minus(int x, int y ){
        System.out.println(x - y);
    }

    public void multiply(int x, int y) {
        System.out.println(x * y);
    }

    public void divide(int x, int y) {
        if (y == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println(x / y);
    }

    public void square(int x) {
        System.out.println(x * x);
    }
}
