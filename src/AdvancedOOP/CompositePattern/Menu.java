package AdvancedOOP.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

// 자식들을 ArrayList에 담고, print 때 자식에서 print를 다시 위임
public class Menu implements MenuComponent {
    ArrayList menuComponents = new ArrayList();  // 자식 컴포넌트들(MenuItem + 하위 Menu) 보관
    String name;
    String description;

    public Menu(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public void add(MenuComponent comp) {
        menuComponents.add(comp);
    }

    public void remove(MenuComponent comp) {
        menuComponents.remove(comp);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // 핵심 : 자식들을 Iterator로 순회하며 재귀적으로 print() 호출!
        Iterator it = menuComponents.iterator();
        while (it.hasNext()) {
            MenuComponent component = (MenuComponent) it.next();
            component.print();
        }
    }
}