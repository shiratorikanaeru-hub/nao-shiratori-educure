import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 20;

        Scanner scanner = new Scanner(System.in);

        String[] english = new String[max];
        String[] japanese = new String[max];

        int count=0;

        while (true) {
             System.out.println("1: 単語を登録する");
             System.out.println("2: クイズを受ける");
             System.out.println("3: 終了する");

             String choice = scanner.nextLine();

             if (choice.length() != 1 || choice.charAt(0) < '1' || choice.charAt(0) > '3') {
                System.out.println("1-3の数字を入力してください");
                continue;
             }
             int choose = choice.charAt(0) - '0';
             
             if (choose==1) {
              if (count >= max) {
                System.out.println("登録可能な単語数は20個までです");
                continue;
             }
                System.out.print("英単語を入力してください: ");
                 english[count]=scanner.nextLine();

                System.out.print("日本語を入力してください: ");
                japanese[count] = scanner.nextLine();
                 count++;

                System.out.println("登録しました");

            }else if (choose==2) {
             if (count==0) {
                System.out.println("単語が登録されていません");
                continue;
            }
            int correct=0;

            for(int i=0; i<count; i++){
                System.out.println("問題: "+english[i]);
                System.out.print("日本語を入力してください: ");
                String answer=scanner.nextLine();

                if (answer.equals(japanese[i])) {
                    System.out.println("正解！");
                    correct++;
                }else{
                    System.out.println("不正解です");
                }
        }
        System.out.println(count+"問中"+correct+"問正解でした!");
       
            }else if (choose==3) {
                System.out.println("プログラムが終了します");
                break;
            }else{
                System.out.println("1-3の数字を入力してください");
            }
        }
        scanner.close();
    }
  }
