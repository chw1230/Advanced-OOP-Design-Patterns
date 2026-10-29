package AdvancedOOP.CommandPattern.산술연산;

public class AddValueCommand implements Command {
    private Calc calc;
    private int x, y;

    public AddValueCommand(Calc calc, int x, int y) {
        this.calc = calc;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        if ( calc != null ) {
            calc.plus(x, y);
        }
    }
}
