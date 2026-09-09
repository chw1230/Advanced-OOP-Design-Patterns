package AdvancedOOP.StrategyPattern.실습;

public class SSTF implements SeekStrategy {
    @Override
    public String getName() {
        return "SSTF";
    }

    @Override
    public void process(int[] queue, int start) {
        int curPos = start;
        int readCount = 0; // 읽은(처리한) 위치의 개수
        boolean[] read = new boolean[queue.length];
        for (int i = 0; i < read.length; i++) {
            read[i] = false;
        }
        while (readCount < read.length) {
            int shortestIdx = -1;
            int minDist = Integer.MAX_VALUE;
            for (int i = 0; i < queue.length; i++) {
                if (read[i] == false) {
                    int distance = Math.abs(queue[i] - curPos);
                    if (distance < minDist) {
                        shortestIdx = i;
                        minDist = distance;
                    }
                }
            }
            curPos = queue[shortestIdx];
            read[shortestIdx] = true;
            readCount++;
            System.out.printf("%d ", curPos);
        }
        System.out.printf("\n");
    }
}
