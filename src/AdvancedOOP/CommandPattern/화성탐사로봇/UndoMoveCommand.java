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

    // 실제 move의 undo가 아니라 그냥 -1 만큼 이동하는 concrete command를 의미
}
