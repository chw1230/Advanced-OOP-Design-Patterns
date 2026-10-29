package AdvancedOOP.CommandPattern.산술연산;

public class SquareValueCommand implements Command {
    private Calc calc;
    private int x;

    public SquareValueCommand(Calc calc, int x) {
        this.calc = calc;
        this.x = x;
    }

    @Override
    public void execute() {
        if ( calc != null ) {
            calc.square(x);
        }
    }
}
