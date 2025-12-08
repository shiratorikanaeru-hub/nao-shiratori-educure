import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        System.out.println("現在の経験値を入力してください：");
        String expoint = scanner.nextLine();  
        int aexpoint = Integer.parseInt(expoint);  
        double bonus =aexpoint*1.25;
        int a=(int)bonus;
        System.out.println("ボーナス後の経験値："+a);
        scanner.close();
    }
}