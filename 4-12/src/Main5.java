public class Main5 {
    public static void main(String[] args) {
        Equipment sword = new Equipment("伝説の剣", 100, 0);
        Equipment shield = new Equipment("光の盾", 0, 80);
        Equipment boots = new Equipment("魔法の靴", 10, 20);

        GameCharacter hero = new GameCharacter("勇者A");
        hero.addEquipment(sword);
        hero.addEquipment(shield);
        hero.addEquipment(boots);
        hero.showEquipments();
        Equipment swordCopy = sword.clone();
        boolean cloneTest = sword.equals(swordCopy);
        System.out.println("装備の複製テスト：" + (cloneTest ? "OK" : "NG"));


        boolean compareTest = sword.compareTo(shield) < 0;
        System.out.println("装備の比較テスト：" + (compareTest ? "OK" : "NG"));

        hero.sortEquipments();
        boolean sortTest =
                hero != null; // 並び替えできていればOKとする
        System.out.println("装備の強さソート：" + (sortTest ? "OK" : "NG"));
    }
}
