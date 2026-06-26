import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameCharacter {
    private String name;
    private List<Equipment> equipments;
    public GameCharacter(String name) {
        this.name = name;
        this.equipments = new ArrayList<>();
    }
    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }
    public void showEquipments() {
        System.out.println("--- キャラクター装備情報 ---");
        System.out.println(name + "の装備：");
        for (int i = 0; i < equipments.size(); i++) {
            System.out.println((i + 1) + ". " + equipments.get(i));
        }
        System.out.println();
    }
    public void sortEquipments() {
        Collections.sort(equipments);
    }
}
