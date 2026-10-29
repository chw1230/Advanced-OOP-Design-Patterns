package AdvancedOOP.CommandPattern.산술연산;

public class Main {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager(); // Invoker
        Calc calc = new Calc(); // Receiver
        int a = (int) (Math.random() * 45) + 1;
        int b = (int) (Math.random() * 45) + 1;

        Command addValueCommand = new AddValueCommand(calc, a, b);
        Command subtractValueCommand = new SubtractValueCommand(calc, a, b);
        Command multiplyValueCommand = new MultiplyValueCommand(calc, a, b);
        Command divideValueCommand = new DivideValueCommand(calc, a, b);
        Command squareValueCommand = new SquareValueCommand(calc, a);

        System.out.println("실행");
        commandManager.addOperation(addValueCommand);
        commandManager.addOperation(subtractValueCommand);
        commandManager.addOperation(multiplyValueCommand);
        commandManager.addOperation(divideValueCommand);
        commandManager.addOperation(squareValueCommand);
        commandManager.performOperation();
    }
}
