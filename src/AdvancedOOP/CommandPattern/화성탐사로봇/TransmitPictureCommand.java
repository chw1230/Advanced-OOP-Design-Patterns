package AdvancedOOP.CommandPattern.화성탐사로봇;

public class TransmitPictureCommand implements Command {
    private Rover rover;

    public TransmitPictureCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        if (rover != null) {
            rover.transmitPicture();
        }
    }
}
