package AdvancedOOP.FactoryMethodPattern.디스크탐색실습문제;

import AdvancedOOP.StrategyPattern.실습.FCFS;
import AdvancedOOP.StrategyPattern.실습.SeekStrategy;

public class FCFSFactory implements Factory {
    @Override
    public SeekStrategy create() {
        return new FCFS();
    }
}
