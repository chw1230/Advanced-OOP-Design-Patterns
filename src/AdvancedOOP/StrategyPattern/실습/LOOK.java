package AdvancedOOP.StrategyPattern.실습;

import java.util.Arrays;

public class LOOK implements SeekStrategy {

    @Override
    public String getName() {
        return "LOOK";
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

        // start보다 작은 값들 → 내림차순 (0 방향으로 이동)
        for (int i = idx - 1; i >= 0; i--) {
            System.out.printf("%d ", tempQueue[i]);
        }
        // SCAN과의 유일한 차이: 여기서 "0 "을 찍지 않음 → 끝까지 안 가고 바로 방향 전환

        // start보다 큰 값들 → 오름차순
        for (int i = idx; i < tempQueue.length; i++) {
            System.out.printf("%d ", tempQueue[i]);
        }
        System.out.printf("\n");
    }
}
