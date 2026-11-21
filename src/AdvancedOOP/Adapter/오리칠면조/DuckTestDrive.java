package AdvancedOOP.Adapter.오리칠면조;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey); // 칠면조를 Duck 어댑터로 감쌈!

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter); // testDuck은 Duck인 줄 알고 그대로 호출!
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}



