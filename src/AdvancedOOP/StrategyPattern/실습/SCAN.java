package AdvancedOOP.StrategyPattern.실습;

import java.util.Arrays;

public class SCAN implements SeekStrategy {
    @Override
    public String getName() {
        return "SCAN";
    }

    @Override
    public void process(int[] queue, int start) {
        int[] tempQueue = new int[queue.length];
        for (int i = 0; i < queue.length; i++) {
            tempQueue[i] = queue[i];
        }
        Arrays.sort(tempQueue);
        int idx = -1;
        for (int i = 0; i < tempQueue.length; i++) {
            if (tempQueue[i] > start) {
                idx = i;
                break;
            }
        }
        for (int i = idx - 1; i >= 0; i--) {
            System.out.printf("%d ", tempQueue[i]);
            System.out.print("0 "); // 끝에 도달했음을 표시
        }
        for (int i = idx; i < tempQueue.length; i++) {
            System.out.printf("%d ", tempQueue[i]);
        }
        System.out.printf("\n");
    }
}
