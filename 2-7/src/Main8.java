import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        System.out.println("攻撃力を入力してください："); 
        String attackPower = scanner.nextLine();
        int attack = Integer.parseInt(attackPower); 
        System.out.println("防衛力を入力してください：");
        String difencepower = scanner.nextLine();
        int difence = Integer.parseInt(difencepower); 
        scanner.close();
        int damage =attack-difence;
        System.out.println("通常ダメージ:"+damage);
        double criticalHit =damage*1.5;
        int hit =(int)criticalHit;
        System.out.println("クリティカルダメージ:"+hit);
    }
}