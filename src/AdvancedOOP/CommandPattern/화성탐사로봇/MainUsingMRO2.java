package AdvancedOOP.CommandPattern.화성탐사로봇;

public class MainUsingMRO2 {
    public static void main(String[] args) {
        MRO mro = new MRO(); // Invoker
        Rover rover = new Rover(); // Receiver
        Command moveCmd = new MoveCommand(rover);
        Command collectSampleCmd = new CollectSampleCommand(rover);
        Command takePictureCmd = new TakePictureCommand(rover);
        Command transmitPictureCmd = new TransmitPictureCommand(rover);
        Command undoMoveCmd = new UndoMoveCommand(rover);
        Command macroCmd = new MacroRoverCommand(rover, moveCmd, collectSampleCmd, takePictureCmd, transmitPictureCmd);
        System.out.println("Move와 Undo 실행");
        mro.addCommand(moveCmd);
        mro.addCommand(undoMoveCmd);
        mro.executeAllCommands();
        System.out.println("\n매크로 명령 실행");
        mro.addCommand(macroCmd);
        mro.executeAllCommands();
    }
}
