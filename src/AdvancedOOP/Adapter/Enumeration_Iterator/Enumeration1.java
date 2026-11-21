package AdvancedOOP.Adapter.Enumeration_Iterator;

import java.util.Enumeration;
import java.util.Vector;

/*
자바 초창기 컬렉션에서 원소를 하나씩 꺼낼 때 사용하던 옜날 인터페이스
나중에 컬렉션 프레임워크를 통해서 새로운 인터페이스 Iterator가 생겼음

매칭 관계
Enumeration의 hasMoreElements() = Iterator의 hasNext()
Enumeration의 nextElement() = Iterator의 next()
Enumeration의 원소 삭제 존재하지 않음 / Iterator의 remove() 존재

역할 관계
Target  (Client가 사용하려는 인터페이스) : Iterator
Adaptee ( 이미 존재하고 기능을 갖고 있지만, 메서드 규격이 Target과 달라서 Client가 바로 쓸 수 없는 인터페이스(또는 클래스)) : Enumeration
Adapter	(Target의 메서드 호출을 받아서 Adaptee의 메서드 호출로 바꿔 실행하는 클래스) : EnumerationIterator
Client (Target 인터페이스를 통해 기능을 사용하는 코드) : printIterator(Iterator it)
 */

// Enumeration 사용해보는 코드
public class Enumeration1 {
    public static void printEnumeration(Enumeration e) {
        while (e.hasMoreElements()) {
            System.out.println("" + e.nextElement());
        }
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        Enumeration e = v.elements();
        Enumeration1.printEnumeration(e);
    }
}
