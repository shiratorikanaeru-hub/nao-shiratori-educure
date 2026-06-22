// 必要なインポート文を記載
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        // 戦闘履歴を管理するArrayList（重複あり）
        ArrayList<String> battleHistory = new ArrayList<>();
        // 発見したモンスターを管理するHashSet（重複なし）
        LinkedHashSet<String> discoveredMonsters = new LinkedHashSet<>();
        // 全モンスターのリスト
        ArrayList<String> allMonsters = new ArrayList<>(Arrays.asList("スライム","ドラゴン","ゴブリン","フェニックス","ユニコーン"));
        // モンスターとの遭遇をシミュレート
        for(int i=0;i<5;i++){
            battleHistory.add("スライム");
        }

        for(int i=0;i<2;i++){
            battleHistory.add("ドラゴン");
        }

        for(int i=0;i<2;i++){
            battleHistory.add("ゴブリン");
        }
        // 戦闘履歴を記録
        discoveredMonsters.addAll(battleHistory);
        // 発見済みモンスターを表示
        System.out.println("発見済みモンスター: " + discoveredMonsters);
        System.out.println("発見済みモンスター数:"+discoveredMonsters.size());
        // スライムとの戦闘回数を計算
        int slimeCount = 0;
        for (String monster : battleHistory) {
            if (monster.equals("スライム")) {
                slimeCount++;
            }
        }
        System.out.println("スライムとの戦闘回数: " + slimeCount);
        // 未発見のモンスターを計算
        ArrayList<String> undiscovered = new ArrayList<>();
        for (String monster : allMonsters) {
            if (!discoveredMonsters.contains(monster)) {
                undiscovered.add(monster);
            }
        }
        System.out.println("未発見のモンスター: " + undiscovered);
    }
}