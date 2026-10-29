package AdvancedOOP.CommandPattern.IoT버튼;

public class IoTButtonInvoker {
    private Command clickCmd;
    private Command doubleCmd;
    private Command longPressCmd;

    public void setClickCmd(Command clickCmd) {
        this.clickCmd = clickCmd;
    }

    public void setDoubleCmd(Command doubleCmd) {
        this.doubleCmd = doubleCmd;
    }

    public void setLongPressCmd(Command longPressCmd) {
        this.longPressCmd = longPressCmd;
    }

    // ------
    // 아래 3개의 메서드들은 기능 실행만 시키고, 어떤 기능을 구체적으로 하는지 모름!
    public void click() {
        if ( clickCmd != null ) {
            clickCmd.execute();
        }
    }

    public void doubleClick() {
        if ( doubleCmd != null ) {
            doubleCmd.execute();
        }
    }

    public void longPress() {
        if (longPressCmd != null ) {
            longPressCmd.execute();
        }
    }
}
