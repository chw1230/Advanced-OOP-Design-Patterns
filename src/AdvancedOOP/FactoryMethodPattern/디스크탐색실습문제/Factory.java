package AdvancedOOP.FactoryMethodPattern.디스크탐색실습문제;

import AdvancedOOP.StrategyPattern.실습.SeekStrategy;

public interface Factory {
    SeekStrategy create();
}



// product와 concreteProduct 부분은 기존에
/* 실습에서 구현한 것을 가져와서 그대로 사용하면 된다!
SeekStrategy가 Product가 되고!
나머지 FCFS등의 알고리즘 들이 ConcreteProduct가 되는 거!
 */