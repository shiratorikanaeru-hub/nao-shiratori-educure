// 必要なインポート文を記載
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        // 商品名と在庫数を管理するHashMapを作成
        Map<String,Integer>merchandise=new HashMap<>();
        // 商品を入荷（在庫を追加）
        merchandise.put("おにぎり",15);
        merchandise.put("サンドイッチ",8);
        merchandise.put("お弁当",5);
        // 現在の在庫状況を表示
        System.out.println("在庫状況:"+merchandise);
        // おにぎりを1個販売
        if (merchandise.containsKey("おにぎり")) {
            int currentStock = merchandise.get("おにぎり");
            merchandise.put("おにぎり", currentStock - 1);
        }
        System.out.println("おにぎりを1個販売しました");
        // 更新後の在庫状況を表示
        System.out.println("在庫状況: "+merchandise);
        // アイスクリームの在庫確認
        boolean hasIceCream = merchandise.containsKey("アイスクリーム");
        System.out.println("アイスクリームは在庫がありますか？: " + hasIceCream);
    }
} 