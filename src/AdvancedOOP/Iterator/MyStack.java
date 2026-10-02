package AdvancedOOP.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 역할 : ConcreteAggregate - 실제 데이터를 저장하는 자료구조
// iterator()로 반복자를 생성하는 Iterable!!
// 덕분에 for-each 문에서 사용할 수 있음
public class MyStack<E> implements Iterable<E> {
    private List<E> list;

    public MyStack() {
        list = new ArrayList<E>();
    }
    public void push(E o) {
        list.add(o);
    }
    public E pop() {
        E element = list.get((list.size() - 1));
        list.remove(list.size() - 1);
        return element;
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // 해당 자료구조를 순회할 반복자를 생성해서 반환
    // Iterable 인터페이스의 필수 구현 메서드
    // for - each 문이 내부적으로 이 메서드를 호출
    @Override
    public Iterator<E> iterator() {
        return new MyStackIterator<>(list);
    }
}
