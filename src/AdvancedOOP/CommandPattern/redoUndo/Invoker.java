package AdvancedOOP.CommandPattern.redoUndo;

import java.util.ArrayDeque;
import java.util.Deque;

// Invoker - 버튼 역할!
public class Invoker {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void press(Command c) {
        c.execute();
        undoStack.push(c);
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("되돌릴 명령 없음");
            return;
        }
        Command c = undoStack.poll();
        c.undo();
        redoStack.push(c); // undo가 생셨으니 redo에 할 스택에 넣기

    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("되돌릴 명령 없음");
            return;
        }
        Command c = redoStack.poll();
        c.execute();
        undoStack.push(c);
    }
}
