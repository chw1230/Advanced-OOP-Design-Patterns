package AdvancedOOP.CommandPattern.화성탐사로봇;

import java.util.ArrayDeque;
import java.util.Queue;

// Invoker
public class MRO {
    private Queue<Command> q;

    public MRO() {
        q = new ArrayDeque<Command>();
    }

    public void addCommand(Command command) {
        q.offer(command);
    }

    public void executeAllCommands() {
        while (!q.isEmpty()) {
            Command command = q.poll();
            command.execute();
        }
        System.out.println("실행 결과를 전송!");
    }

}
