package AdvancedOOP.CommandPattern.IoT버튼;

public class TurnOnTvCmd implements Command {
    private Tv tv;

    public TurnOnTvCmd(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        if ( tv != null ) {
            tv.on();
        }
    }
}
