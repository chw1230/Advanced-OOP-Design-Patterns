package AdvancedOOP.StrategyPattern.실습;

public interface SeekStrategy {
    String getName();
    // 우리가 구현하려는 알고리즘들이 어떤 것을 공통으로 필요로 하는 지를 보면 어떤 값을 매개변수로 가져야 하는 지 알 수 있음
    void process(int[] queue, int start);
}
