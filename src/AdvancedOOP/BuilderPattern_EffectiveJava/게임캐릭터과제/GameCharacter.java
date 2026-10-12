package AdvancedOOP.BuilderPattern_EffectiveJava.게임캐릭터과제;

public class GameCharacter {
    private final String name;
    private final String job;

    private final int strength;
    private final int agility;
    private final int intelligence;
    private final String weapon;
    private final String armor;

    private GameCharacter(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.strength = builder.strength;
        this.agility = builder.agility;
        this.intelligence = builder.intelligence;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, 체력 = %d, 민첩성 = %d, 지능 = %d, 무기 = %s, 갑옷 = %s",
                name, job, strength, agility, intelligence, weapon, armor);
    }

    public static class Builder {
        private final String name;
        private final String job;

        private int strength = 10;
        private int agility = 10;
        private int intelligence = 20;
        private String weapon = "Hands";
        private String armor = "Cloth";

        public Builder(String name, String job) {
            this.name = name;
            this.job = job;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder agility(int agility) {
            this.agility = agility;
            return this;
        }

        public Builder intelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public Builder weapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder armor(String armor) {
            this.armor = armor;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(this);
        }
    }
}
