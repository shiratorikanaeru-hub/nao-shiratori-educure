import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        System.out.println("攻撃力を入力してください："); 
        String attackPower = scanner.nextLine();
        int attack = Integer.parseInt(attackPower); 
        System.out.println("防御力を入力してください：");
        String defensePower = scanner.nextLine();
        int defense = Integer.parseInt(defensePower); 
        scanner.close();
        int damage =attack-defense;
        System.out.println("通常ダメージ:"+damage);
        double criticalHit =damage*1.5;
        int hit =(int)criticalHit;
        System.out.println("クリティカルダメージ:"+hit);
    }
}