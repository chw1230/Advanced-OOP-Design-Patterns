package AdvancedOOP.CommandPattern.RPG게임;

public class HealCommand implements Command {
    private Player player;

    public HealCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.heal();
    }

    @Override
    public void undo() {
        player.cancelHeal();
    }
}
