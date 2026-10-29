package AdvancedOOP.CommandPattern.화성탐사로봇;

public class MoveCommand implements Command {
    private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if (rover != null) {
            rover.move(1);
        }
    }
}
