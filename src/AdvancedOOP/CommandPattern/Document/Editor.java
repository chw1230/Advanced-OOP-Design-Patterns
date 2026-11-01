package AdvancedOOP.CommandPattern.Document;

import java.util.ArrayDeque;
import java.util.Deque;

// Invoker
public class Editor {
    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();

    public void run(Command c) {
        c.execute();
        undoStack.push(c);
        redoStack.clear();
    }

    public void undo() {
        if ( undoStack.isEmpty() ) {
            System.out.println("undoStack is empty");
            return;
        }
        Command c = undoStack.poll();
        c.undo();
        redoStack.push(c);
    }

    public void redo() {
        if ( redoStack.isEmpty() ) {
            System.out.println("redoStack is empty");
            return;
        }
        Command c = redoStack.poll();
        c.execute();
        undoStack.push(c);
    }
}
