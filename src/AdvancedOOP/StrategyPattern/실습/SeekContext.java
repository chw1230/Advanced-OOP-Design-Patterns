package AdvancedOOP.StrategyPattern.실습;

// 이 클래스는 어떤 알고리즘인지 모른 채 위임만 한다
public class SeekContext {
    private SeekStrategy seekStrategy;

    // setter
    public void setSeekStrategy(SeekStrategy strategy) {
        this.seekStrategy = strategy;
    }

    public void seek(int[] queue, int start) {
        seekStrategy.process(queue, start);
    }
}
