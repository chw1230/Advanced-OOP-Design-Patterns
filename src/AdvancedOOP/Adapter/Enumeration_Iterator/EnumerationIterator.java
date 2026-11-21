package AdvancedOOP.Adapter.Enumeration_Iterator;

import java.util.Enumeration;
import java.util.Iterator;

// 어뎁터의 역할
public class EnumerationIterator implements Iterator { // 겉보습이 Iterator ( target )
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements(); // hasNext -> hasMoreElements
    }

    @Override
    public Object next() {
        return enumeration.nextElement(); // next -> nextElement
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(); // Adaptee에 없는 기능 - 예외로 반환
    }
}
