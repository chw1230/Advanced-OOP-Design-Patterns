package AdvancedOOP.CommandPattern.산술연산;

public class SubtractValueCommand implements Command {
    private Calc calc;
    private int x, y;

    public SubtractValueCommand(Calc calc, int x, int y) {
        this.calc = calc;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        if ( calc != null ) {
            calc.minus(x, y);
        }
    }
}
