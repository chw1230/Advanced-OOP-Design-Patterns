package AdvancedOOP.BuilderPattern_EffectiveJava.게임캐릭터과제;

public class GameCharacterMain {
    public static void main(String[] args) {
        GameCharacter gameCharacter1 = new GameCharacter.Builder("현우1", "용사").build();
        System.out.println(gameCharacter1);

        GameCharacter gameCharacter2 = new GameCharacter.Builder("현우2", "용사")
                .strength(20)
                .agility(90).
                intelligence(50).
                weapon("axe").
                armor("robe").
                build();
        System.out.println(gameCharacter2);
    }
}
