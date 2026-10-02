package AdvancedOOP.Iterator;

import java.util.Iterator;
import java.util.List;

// 역할 : ConcreteIterator - 순회할 데이터와 현재 위치를 기억한다.
// Iterator<E>의 필수 메서드인 hasNext(), next()를 구현
public class MyStackIterator<E> implements Iterator<E> {
    private int index;
    private List<E> list;

    public MyStackIterator(List<E> list) {
        this.list = list;

        // stack을 구현하기 때문에 스택의 top부터 꺼내기
        index = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public E next() {
        E o = list.get(index);
        index--;
        return o;
    }
}
