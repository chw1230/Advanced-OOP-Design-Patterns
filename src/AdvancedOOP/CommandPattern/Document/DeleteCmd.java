package AdvancedOOP.CommandPattern.Document;

public class DeleteCmd implements Command {
    private final Document doc; // Receiver
    private final int n; // 삭제 단어 글자수
    private String removed = ""; // 지운 단어를 알아야 undo에서 단어에 지운거를 붙여줄 수 있음!

    public DeleteCmd(Document doc, int n) {
        this.doc = doc;
        this.n = n;
    }

    @Override
    public void execute() {
        removed = doc.deleteLast(n);
    }

    @Override
    public void undo() {
        doc.append(removed); // 지운 것을 다시 붙임!
    }
}
