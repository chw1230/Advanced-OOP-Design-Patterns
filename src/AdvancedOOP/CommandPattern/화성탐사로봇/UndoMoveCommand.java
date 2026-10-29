package AdvancedOOP.CommandPattern.화성탐사로봇;

public class UndoMoveCommand implements Command {
    private Rover rover;

    public UndoMoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if ( rover != null ) {
            rover.move(-1);
        }

    }
}
