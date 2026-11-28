package AdvancedOOP.CommandPattern.redoUndo;

// Command : 실행할 명령을 추상화한 인터페이스
public interface Command {
    void execute();
    void undo();
}
