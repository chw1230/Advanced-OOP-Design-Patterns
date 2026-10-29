package AdvancedOOP.CommandPattern.화성탐사로봇;

public class MacroRoverCommand implements Command {
    private Rover rover;
    private Command moveCmd;
    private Command collectSampleCmd;
    private Command takePictureCmd;
    private Command transmitPictureCmd;
    public MacroRoverCommand(Rover rover, Command move,
                             Command collect, Command take,
                             Command transmit) {
        this.rover = rover;
        moveCmd = move;
        collectSampleCmd = collect;
        takePictureCmd = take;
        transmitPictureCmd = transmit;
    }

    @Override
    public void execute() {
        moveCmd.execute();
        collectSampleCmd.execute();
        takePictureCmd.execute();
        transmitPictureCmd.execute();
    }
}
