package AdvancedOOP.CommandPattern.Document;

public class AppendCmd implements Command {
    private final Document doc;
    private final String s;

    public AppendCmd(Document d, String s) {
        this.doc = d;
        this.s = s;
    }

    @Override
    public void execute() {
        doc.append(s);
    }

    @Override
    public void undo() {
        doc.deleteLast(s.length());
    }
}
