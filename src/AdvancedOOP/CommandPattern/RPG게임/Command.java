package AdvancedOOP.CommandPattern.RPG게임;

public interface Command {
    public void execute();
    public void undo(); // undo를 추가하기
}
