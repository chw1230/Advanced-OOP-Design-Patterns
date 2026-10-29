package AdvancedOOP.CommandPattern.RPG게임;

public class FireballCommand implements Command {
    private Player player;

    public FireballCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.fireball();
    }

    @Override
    public void undo() {
        player.cancelFireball();
    }
}
