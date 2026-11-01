package AdvancedOOP.CommandPattern.Document;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Editor ed = new Editor();
        ed.run(new AppendCmd(doc, "Hello"));doc.show();
        ed.run(new AppendCmd(doc, " World"));doc.show();
        ed.run(new DeleteCmd(doc, 5));doc.show();
        ed.undo();doc.show();
        ed.undo();doc.show();
        ed.redo();doc.show();
    }
}
