import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Main2 {
    public static void main(String[] args) {
       String filePath = "src/excersise.properties";
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream(filePath)) {
            // プロパティファイルを読み込む
            properties.load(input);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            // コンソールに表示
            System.out.println("username=" + username);
            System.out.println("password=" + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}