package AdvancedOOP.CommandPattern.산술연산;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> list;

    public CommandManager() {
        list = new ArrayList<Command>();
    }

    public void addOperation(Command op) {
        list.add(op);
    }

    public void performOperation() {
        for (Command op : list) {
            op.execute();
        }
    }
}
