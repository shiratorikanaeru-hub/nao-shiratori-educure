import java.io.FileReader;
import com.google.gson.Gson;
public class Main4 {
    public static void main(String[] args) {
        try {
            // JSONファイルを読み込む
            FileReader reader = new FileReader("src/excersise.json");
            // Gsonオブジェクトを作成
            Gson gson = new Gson();
            // JSONをEmployeeオブジェクトに変換
            Employee employee = gson.fromJson(reader, Employee.class);
            // 情報を表示
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
