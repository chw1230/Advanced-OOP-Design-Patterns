package AdvancedOOP.CommandPattern.redoUndo;

import java.util.ArrayDeque;
import java.util.Deque;

// Invoker : 커맨드를 실행하는 클래스 - 실행하는 커맨드의 작업 내용을 알지는 못함
public class Invoker {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void press(Command c) {
        c.execute(); // 실행시, undo 할 것 하나 생기니까
        undoStack.push(c); // undoStack에 하나 추가하기
        redoStack.clear(); // 새로운 작업 실행( press )시 rStack을 clear하는 이유는
        // redo는 undo 작업을 되돌리는 것이기에 새로운 작업이 생기면 undo한 동작이 없기 때문에 rStack을 clear하는 것
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
