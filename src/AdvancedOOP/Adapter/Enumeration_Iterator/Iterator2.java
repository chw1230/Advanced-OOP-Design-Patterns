package AdvancedOOP.Adapter.Enumeration_Iterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Iterator2 {
    public static void printIterator(Iterator it) { // Client: Iterator만 앎
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        Enumeration e = v.elements(); // Adaptee 객체
        EnumerationIterator it = new EnumerationIterator(e);  // 어댑터로 감싸기 / Enumeration을 Iterator로 바꾸기
        Iterator2.printIterator(it);
    }
}
