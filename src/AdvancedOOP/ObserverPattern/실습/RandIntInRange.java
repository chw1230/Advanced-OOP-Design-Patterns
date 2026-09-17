package AdvancedOOP.ObserverPattern.실습;

import java.util.Random;

public class RandIntInRange {
    private static final Random random = new Random();

    public static int nextInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
