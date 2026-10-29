package AdvancedOOP.CommandPattern.IoT버튼;

public class TurnOffTvCmd implements Command {
    private Tv tv;

    public TurnOffTvCmd(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if ( tv != null ) {
            tv.off();
        }
    }
}
