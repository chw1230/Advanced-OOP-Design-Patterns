package AdvancedOOP.CompositePattern;

// 클라이언트, 루트 하나만 들고 있다가 print 딱 한번 호출
public class Waitron {
    MenuComponent allMenus;

    public Waitron(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();   // 최상위 루트 하나만 print() 호출!
    }
}
