package AdvancedOOP.Adapter.Enumeration_Iterator;

import java.util.Iterator;
import java.util.Vector;

// Iterator를 사용하는 예제 코드
public class Iterator1 {
    public static void printIterator(Iterator it) {
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        Iterator it = v.iterator();
        Iterator1.printIterator(it);
    }
}
