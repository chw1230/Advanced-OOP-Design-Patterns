package AdvancedOOP.CommandPattern.redoUndo;

public class Main {
    public static void main(String[] args) {
        Light l = new Light();
        Invoker i = new Invoker();
        i.press(new LightOnCmd(l));
        i.press(new LightOffCmd(l));
        i.undo();
        i.redo();
        i.undo();
        i.undo();
        i.undo();
    }
}


/*
실행 결과

전등 On -> LightOnCmd의 execute 실행의 결과  /  undoStack: [LightOnCmd] redoStack: []

전등 Off -> LightOffCmd의 execute 실행의 결과  /  undoStack: [LightOffCmd, LightOnCmd] redoStack: []

전등 On -> undoStack에 있는 LightOffCmd의 undo 실행의 결과  /  undoStack: [LightOnCmd] redoStack: [LightOffCmd]

전등 Off -> redoStack에 있는 LightOffCmd의 execute의 결과  /  undoStack: [LightOffCmd, LightOnCmd]  redoStack: []

전등 On -> redo로 인해 다시 undoStack에 들어간 LightOffCmd의 undo 실행의 결과  /  undoStack: [LightOnCmd]  redoStack: [LightOffCmd]

전등 Off -> undoStack에 있는 LightOnCmd의 undo 실행의 결과  /  undoStack: []  redoStack: [LightOnCmd, LightOffCmd]

되돌릴 명령 없음 -> undoStack에 아무것도 없어서 해당 결과 출력  /  undoStack: []  redoStack: [LightOnCmd, LightOffCmd]
 */