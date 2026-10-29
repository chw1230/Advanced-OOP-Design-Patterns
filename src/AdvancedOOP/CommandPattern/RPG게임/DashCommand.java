package AdvancedOOP.CommandPattern.RPG게임;

public class DashCommand implements Command {
    private Player player;

    public DashCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.dash();
    }

    @Override
    public void undo() {
        player.cancelDash();
    }
}
