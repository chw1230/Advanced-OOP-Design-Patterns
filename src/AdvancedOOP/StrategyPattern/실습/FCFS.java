package AdvancedOOP.StrategyPattern.실습;

public class FCFS implements SeekStrategy {
    @Override
    public String getName() {
        return "FCFS";
    }

    @Override
    public void process(int[] queue, int start) {
        for (int i = 0; i < queue.length; i++) {
            System.out.printf("%d ", queue[i]);
        }
        System.out.printf("\n");
    }
}
