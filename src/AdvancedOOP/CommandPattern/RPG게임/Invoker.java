package AdvancedOOP.CommandPattern.RPG게임;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands; // 실행한 목록들 여기에 담기

    public Invoker() {
        this.commands = new ArrayList<Command>();
    }

    public void executeCommand(Command command) {
        command.execute(); // 바로 실행
        commands.add(command); // 실행한 목록에 담기
    }

    public void undo() {
        if (commands.isEmpty()) {
            System.out.println("취소할 스킬이 없습니다.");
            return;
        }
        Command last = commands.remove(commands.size() - 1); // 가장 마지막에 실행한 것을 취소(undo)하기
        last.undo();
    }
}
