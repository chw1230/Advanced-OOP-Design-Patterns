package AdvancedOOP.CommandPattern.화성탐사로봇;

public class TakePictureCommand implements Command {
    private Rover rover;

    public TakePictureCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if (rover != null) {
            rover.takePictures();
        }
    }
}
