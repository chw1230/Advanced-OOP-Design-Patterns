package AdvancedOOP.CommandPattern.화성탐사로봇;

public class CollectSampleCommand implements Command {
    private Rover rover;

    public CollectSampleCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if (rover != null) {
            rover.collectSample();
        }
    }
}
