package AdvancedOOP.StrategyPattern.과제;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random Random = new Random();
        Context context = new Context();

        for (int i = 0; i < 5; i++) {
            int n = Random.nextInt(30000);

            if (n <= 9999) {
                // sunny
                context.setStrategy(new SunnyDayStrategy());
            } else if (n <= 19999) {
                // rainy
                context.setStrategy(new RainyDayStrategy());
            } else {
                // windy
                context.setStrategy(new WindyDayStrategy());
            }
            context.deliver("제주도");

        }

    }
}
