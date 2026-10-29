package AdvancedOOP.CommandPattern.RPG게임;

public class MacroCommand implements Command {
    private Player player;
    private Command fireballCommand;
    private Command healCommand;
    private Command dashCommand;

    public MacroCommand(Player player, Command fireballCommand, Command healCommand, Command dashCommand) {
        this.player = player;
        this.fireballCommand = fireballCommand;
        this.healCommand = healCommand;
        this.dashCommand = dashCommand;
    }

    @Override
    public void execute() {
        fireballCommand.execute();
        healCommand.execute();
        dashCommand.execute();
    }

    @Override
    public void undo() { // 실행한 순서의 반대로 취소
        dashCommand.undo();
        healCommand.undo();
        fireballCommand.undo();
    }
}
