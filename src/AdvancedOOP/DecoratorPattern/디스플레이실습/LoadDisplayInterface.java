package AdvancedOOP.DecoratorPattern.디스플레이실습;

import java.util.List;

// 파일을 읽고 각 줄에 있는 내용을 리스트로 구성해서 반환함
public interface LoadDisplayInterface {
    public List<String> load();
}