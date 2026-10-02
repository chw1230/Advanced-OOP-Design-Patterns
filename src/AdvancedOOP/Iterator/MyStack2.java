package AdvancedOOP.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStack2<E> implements Iterable<E>{
    List<E> list;

    // Iterator인 MyStackIterator에서는 Iterable인 MyStack2의 list를 그대로 사용
    public class MyStackIterator implements Iterator<E> {
        private int index;

        public MyStackIterator() {
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

    public MyStack2() {
        list = new ArrayList<E>();
    }

    public void push(E e) {
        list.add(e);
    }
    public E pop() {
        E element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public Iterator<E> iterator() {
        return new MyStackIterator();
    }
}
