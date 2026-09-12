package AdvancedOOP.StrategyPattern.실습;

public class DiskSeekMain {
    public static void main(String[] args) {
        int[] queue = { 70, 153, 24, 57, 140, 15, 115, 80, 85 };
        int start = 43;

        SeekContext seekContext = new SeekContext();

        SeekStrategy[] algorithms = {new FCFS(), new SSTF(), new SCAN(), new LOOK()};

        for (SeekStrategy algorithm : algorithms) {
            System.out.println(algorithm.getName());
            seekContext.setSeekStrategy(algorithm);
            seekContext.seek(queue, start);
        }
    }
}
