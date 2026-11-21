package AdvancedOOP.Adapter.오리칠면조;

public class TurkeyAdapter implements Duck { // 1. 겉모습은 Duck ( target )
    Turkey turkey; // 2. Adaptee(Turkey)를 필드로 보관 - 품고 있음

    public TurkeyAdapter(Turkey turkey) { // 3. 생성자로 Adaptee( 감쌀 대상 ) 주입
        this.turkey = turkey;
    }

    public void quack() { // 4. quack() 요청을 gobble()로 변환!
        turkey.gobble();
    } // 실제 기능은 안에 있는 adaptee에서 한다.

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
