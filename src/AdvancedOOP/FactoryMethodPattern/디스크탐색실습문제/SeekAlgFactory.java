package AdvancedOOP.FactoryMethodPattern.디스크탐색실습문제;

import AdvancedOOP.StrategyPattern.실습.SeekStrategy;

import java.util.HashMap;
import java.util.Map;

// 이름과 공장을 짝지어 주는 역할 - 실습에서의 ShapeFactory2와 같은 역할!
public class SeekAlgFactory {
    private static final Map<String, Factory> map = new HashMap<>();

    static {
        map.put("fcfs", new FCFSFactory());
        map.put("sstf", new SSTFFactory());
        map.put("scan", new ScanFactory());
    }

    public SeekStrategy createSeekAlg(String name) {
        Factory factory = map.get(name.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown algorithm: " + name);
        }
        return factory.create();
    }
}
