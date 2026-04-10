public class Main2 {
    public static void main(String[] args) {
        Player sm=new Player("勇者", 30);
        HealingPotion s=new HealingPotion();
        sm.displayInfo();
        s.heal(sm);
        System.out.println("プレイヤーのHP:"+sm.hp);
    }
}