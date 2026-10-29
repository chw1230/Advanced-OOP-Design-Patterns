package AdvancedOOP.CommandPattern.RPG게임;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(); // Receiver
        Invoker invoker = new Invoker(); // Invoker

        Command fireball = new FireballCommand(player);
        Command heal = new HealCommand(player);
        Command dash = new DashCommand(player);
        Command macro = new MacroCommand(player, fireball, heal, dash);

        System.out.println("--- 스킬 사용 ---");
        invoker.executeCommand(fireball);
        invoker.executeCommand(heal);
        invoker.executeCommand(dash);

        System.out.println("--- undo ---");
        invoker.undo();

        System.out.println("--- macro ---");
        invoker.executeCommand(macro);

        System.out.println("--- macro undo ---");
        invoker.undo();
    }
}
