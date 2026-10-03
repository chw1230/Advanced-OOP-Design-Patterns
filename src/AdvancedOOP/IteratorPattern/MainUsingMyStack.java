package AdvancedOOP.IteratorPattern;

public class MainUsingMyStack {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>(); // Iterable - MyStack() 생성
        for (int i = 1; i <= 10; i++) {
            intStack.push(i);
        }

        System.out.println("Iterator 사용");
        /* Iterator<Integer> it = intStack.iterator();
        while (it.hasNext()) { // it 자료구조에서 다음께 존재하나 확인
            System.out.println(it.next()); // 존재한다면 다음 요소를 꺼내기 ( 다음으로 옮겨가기 )
        }*/

        // 아레의 for-each 문은 위의 코드 처럼 작동함!!!
        for (Integer n : intStack) {
            System.out.print(n + " ");
        }

        System.out.println("\nPop 사용");
        while (!intStack.isEmpty()) {
            int n = intStack.pop();
            System.out.print(n + " ");
        }

        System.out.printf("\n스택이 비었는지 확인: %s\n", intStack.isEmpty());
    }
}
