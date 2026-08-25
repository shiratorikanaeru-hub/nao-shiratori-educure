import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main1 {
    public static void main(String[] args) {
        String fileName = "excersise.csv";
        // CSVファイルを読み込む
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // ヘッダー行をスキップ
            br.readLine();
            // データの1行目を取得
            String line = br.readLine();
            // 読み込んだ行が存在するか確認
            if (line != null) {
                // カンマで分割
                String[] data = line.split(",");
                // 各要素を表示
                for (String value : data) {
                    System.out.println(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}