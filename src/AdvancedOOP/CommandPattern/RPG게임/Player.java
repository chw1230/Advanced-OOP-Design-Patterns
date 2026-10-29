package AdvancedOOP.CommandPattern.RPG게임;

// Receiver
public class Player {
    public void fireball() {
        System.out.println("파이어볼 사용");
    }

    // undo
    public void cancelFireball() {
        System.out.println("파이어볼 취소");
    }

    public void heal() {
        System.out.println("체력회복");
    }

    // undo
    public void cancelHeal() {
        System.out.println("체력회복 취소");
    }

    public void dash() {
        System.out.println("전방으로 돌진");
    }

    // undo
    public void cancelDash() {
        System.out.println("돌진 취소");
    }
}
