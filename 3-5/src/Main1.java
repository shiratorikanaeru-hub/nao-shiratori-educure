public class Main1 {
    public static void main(String[] args) {
        Weapon w=new Weapon("魔法の剣", 50);
        GameCharacter c=new GameCharacter("剣士アレックス", 100, w);
        System.out.println(c.name+"は"+c.weapon.name+"を装備してます");
    }
}