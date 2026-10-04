package AdvancedOOP.FactoryMethodPattern.디스크탐색실습문제;

import AdvancedOOP.StrategyPattern.실습.SSTF;
import AdvancedOOP.StrategyPattern.실습.SeekStrategy;

public class SSTFFactory implements Factory{
    @Override
    public SeekStrategy create() {
        return new SSTF();
    }
}
